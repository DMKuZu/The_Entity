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
                \n\n\n
                       ███        ▄█    █▄       ▄████████         ▄████████ ███▄▄▄▄       ███      ▄█      ███     ▄██   ▄  \s
                   ▀█████████▄   ███    ███     ███    ███        ███    ███ ███▀▀▀██▄ ▀█████████▄ ███  ▀█████████▄ ███   ██▄\s
                      ▀███▀▀██   ███    ███     ███    █▀         ███    █▀  ███   ███    ▀███▀▀██ ███▌    ▀███▀▀██ ███▄▄▄███\s
                       ███   ▀  ▄███▄▄▄▄███▄▄  ▄███▄▄▄           ▄███▄▄▄     ███   ███     ███   ▀ ███▌     ███   ▀ ▀▀▀▀▀▀███\s
                       ███     ▀▀███▀▀▀▀███▀  ▀▀███▀▀▀          ▀▀███▀▀▀     ███   ███     ███     ███▌     ███     ▄██   ███\s
                       ███       ███    ███     ███    █▄         ███    █▄  ███   ███     ███     ███      ███     ███   ███\s
                       ███       ███    ███     ███    ███        ███    ███ ███   ███     ███     ███      ███     ███   ███\s
                      ▄████▀     ███    █▀      ██████████        ██████████  ▀█   █▀     ▄████▀   █▀      ▄████▀    ▀█████▀ \s
                                                                                                                          \s
                \n\n\n\n
                \t\t\t\t\t\t DEVELOPED BY: \n
                \t\t\t\t\t    John Winston W. Tabada \n
                \t\t\t\t\t     Aaron Rey A. Jacalan \n
                \t\t\t\t\t     Lovely Shane P. Ong \n
                \t\t\t\t\t     Ruhmer Jairus Espina \n
                \n
                \t\t\t\t\t\t     BACK
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
