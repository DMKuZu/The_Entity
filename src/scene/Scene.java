package scene;

import game.Game;
import gui.panel.input.InputListener;

import static game.WhichScene.*;

public abstract class Scene implements InputListener {
    protected Game GAME;

    protected Scene(Game GAME){
        this.GAME = GAME;
    }

    public void displayText(){
        GAME.getDISPLAY().displayText(displayText_Display());
        GAME.getCHOICE().displayText(displayText_Choice());
    }

    protected String displayText_Display() {
        return """




                           ███        ▄█    █▄       ▄████████         ▄████████ ███▄▄▄▄       ███      ▄█      ███     ▄██   ▄
                       ▀█████████▄   ███    ███     ███    ███        ███    ███ ███▀▀▀██▄ ▀█████████▄ ███  ▀█████████▄ ███   ██▄
                          ▀███▀▀██   ███    ███     ███    █▀         ███    █▀  ███   ███    ▀███▀▀██ ███▌    ▀███▀▀██ ███▄▄▄███
                           ███   ▀  ▄███▄▄▄▄███▄▄  ▄███▄▄▄           ▄███▄▄▄     ███   ███     ███   ▀ ███▌     ███   ▀ ▀▀▀▀▀▀███
                           ███     ▀▀███▀▀▀▀███▀  ▀▀███▀▀▀          ▀▀███▀▀▀     ███   ███     ███     ███▌     ███     ▄██   ███
                           ███       ███    ███     ███    █▄         ███    █▄  ███   ███     ███     ███      ███     ███   ███
                           ███       ███    ███     ███    ███        ███    ███ ███   ███     ███     ███      ███     ███   ███
                          ▄████▀     ███    █▀      ██████████        ██████████  ▀█   █▀     ▄████▀   █▀      ▄████▀    ▀█████▀












                                                                  1. START

                                                                  2. ATLAS

                                                                  3. CREDITS

                                                                  4. QUIT
                """;
    }

    protected String displayText_Choice() {
        return "Type the number or the word to get started!";
    }


    public void onInputReceived(String input) {
        switch (input.toLowerCase()) {
            case "1":
            case "start":
                System.out.println("Starting the game...");
                GAME.nextScene(CHOOSE_HERO);
                break;
            case "2":
            case "atlas":
                System.out.println("Opening Atlas...");
                GAME.nextScene(ATLAS);
                break;
            case "3":
            case "credits":
                System.out.println("Displaying Credits...");
                GAME.nextScene(CREDITS);
                break;
            case "4":
            case "exit":
                System.out.println("Exiting the application...");
                GAME.nextScene(EXIT);
                break;
            default:
                System.out.println("Invalid input: " + input);
                break;
        }
    }
}
