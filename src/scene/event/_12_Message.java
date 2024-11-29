package scene.event;

import elements.blessing.Blessing;
import elements.blessing.Blessing_Gacha;
import elements.creature.hero.Hero;
import game.Game;


import static game.WhichScene.*;

public class _12_Message extends Event {
    private final boolean hasWon;
    private final Blessing_Gacha REWARD;

    public _12_Message(Hero HERO, boolean hasWon, int currWorld ,int currEncounter,Blessing_Gacha REWARD, Game GAME){
        super(HERO,currWorld,currEncounter,GAME);
        this.hasWon = hasWon;
        this.REWARD = REWARD;
    }

    public _12_Message(Hero HERO, boolean hasWon, int currWorld, int currEncounter,Game GAME){
        super(HERO,currWorld,currEncounter,GAME);
        this.hasWon = hasWon;
        this.REWARD = null;
    }

///applyBlessing sa hero and refreshEncounter sa hero
    @Override
    protected String displayText_Display() {
        if(hasWon){
            if(currWorld == 4) {
                return String.format("""
                        The clash was relentless, the realm itself shuddering with each blow, every strike a desperate effort against an entity that seemed to consume light itself. Yet, against overwhelming odds, %s landed a decisive blow. A resounding crack echoed through the air as the entity recoiled, its once-menacing form flickering with weakness.
                        
                        Breathless, %s watched as the dark figure faltered, bending under the force of the strike. For a fleeting moment, hope ignited—a fragile belief that this might finally be the end, that the countless sacrifices and shattered lands could find peace.
                        
                        But then, an insidious chuckle rose from the entity, soft and mocking at first, growing until it filled the realm. Its flickering form straightened, darkness rippling outward in waves. A malevolent grin split its face as glowing eyes locked on the warrior.
                        
                        "Did you think a single blow would end me?" its voice dripped with scorn. "I am boundless. Power is my very essence. Every strike you land only makes me stronger."
                        
                        A crackling aura surrounded the entity, its strength visibly returning as despair weighed heavily on %s. "Fight as long as you like," it sneered. "You will weaken. I will not."
                        
                        %s wavered as the grim truth settled in: this foe was unrelenting, regenerating with each strike, a cycle that could only end in exhaustion and defeat. Yet, amidst the despair, a spark of defiance flared. There was another way—a desperate, final act to sever the link binding the entity to its power, even at a terrible cost.
                        
                        With weary resolve, %s began channeling every last ounce of strength into a singular purpose—not to fight, but to separate, to tear free from the connection sustaining the entity’s regeneration. The air grew heavy as the effort intensified, the void itself seeming to resist.
                        
                        The entity's mocking tone shifted, unease creeping into its voice. "What are you doing?" it demanded. "You cannot escape me!"
                        
                        Ignoring the entity’s growing panic, %s severed the final thread. A shockwave rippled outward as the entity screamed, its form unraveling, left adrift in its own void. %s surged through the rift, breaking free from the entity’s dark realm.
                        
                        The world shifted. Shadows receded, replaced by the bleak, broken landscape of Erotoma. Red skies loomed over jagged, corrupted terrain, remnants of the chaos still visible. Familiarity stirred as footsteps carried %s to a small, untouched house at the edge of town.
                        
                        Inside, silence reigned. The air was stale but tinged with the faintest trace of what life had once been. Slowly, %s moved through the house, fingers brushing over walls and memories. In a familiar room, a bed awaited, untouched, as though left just for this moment.
                        
                        Sitting on the edge, the weight of the battle pressed down—each sacrifice, every loss a sharp reminder of what had been endured. Lying back, %s stared at the cracked ceiling, fragments of memories surfacing: friends, loved ones, all torn away by the entity’s corruption.
                        
                        Victory had come, but at a cost that could never be undone. The world was free, yet irreparably scarred, and so too was the warrior. With a final exhale, eyes closed, surrendering to a bittersweet solitude—a quiet life amidst the ruins of a once-whole home.
                        """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()

                );
            }
            Blessing blessing = REWARD.gacha(currEncounter);
            int essence = switch (currEncounter) {
                case 1, 2, 4, 5 -> 1;
                case 3, 6 -> 2;
                default -> 3;
            };

            HERO.add_essence(essence);
            HERO.add_blessing(blessing);
            HERO.refresh_encounter();

            return String.format(
                    """
                        Your weapon arcs through the air with deadly precision, a perfect fusion of skill and determination driving the blow. The impact is decisive, finding its mark with an almost poetic finality. The foe before you falters, its strength ebbing away as the weight of your strike overwhelms it. A guttural cry escapes—a sound of defiance and despair—before it crumbles, defeated, to the ground. The battle is over, and you stand victorious, your resolve unshaken.
                            
                        As the echoes of combat fade, the land itself seems to stir in recognition of your triumph. The air grows still, and an almost imperceptible hum of energy begins to resonate around you. You feel it in your bones—a deep, primal connection to the earth beneath your feet. The very essence of the world acknowledges your strength, bending to your will. A radiant glow envelops you, and you sense a surge of power coursing through your being. The land gifts you [ %d essence ], a tangible reward for your victory, empowering you to shape the world as you see fit.
                            
                        But the rewards do not end there. As the essence fills you, a divine presence makes itself known. A warm, ethereal light descends, bathing you in its glow. You feel the blessing of [ %s ] take hold, its power intertwining with your own. This gift is more than a mere token—it is a sign of your growing influence and the destiny that awaits you. The land and the divine alike have recognized your potential, and their favor will serve as a guiding force in the battles to come.
                            
                        Standing amidst the aftermath of your victory, you cannot help but feel the weight of your accomplishments. The vanquished enemy lies behind you, the path ahead illuminated by newfound power and divine favor. The tides of destiny are shifting, and you are at their center, ready to seize what lies ahead.
                            
                            
                            
                        [ YOU HAVE WON THE BATTLE ]
                                   
                                               
                                               
                        YOU HAVE GAINED:
                        >> %d Essence
                        >> %s
                            
                        """,
                    essence, blessing.toString(), essence, blessing.toString()
            );
        }
        else{
            return
                    """
                    You fall to your knees, the oppressive weight of your enemy's corrupted energy crashing over you like an unrelenting wave. It claws at your mind, a suffocating force that fills the air with a rancid bitterness, making each breath a struggle. Your limbs tremble as if the earth itself has turned against you, leaving you powerless against the dark tide consuming your senses.
                    
                    Your vision begins to fracture, shadows bleeding into the edges of your sight until the world around you feels distant, unreal. The once-familiar sounds of battle fade, replaced by a low, haunting hum that reverberates in your skull. Each pulse of corrupted energy sends a fresh wave of pain coursing through your body, threatening to shatter what remains of your resolve.
                    
                    Regret strikes harder than the pain, an aching weight in your chest. Images of your home flash through your mind—sunlight filtering through the trees, the warmth of hearthfires, the smiles of those you love. You see their faces, frozen in joy and hope, and feel the crushing truth that you’ve let them down. The walls you swore to defend now crumble in your memory, their echoes a cruel reminder of what’s been lost.
                    
                    You dig your fingers into the ground beneath you, as if holding onto the earth itself could stop the world from slipping away. The soil feels cold, lifeless, a reflection of the despair tightening its grip around your heart.
                    
                    The corrupted energy grows stronger, its dark tendrils wrapping around your thoughts, drowning out reason and hope alike. As the darkness encroaches, a singular question gnaws at the edges of your fading consciousness 
                    
                    
                    Was it all for nothing?
                    
                    
                    \t\t\t        >> [ YOU HAVE LOST THE GAME, BETTER LUCK NEXT TIME] <<
                    """;
        }
    }

    @Override
    public void onInputReceived(String input) {
        if(hasWon){
            if(currWorld == 4){
                System.out.println("Going to _9_World_End...");
                GAME.nextScene(END);
            }
            else{
                System.out.println("Going to trance...");
                GAME.nextScene(TRANCE);
            }
        }
        else {
            System.out.println("Going to menu...");
            GAME.nextScene(MENU);
        }
    }
}
