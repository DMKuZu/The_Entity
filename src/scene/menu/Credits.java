package scene.menu;

import game.Game;
import scene.Scene;

import static game.WhichScene.MENU;

public class Credits extends Scene {

    public Credits(Game GAME){
        super(GAME);
    }

    @Override
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






                                                                    DEVELOPED BY:

                                                                John Winston W. Tabada

                                                                 Aaron Rey A. Jacalan
                                                                  Lovely Shane P. Ong
                                                                Ruhmer Jairus R. Espina
                """;
    }

    protected String displayText_Choice() {
        return "Type BACK to return to the Main Menu.";
    }


    public void onInputReceived(String input) {
        switch (input.toLowerCase()) {
            case "back":
            case "":
                System.out.println("Going back to menu...");
                GAME.nextScene(MENU);
                break;
            default:
                System.out.println("Invalid input: " + input);
                break;
        }
    }
}
