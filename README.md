# SYSC3110DesignProject

<p align="center">
  <img src="https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fcdn-www.bluestacks.com%2Fbs-images%2Flogo239.png&f=1&nofb=1" />
</p>

The goal of this team project is to reproduce a simplified version of the classic strategy game RISK.


### Group 3

Authors

<p align="left">
  <img style= "vertical-align:middle" src="https://avatars0.githubusercontent.com/u/71227923?s=460&u=7eedc11732df85f6a08674179e0aab7b8496dcfd&v=4" width="50" height="50" />
    <a href="https://github.com/aelsammak">@aelsammak</a>
</p>
<p align="left">
  <img style= "vertical-align:middle" src="https://avatars1.githubusercontent.com/u/71864216?s=460&u=c6e4bb16b43a450708bcbcde6b76ede693bc7090&v=4" width="50" height="50" />
    <a href="https://github.com/Erik-Iuhas">@Erik-Iuhas</a>
</p>
<p align="left">
  <img style= "vertical-align:middle" src="https://avatars3.githubusercontent.com/u/47836939?s=460&u=5c135ae66ac6db71ca7d83a05209cc3db690716a&v=4" width="50" height="50" />
  <a href="https://github.com/nikolaspaterson">@nikolaspaterson</a>
</p>

TA(Carleton's Best)

[@MikeVezina](https://github.com/MikeVezina)


### Project Milestones

- [x] Milestone 1: Create a text-based playable game.
- [x] Milestone 2: Make game GUI based.
- [x] Milestone 3: Implement AI players and many more features!
- [ ] Milestone 4: Save/load game and custom maps

### Milestone 1 Deliverables
1. Readme :white_check_mark:
2. Source code + jar executable :white_check_mark:
3. UML Diagram :white_check_mark:
4. Documentaion :white_check_mark:

The readme file is used to describe our project and the roadmap ahead.
The source code consists of classes that work work together to make our text based game playable.
The UML diagram displays how our classes interact with one another.
We documented all of our code and provided a Word Document describing our choice in data structures.

### Milesstone 2 Deliverables
1. Readme :white_check_mark:
2. Design file :white_check_mark:
3. Unit tests :white_check_mark:
4. Source code :white_check_mark:
5. Documentation :white_check_mark:

### Milestone 3 Deliverables
1. Readme :white_check_mark:
2. Source code :white_check_mark:
3. Unit tests :white_check_mark:
4. Refined design :white_check_mark:
5. Removed 'smelly code' :white_check_mark:


### Milestone 4 Deliverables
1. Readme :x:
2. Source code :x:
3. Unit tests :x:
4. Documentation :x:


### Changes Made
#### Milestone 1
There were many changes made to this iteration of the progejct. Our UML was revised several times, classes were created, deleted and refactored and many bugs were squashed. Our group also changed, we unfortuantely had a member drop the course resulting in the remaining members to absorb a little extra work. We were able to fix many bugs and after long hours in voice calls we created a playable textbased version of RISK.

#### Milestone 2
In Milestone 2, we had to update the entire game to be GUI based so we went out to achieve the best looking game of RISK ever made, with 3 playable character in the roster and more to come. This version of the game has an easy to use interface which allows for players to clearly identify their owned territories and enemies with ease. Along with background music and a winning track, the game is bound to get Game of the Year.  

#### Milestone 3
Are you smarter than our AI? Thats right, in the third milestone we added an ai player that you can compete against. We also added implemented unit testing, this means we were able to fix any bugs that I player may abuse to get an unfair advantage.

### Known Issues
There still arent any known issues in our code. 

### Deliverables
**Old Scripts**
| Script | Author(s) |
| --- | --- |
| Command | Nikolas Paterson |
| CommandEnum | Nikolas Paterson |
| CommandParser | Nikolas Paterson |
| CommandWord | Nikolas Paterson |
| Game | Erik Iuhas, Nikolas Paterson |

**Models**
| Model | Author(s) |
| --- | --- |
| Dice | Ahmad El-Sammak |
| GameEvent | Ahmad El-Sammak |
| Player | Ahmad El-Sammak, Erik Iuhas |
| Game Model | Erik Iuhas, Nikolas Paterson, Ahmad El-Sammak |
| Territory | Ahmad El-Sammak, Erik Iuhas |
| Continent | Erik Iuhas, Nikolas Paterson, Ahmad El-Sammak |
| AIPlayer | Ahmad El-Sammak, Erik Iuhas, Nikolas Paterson |
| AttackResult | Ahmad El-Sammak |
| AITimer | Ahmad El-Sammak, Erik Iuhas, Nikolas Paterson |


**Views**
| View | Author(s) |
| --- | --- |
| GameView | Erik Iuhas |
| GameSetup | Erik Iuhas |
| StatusBar |	Erik Iuhas |
| AttackPopUp |	Ahmad El-Sammak |
| PlayerView | Erik Iuhas | 
| BackgroundPanel | Erik Iuhas |
| TerritoryButton |	Ahmad El-Sammak, Erik Iuhas |
| FortifyPopUp	| Nikolas Paterson |
| StartUpView |	Nikolas Paterson |
| PlayerSelectView |	Ahmad El-Sammak |
| PlayerSelectPanel	| Ahmad El-Sammak |
| ReinforcePopUp	| Nikolas Paterson |
| WinningScreenFrame | Ahmad El-Sammak|

**Controllers**
| Controller | Author(s) |
| --- | --- |
| AttackPopUpController | Ahmad El-Sammak  |
| FortifyPopUpController | Nikolas Paterson |
| GameController | Erik Iuhas |
| PlayerSelectController | Ahmad El-Sammak  |
| ReinforcePopUpController | Nikolas Paterson |
| StartUpController | Nikolas Paterson |
| TerritoryButtonController | Ahmad El-Sammak, Erik Iuhas|

**Unit Tests**
| Test | Author(s) |
| --- | --- |
| GameEventTest | Ahmad El-Sammak, Erik Iuhas, Nikolas Paterson |
| GameModelTest | Ahmad El-Sammak, Erik Iuhas, Nikolas Paterson |
| MockDice | Ahmad El-Sammak |
| MockGameEvent | Ahmad El-Sammak |

**Resources**
| Resource | Author(s) |
| --- | --- |
| TerritoryNeighbours.csv | Erik Iuhas |
| Map.png | Erik Iuhas |
| Chizzy.png | Erik Iuhas |
| TA.png | Erik Iuhas |
| Captain.png | Erik Iuhas |

**Event**

| Event | Author(s) |
| --- | --- |
| PlayerEvent | Ahmad El-Sammak, Erik Iuhas, Nikolas Paterson | 
| PlayerEvent | Ahmad El-Sammak, Erik Iuhas, Nikolas Paterson | 
| PlayerEvent | Ahmad El-Sammak, Erik Iuhas, Nikolas Paterson | 

**Listener**
| Interface | Author(s) | 
| --- | --- |
| PlayerListener | Ahmad El-Sammak, Erik Iuhas, Nikolas Paterson |
| TerritoryView | Ahmad El-Sammak, Erik Iuhas, Nikolas Paterson | 
| UserStatusListener | Ahmad El-Sammak, Erik Iuhas, Nikolas Paterson |

**Documentation**
| Document | Author(s) |
| --- | --- |
| README | Ahmad El-Sammak, Erik Iuhas, Nikolas Paterson |
| UML Diagram | Ahmad El-Sammak, Erik Iuhas, Nikolas Paterson |
| Sequence Diagrams | Ahmad El-Sammak, Erik Iuhas, Nikolas Paterson |
| Write Up | Ahmad El-Sammak, Erik Iuhas, Nikolas Paterson |

### Project Roadmap
Milestone 4! In the fourth milestone we are going to create a save and load feature so you can pick up your game at a different time. We are looking forward to implementing this feature because it will also allow the user to load in their very own custom maps! We are hopeful to finish the final milestone early so polish off the project and get a head start on studying for exams.

### Copyright matters
If you are interested in our game please check out its original insperation, [Risk: Global Domination](https://store.steampowered.com/app/1128810/RISK_Global_Domination/).
We are creating this game for educational purposes which falls under fair use.
If you have concerns about copyrighted material please contact one of the project creators.

See you again when we have completed Milestone 4! :metal:
