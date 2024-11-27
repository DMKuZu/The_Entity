package scene.event.offer;

import elements.creature.hero.Hero;
import game.Game;
import scene.event.Event;
import scene.event.operationClasses.Offer;

import static game.WhichScene.END;
import static game.WhichScene.SCENARIO;

public class _10_Trance extends Event {

    public _10_Trance(Hero HERO, int currWorld, int currEncounter, Game GAME){
        super(HERO,currWorld,currEncounter,GAME);
    }

    protected String displayText_Display(){
        return String.format(
        """                
        A fog of uncertainty descends, thick and impenetrable. Your mind, once a beacon of clarity, now trembles at the edges of comprehension. The path ahead twists like a serpent through landscapes of shadows and half-remembered dreams.
                
        Weariness seeps into your bones—an exhaustion that transcends physical fatigue. Your shoulders bend under an invisible burden of unspoken memories and forgotten promises.
                
        The chill begins as a whisper at your spine, a cold breath that defies temperature. Your consciousness is pulled into a trance so deep it feels like falling through infinite layers of reality.
                
        An ancient voice emerges from within: 'Remember your purpose,' it intones. 'The essence you've collected is the lifeblood of your destiny.'
                
        A vision erupts—a cosmic tapestry of luminescent energy. Countless threads weave intricate patterns, and amid this vast design, you recognize yourself: a single, integral thread in an incomprehensible pattern.
                
                
        Two paths crystallize:
                
        1. Offer the Essence: Surrender to The Being, completing a cycle older than time.
        
        2. Resist and Awaken: Break free, forging a unique trajectory against the cosmic current.
                
        The cosmic tapestry awaits your decision, each thread holding its breath in anticipation.
                
        Now, what will you choose?
        
        
        [ YOUR CURRENT FAVOR INVENTORY ] :
        %s
        """
        , HERO.getFAVOR().favorDesc()
        );
    }

    protected String displayText_Choice() {
        int essence = HERO.getESSENCE();
        int favorSize = HERO.getFAVOR().getFavorSize();

        return String.format("""
        You have %d essence and %d | 3 Favors.
        
        > 1 : Offer     -> 1 essence for 1 favor
        > 2 : Continue  -> Next encounter
        """,essence,favorSize);
    }

    public void onInputReceived(String input){
        switch (input.toLowerCase()){
            case "1":
            case "offer":
                if(HERO.getESSENCE() > 0){
                    System.out.println("Going to Offer...");
                    Offer market = new Offer(HERO,GAME);

                    if(HERO.getFAVOR().getFavorSize() < 3){
                        market.obtained();
                    }
                    else{
                        market.exchange();
                    }
                }
                else {
                    System.out.println("no more essence lil brokie...");
                }
                break;
            case "2":
            case "continue":
                if(currEncounter == 8){
                    System.out.println("Going to _9_World_End...");
                    GAME.nextScene(END);
                }
                else{
                    System.out.println("Going to scenario...");
                    GAME.nextScene(SCENARIO);
                }
                break;
            default:
                System.out.println("Invalid input: " + input);
        }
    }

}
