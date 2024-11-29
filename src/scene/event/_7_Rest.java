package scene.event;

import elements.creature.hero.Hero;
import game.Game;
import game.WhichScene;

import static game.WhichScene.SCENARIO;

public class _7_Rest extends Event{


    public _7_Rest(Hero hero, Game GAME) {
        super(hero, 69,7, GAME);
    }

    @Override
    protected String displayText_Display() {
        return String.format("""
            Congratulations, brave soul! You have journeyed far into this vast and treacherous world, overcoming trials that would have shattered lesser beings. Now, as you rest in a moment of respite, a rare opportunity has presented itself before you. You may choose to restore 30%% of your health, renewing your strength for the battles ahead, or replenish your dwindling abilities, ensuring your power remains unwavering. Yet, only one path can be taken. Choose with great care, for the decision you make now may shape the course of your journey.
            
            
            
            Take a deep breath and consider your options carefully:
            
            >> Would you prefer to heal your HP by 30 percent of your total HP, restoring some of your vitality?
            
            >> Or would you rather replenish your USES, allowing you to rely on your powerful abilities once again?
            
            
            
            Make your choice
            
            
            
            ──>  CURRENT STATS:  <── 
            >> [ HP: %d │ %d ]
            
            >> USES:
            %s
            """,
                HERO.getCURRSTATS().getHP(),
                HERO.getSTATS().getHP(),
                HERO.skillUses()
        );
    }


    @Override
    protected String displayText_Choice() {
        return """
               Type the number of your choice!
               
               >> 1 : Heal HP          -> Heal HP by 30% of total HP
               
               >> 2 : Replenish USES   -> Fully replenish skill USES
               """;
    }

    @Override
    public void onInputReceived(String input) {
        switch (input){
            case"1":
                System.out.println("Chose healing...");
                HERO.rest(true);
                GAME.nextScene(SCENARIO);
                break;
            case"2":
                System.out.println("Chose replenishing...");
                HERO.rest(false);
                GAME.nextScene(SCENARIO);
                break;
            default:
                System.out.println("Invalid input: " + input);
        }
    }
}
