package scene.event.operationClasses;

import elements.creature.hero.Hero;
import game.Game;
import scene.Scene;
import scene.event.Event;

import static game.WhichScene.*;

public class Offer extends Scene {
    private final Hero HERO;

    private String MSGdisplay;
    private String MSGchoice;
    private boolean hasObtained;

    public Offer(Hero HERO,Game GAME) {
        super(GAME);
        this.HERO = HERO;

        GAME.getINPUT().setInputListener(this);
    }


    public void obtained(){
        MSGdisplay = String.format("""
              You have obtained a favor from The Being!
              
              %s
              """,
              HERO.getFAVOR().offer().toString()
        );

        MSGchoice = "Press ENTER to continue";

        hasObtained = true;
        displayText();
    }

    public void exchange(){
        MSGchoice = """
              You Currently Have:\n
              ──> 3 | 3 Favors [FULL]
              
              
              
              Will you exchange a favor for a new one?
              
              >> 1 : EXCHANGE FAVOR 1
              >> 2 : EXCHANGE FAVOR 2
              >> 3 : EXCHANGE FAVOR 3
              
              >> 4 : GO BACK
              """;

        MSGdisplay = String.format("""
              Here is your current Favor Pool:
              
              
              %s
              """,
                HERO.getFAVOR().swapFavorDesc()
        );

        hasObtained = false;
        displayText();
    }

    private void exchanged(String msg){
        MSGdisplay = String.format("""
              You have exchanged a favor from The Being!
              
              New Favor:
              >> %s
              """,
                msg
        );

        MSGchoice = "Press ENTER to continue";

        hasObtained = true;
        displayText();
    }

    protected String displayText_Display() {
        return MSGdisplay;
    }

    protected String displayText_Choice() {
        return MSGchoice;
    }

    public void onInputReceived(String input) {
        if(hasObtained){
            HERO.useESSENCE();

            GAME.nextScene(TRANCE);
        }
        else{
            switch (input.toLowerCase()){
                case "1":
                case "2":
                case "3":
                    int favorNum = Integer.parseInt(input);
                    String msg = HERO.swapFavor(favorNum);
                    exchanged(msg);
                    break;
                case "4":
                case "back":
                    System.out.println("Going to _10_Trance...");
                    GAME.nextScene(TRANCE);
                    break;
                default:
                    System.out.println("Invalid input: " + input);
            }
        }
    }
}
