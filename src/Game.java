import java.util.*;

public class Game {
    private int currentPlayerTurn;
    private ArrayList<Player> playerList;
    private CommandParser commandParser;

    public Game(){
        playerList = new ArrayList<>();
        printWelcome();
        playerSetUp();
        commandParser = new CommandParser();
        playGame();
    }

    public Player getPlayerTurn(){
        return playerList.get(currentPlayerTurn-1);
    }

    /**
     * Turns are done in a sequence, when last player
     * takes their turn the sequence restarts from the beginning
     */
    public void nextTurn(){
        if(currentPlayerTurn == playerList.size()){
            currentPlayerTurn = 1;
        }else{
            currentPlayerTurn++;
        }
        checkPlayerStanding();
        GameEvent gameevent = new GameEvent(playerList.get(currentPlayerTurn-1));
        gameevent.troopsReceived(gameevent.getPlayer());
    }

    public void checkPlayerStanding(){
        for (Player player : playerList){
            if(player.getTerritoriesOccupied().isEmpty()){
                playerList.remove(player);
            }
        }
    }

    public void findWinner(){
        if(playerList.size() == 1) {
            System.out.println(playerList.get(0) + " won the game!");
            commandProcessor(new Command("quit"));
        }
    }

    public void playGame(){
        boolean gameInProgress = false;
        while(!gameInProgress){
            Command cmd = commandParser.getCommand();
            gameInProgress = commandProcessor(cmd);
        }
        System.out.println("Game is over");
    }

    private boolean commandProcessor(Command cmd){
        CommandWord commandWord = new CommandWord();
        boolean wantsToQuit = false;
        CommandEnum command = commandWord.getCommandAction(cmd.getCommandAction());

        switch(command){
            case UNKNOWN:
                System.out.println("Unknown command, you can type 'help' to see all commands");
                break;

            case HELP:
                printHelp();
                break;

            case QUIT:
                wantsToQuit = quit(cmd);
                break;

            case REINFORCE:
                reinforce(cmd);
                break;

            case ATTACK:
                attack(cmd);
                break;

            case FORTIFY:
                fortify(cmd);
                break;

            case SKIP:
                nextTurn();
                break;

            case WORLDMAP:
                showWorldMap();
                break;

            case MYMAP:
                showMyMap();
                break;
        }
        return wantsToQuit;
    }

    public void showWorldMap(){
        for(Player pl: playerList){
            System.out.print(pl.toString());
        }
    }

    public void showMyMap(){
        System.out.print(getPlayerTurn().toString());
    }

    public void reinforce(Command cmd){
        if(cmd.getCommandTarget() != null && cmd.getCommandNumber() != null){
            GameEvent gameevent = new GameEvent(getPlayerTurn());
            Player player = getPlayerTurn();
            Territory territory = player.getTerritoriesOccupied().get(cmd.getCommandOrigin());
            gameevent.reinforce(territory, Integer.parseInt(cmd.getCommandNumber()));
        }
    }

    public void attack(Command cmd){

        if(cmd.getCommandTarget() != null && cmd.getCommandOrigin() != null){
            try{
                GameEvent gameevent = new GameEvent(getPlayerTurn());
                Player player = getPlayerTurn();
                Territory attackingTerritory = player.getTerritoriesOccupied().get(cmd.getCommandOrigin());
                Territory defendingTerritory = attackingTerritory.getNeighbours().get(cmd.getCommandTarget());
                gameevent.attack(attackingTerritory, defendingTerritory, Integer.parseInt(cmd.getCommandNumber()));
            }catch(NullPointerException e){
                System.out.println("Please enter a neighbouring territory that is owned by a different player");
            }
        }
    }

    public void fortify(Command cmd){
        if(cmd.getCommandTarget() != null && cmd.getCommandNumber() != null){
            GameEvent gameevent = new GameEvent(getPlayerTurn());
            Player player = getPlayerTurn();
            Territory territory = player.getTerritoriesOccupied().get(cmd.getCommandTarget());
            Territory territory2 = player.getTerritoriesOccupied().get(cmd.getCommandOrigin());
            gameevent.fortify(territory,territory2, Integer.parseInt(cmd.getCommandNumber()));
        }
    }

    /**
     * initializes playerList
     * @param nPlayers
     */
    public void setPlayers(int nPlayers){
        for(int i = 1; i <= nPlayers; i++){
            playerList.add(new Player("Player " + i));
        }
        GameSetup gameSetup = new GameSetup(playerList);
        currentPlayerTurn = 1;
        GameEvent gameevent = new GameEvent(playerList.get(currentPlayerTurn-1));
        gameevent.troopsReceived(gameevent.getPlayer());
    }

    /**
     * asks for number of players, must be less than 8.
     */
    public void playerSetUp(){

        try{
            Scanner inScanner = new Scanner(System.in);
            System.out.println("Please type the number of players you want: ");
            String playerNumber = inScanner.nextLine();
            int pn = Integer.parseInt(playerNumber);
            if(pn > 6 || pn < 2 ){
                throw new NumberFormatException();
            }else{
                setPlayers(pn);
            }
        }catch(NumberFormatException e){
            System.out.println("Please enter a number between 2 and 6");
            playerSetUp();
        }
    }

    /**
     * Print welcome message and calls playerSetUp
     */
    public void printWelcome(){
        System.out.println("Welcome to RISK: Global Domination!");
        System.out.println("Your goal is to battle your friends and conquer the world.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
    }

    public void printHelp(){
        System.out.println();
        System.out.println("Here are your available commands, ");
        for(CommandEnum command: CommandEnum.values()){
            if(!command.equals(CommandEnum.UNKNOWN)){
                System.out.println(command);
            }
        }
        System.out.println();
    }

    private boolean quit(Command command)
    {
        if(command.getCommandOrigin() != null){
            System.out.println("Quit what?");
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Game g = new Game();
    }

}
