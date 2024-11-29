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
        As the enemy collapses, the world dissolves. A dull hum rises in your ears, and your vision blurs. Before you can comprehend what's happening, your body grows weightless, as if ethereal hands are drawing you away from reality. The battlefield melts into a vast, cosmic canvas—a swirling expanse of stars, shifting hues, and infinite darkness.
        
        A disembodied voice emerges from the void: "You have crossed a threshold beyond mortal understanding. The essence you carry resonates with an ancient power, yet it simultaneously constrains you."
        
        The cosmic darkness churns, birthing ephemeral shapes that refuse to solidify—gossamer wings dissolving into mist, shadowy hands stretching and contracting, a face composed entirely of light. The presence feels simultaneously infinite and incomprehensible, a being that defies complete perception.
        
        "This power belongs to no single entity," the voice declares. "I am here to illuminate its true cost."
        
        You look down. A faint orb hovers above your palm, pulsing with an unexpected warmth and an intricate, almost musical rhythm.
        
        "You stand at a critical juncture," the voice whispers, its tone undulating like a spectral breeze. "Surrender this essence to me, and I will grant you a temporary boon—a fleeting fragment of my power. Alternatively, decline, and continue your journey unenhanced. Remember: every choice is a key that locks as much as it opens."
        
        The luminescence fades. The cosmic landscape grows darker, more hushed.
        
        "What will you choose?"
        
        
        
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
        You Currently Have:\n
        ──> %d Essence
        ──> %d | 3 Favors
        
        
        
        
        What will you choose:\n
        > 1 : OFFER 1 ESSENCE
        > 2 : CONTINUE JOURNEY
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
