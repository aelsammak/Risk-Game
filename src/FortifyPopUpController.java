import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FortifyPopUpController implements ActionListener {

    private final FortifyPopUp popup;
    private final GameEvent ge;

    public FortifyPopUpController(FortifyPopUp fortifyPopUp){
        this.popup = fortifyPopUp;
        ge = new GameEvent(popup.getPlayer());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt(popup.getTroops().getText());

        if(e.getSource().equals(popup.getPlusButton())){
            if(x < popup.getTerritoryToLoseTroops().getTroops() - 1){
                x++;
            }
            popup.setTroops(x);
        }else if(e.getSource().equals(popup.getMinusButton())){
            if(x > 1){
                x--;
            }
            popup.setTroops(x);
        }else if(e.getSource().equals(popup.getFortifyButton())){
            ge.fortify(popup.getTerritoryToLoseTroops(), popup.getTerritoryToGainTroops(), Integer.parseInt(popup.getTroops().getText()));
            popup.setVisible(false);
        }
    }
}