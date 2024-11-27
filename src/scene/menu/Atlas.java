package scene.menu;

import game.Game;
import scene.Scene;

import static game.WhichScene.MENU;

public class Atlas extends Scene {

    public Atlas( Game GAME){
        super(GAME);
    }

    @Override
    protected String displayText_Display() {
        return """
                The Entity   \t- Antagonist
                The Beings\t\t- Hero's source of power
                Erotoma\t\t- World name
                Factions of Erotoma:
                    - Saroia
                    - Quacero
                    - Azrue
                Azsaqroqua \t\t- Center city of Erotoma
                Radea\t\t- Saroian alchemist
                Mazupe \t\t- Quaceron explorer
                Zipau \t\t- Azrueian researcher
                
                 ────────────────────────────────────────────────  FACTIONS  ────────────────────────────────────────────────\n
                
                
                
                             ▄████████    ▄████████    ▄████████  ▄██████▄   ▄█     ▄████████ ███▄▄▄▄      ▄████████\s
                            ███    ███   ███    ███   ███    ███ ███    ███ ███    ███    ███ ███▀▀▀██▄   ███    ███\s
                            ███    █▀    ███    ███   ███    ███ ███    ███ ███▌   ███    ███ ███   ███   ███    █▀ \s
                            ███          ███    ███  ▄███▄▄▄▄██▀ ███    ███ ███▌   ███    ███ ███   ███   ███       \s
                          ▀███████████ ▀███████████ ▀▀███▀▀▀▀▀   ███    ███ ███▌ ▀███████████ ███   ███ ▀███████████\s
                                   ███   ███    ███ ▀███████████ ███    ███ ███    ███    ███ ███   ███          ███\s
                             ▄█    ███   ███    ███   ███    ███ ███    ███ ███    ███    ███ ███   ███    ▄█    ███\s
                           ▄████████▀    ███    █▀    ███    ███  ▀██████▀  █▀     ███    █▀   ▀█   █▀   ▄████████▀ \s
                                                      ███    ███                                                    \s
                
                
                
                The Saroians are a race defined by their mastery of the mind. These beings specialize in mental warfare, wielding devastating psionic abilities that allow them to cripple opponents from afar, often without even raising a hand. Their mental dominance extends to rapid healing, mending both mind and body faster than most. Yet, their physical form is their greatest vulnerability. Saroians are fragile, their bodies almost too delicate for the rigors of close combat. Their reliance on strategy and surprise makes them powerful in ambushes, but in prolonged or open battles, their thin, elongated bodies become easy targets. The Saroians have built their society around the cultivation of mental strength, living secluded lives in hidden sanctuaries deep within the shadowy forests of Erotoma. Here, in their silent retreats, they meditate, engage in ancient rituals, and refine their psionic powers.
                
                Physically, the Saroians are hauntingly beautiful, with tall, slender bodies that seem to flow more than move. Their skin is pale, often shimmering faintly as if lit from within by some unknown light. Their limbs are long and flexible, giving them an almost serpentine grace, while their eyes glow with a cold, ethereal energy. Despite their fragility, there is a quiet menace in their appearance, a suggestion of power lurking just beneath the surface. They dwell in the densest parts of the Erotoma forests, where the twisting vines and towering trees provide ample cover for their ambushes. These hidden groves, infused with psionic energy, seem almost alive, responding to the Saroians' will. In terms of personality, Saroians are often seen as cold, calculating, and detached. They are not quick to trust, and their love for subtle manipulation makes them seem distant and enigmatic to other races. They prefer to act from the shadows, relying on cunning and foresight rather than brute force.\s
                
                               
                Pros:
                1. Immense Intelligence: Saroians excel in knowledge and strategic thinking.
                2. Knowledge Sharing: They value learning and contribute by sharing insights with others.
                3. High Crit Chance: They have a greater probability of landing critical hits in combat.
                4. Loyalty: Once trust is given, their loyalty is unwavering and dependable.
                
                Cons:
                1. Overlook Gestures: Their focus on intellect makes them seem prude or impolite.
                2. Low HP: They are physically frail and less durable than other races.
                
                \n\n\n
                                              >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                \n\n\n
                
                            ████████▄   ███    █▄     ▄████████  ▄████████    ▄████████    ▄████████    ▄████████\s
                            ███    ███  ███    ███   ███    ███ ███    ███   ███    ███   ███    ███   ███    ███\s
                            ███    ███  ███    ███   ███    ███ ███    █▀    ███    █▀    ███    ███   ███    ███\s
                            ███    ███  ███    ███   ███    ███ ███         ▄███▄▄▄      ▄███▄▄▄▄██▀   ███    ███\s
                            ███    ███  ███    ███ ▀███████████ ███        ▀▀███▀▀▀     ▀▀███▀▀▀▀▀   ▀███████████\s
                            ███    ███  ███    ███   ███    ███ ███    █▄    ███    █▄  ▀███████████   ███    ███\s
                            ███  ▀ ███  ███    ███   ███    ███ ███    ███   ███    ███   ███    ███   ███    ███\s
                             ▀██████▀▄█ ████████▀    ███    █▀  ████████▀    ██████████   ███    ███   ███    █▀ \s
                                                                                          ███    ███             \s
                
                                
                                
                The Quacera are the epitome of brute strength, known across the lands for their physical might. Capable of shattering bones and smashing through armor with a single strike, they dominate in close combat, where their powerful blows can cripple even the sturdiest of foes. However, their immense physical prowess comes at a cost. Their heavily muscled bodies make them slower and less agile than other races, leaving them vulnerable to quicker opponents who can outmaneuver them. Still, the Quacera’s unwavering resilience in battle ensures they remain a terrifying force on the battlefield, able to endure strikes that would fell others. In their culture, strength is everything. Quacera society is built around rigorous training, where young warriors are taught from an early age to embrace pain, push their limits, and seek victory at all costs.
                
                Physically, the Quacera are towering figures, their bodies packed with muscle. Their skin, thick and rough like stone, bears the scars of countless battles, each one a mark of honor. Their faces are square and often fierce, with sharp, hardened features. Many adorn themselves with war paint or tattoos that tell the stories of their greatest victories, and they are almost always seen clad in heavy armor that complements their raw strength. They reside in the rocky, unforgiving mountains of Vurgar, where their fortresses are carved into the cliffs. These strongholds are massive and imposing, designed to withstand sieges and brutal assaults, much like the Quacera themselves. Despite their intimidating appearance, the Quacera are a proud and honorable people. They may seem gruff or unapproachable, but once someone earns their respect, they are fiercely loyal. While they are slow to anger, once roused, their fury is as relentless as their strength.\s
                
                
                Pros:
                1. Tough and Bulky: Quacerons are naturally durable and resilient in combat.
                2. Intimidating Presence: Their appearance can intimidate unfamiliar races like Saroians and Azrueians.
                3. Gentle and Polite: Despite their look, they remain calm and respectful under stress.
                4. High HP: They have significantly more health than other races, enhancing survivability.
                
                Cons:
                1. Intimidation Drawbacks: Their appearance may cause misunderstandings with allies or strangers.
                2. Always Attack Last: They are slower in combat and lose the advantage of striking first.
                
                \n\n\n
                                              >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                \n\n\n
                  
                                          ▄████████  ▄███████▄     ▄████████ ███    █▄     ▄████████\s
                                         ███    ███ ██▀     ▄██   ███    ███ ███    ███   ███    ███\s
                                         ███    ███       ▄███▀   ███    ███ ███    ███   ███    █▀ \s
                                         ███    ███  ▀█▀▄███▀▄▄  ▄███▄▄▄▄██▀ ███    ███  ▄███▄▄▄    \s
                                       ▀███████████   ▄███▀   ▀ ▀▀███▀▀▀▀▀   ███    ███ ▀▀███▀▀▀    \s
                                         ███    ███ ▄███▀       ▀███████████ ███    ███   ███    █▄ \s
                                         ███    ███ ███▄     ▄█   ███    ███ ███    ███   ███    ███\s
                                         ███    █▀   ▀████████▀   ███    ███ ████████▀    ██████████\s
                                                                  ███    ███                        \s
                
                
                
                The Azrue are the swiftest of all races, moving with a speed and precision that leaves enemies reeling before they even realize they’ve been struck. Agile and graceful, they are known for darting through the battlefield, landing deadly strikes in rapid succession. Their attacks are not just fast, but devastatingly accurate, often targeting weak points with surgical precision. However, their focus on speed comes with a significant drawback: endurance. Azrue fighters are not built for long, drawn-out battles. They rely on swift engagements to overwhelm their foes quickly, and in protracted fights or against heavily armored opponents, their agility can only take them so far. Azrue society mirrors their approach to combat; they value efficiency in all things, from their way of life to their art and warfare. Training for speed and reflexes is paramount, and they constantly seek to improve their swiftness in both thought and action.
                
                Lean and wiry, the Azrue possess lithe bodies that are honed for speed. Their sharp, piercing eyes seem to see everything at once, constantly calculating their next move. Their skin is smooth and often marked with intricate tattoos that symbolize their agility and the paths they’ve taken in life. They wear light, flexible armor that allows them to move without restriction, every part of their attire designed to enhance their speed. The Azrue make their homes on the wide, open plains of Kryssa, where the windswept terrain allows them to move unhindered. Their settlements are sleek, low structures that blend into the environment, minimizing drag and maximizing their ability to mobilize at a moment’s notice. Azrue are quick-witted, often playful, and can be impulsive, a stark contrast to the more methodical races. Their energy is infectious, though some see their rapid pace as impatience or recklessness. However, they are a fiercely loyal people, striking with lightning speed when one of their own is threatened.\s
                
                                   
                Pros:
                1. Slender and Agile: Azrueians are quick and flexible, excelling in fast combat and evasion. 
                2. Cheerful Nature: Their positivity boosts team morale and enhances interactions. 
                3. Chain Attacks (Mana Efficiency): They can perform multiple attacks while using mana only once. 
                4. Sustained Damage: Their chain attacks allow consistent damage over time. 
                
                Cons:
                1. No Critical Hits: They cannot achieve high-damage critical strikes. 
                2. Chain Attack Reliance: Chain attacks depend on successful rolls, adding unpredictability. 
                3. Mana Dependency for Initiating Attacks: They must manage mana to start chain combos. 
                4. Limited Versatility in Damage Types: Lack of critical hits reduces their damage variety. 
                
                \n\n\n                
                 ───────────────────────────────────────────────  CHARACTERS  ───────────────────────────────────────────────\n
                
                
                                  
                                         ▄████████    ▄████████ ████████▄     ▄████████    ▄████████\s
                                        ███    ███   ███    ███ ███   ▀███   ███    ███   ███    ███\s
                                        ███    ███   ███    ███ ███    ███   ███    █▀    ███    ███\s
                                       ▄███▄▄▄▄██▀   ███    ███ ███    ███  ▄███▄▄▄       ███    ███\s
                                      ▀▀███▀▀▀▀▀   ▀███████████ ███    ███ ▀▀███▀▀▀     ▀███████████\s
                                      ▀███████████   ███    ███ ███    ███   ███    █▄    ███    ███\s
                                        ███    ███   ███    ███ ███   ▄███   ███    ███   ███    ███\s
                                        ███    ███   ███    █▀  ████████▀    ██████████   ███    █▀ \s
                                        ███    ███                                                  \s
                
                             
                
                A haunting figure who moves like mist through shadows, Radea has mastered the art of mental warfare to an unprecedented degree. Their elongated form and ghostly pale skin seem to shimmer with an inner light, while their eyes glow with an unsettling intensity. Their mere presence sends shivers down the spines of those who dare to face them, as they manipulate fears with terrifying precision. In the battlefield of the mind, they are both a predator and a phantom, striking terror before their enemies can even comprehend the danger.
                
                  
                Pros: 
                1. Master of Mental Warfare: Radea excels in manipulating fears to gain a psychological advantage.
                2. Stealthy Presence: They move like mist, making them elusive and unpredictable.
                3. Terrifying Aura: Their glowing eyes and spectral form intimidate enemies before combat begins.
                4. Precision in Fear: They strike swiftly and decisively, targeting vulnerabilities with precision.
                
                Cons:
                1. Relies on Intimidation: Their effectiveness depends on exploiting fear, which may not work on fearless opponents.
                2. Fragile in Physical Combat: Their abilities focus on mental manipulation rather than physical resilience.
                  
                  
                  
                  
                /////////////// Atlas - Characters
                # Radea
                - Radea, a Saroian, is the head of the Alchemy Group in Azsaroqua.
                  Due to the nature of alchemy, the group is considered unofficial
                  and is mostly maintained with the help of Radea's adventures.
                - As a Saroian, Radea can do chain attacks. Being the head of the
                  Alchemy Group in Azsaroqua, Radea can increase the effectivity of
                  any potion used.
                
                # Mazupe
                - Mazupe, a Quaceron, is an avid explorer that has roamed in all 3
                  factions' lands. Moving from one city to another had made Mazupe
                  a skillful veteran amongst the group.
                - As a Quaceron, Mazupe has more HP. Being a skillful veteran,
                  Mazupe gains more mana when using block.
                
                # Zipau
                - Zipau, an Azrueian, is a researcher of the Science Institute of
                  Azsaroqua. With the help of the institute's collections, Zipau
                  has become knowledgeable of the technology used in the 3 factions.
                - As an Azrueian, Zipau has a higher chance to crit. With all the
                  knowledge Zipau has gathered, Zipau gains extra stats from relics
                  collected.
                """;
    }

    protected String displayText_Choice() {
        return "Press ENTER to go back.";
    }


    public void onInputReceived(String input) {
        System.out.println("Going back to menu...");
        GAME.nextScene(MENU);
    }
}
