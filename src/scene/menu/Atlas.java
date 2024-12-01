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
                \n\n\n
                                              >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                \n\n\n
                                  ▄▄▄▄███▄▄▄▄      ▄████████  ▄███████▄  ███    █▄     ▄███████▄    ▄████████\s
                                ▄██▀▀▀███▀▀▀██▄   ███    ███ ██▀     ▄██ ███    ███   ███    ███   ███    ███\s
                                ███   ███   ███   ███    ███       ▄███▀ ███    ███   ███    ███   ███    █▀ \s
                                ███   ███   ███   ███    ███  ▀█▀▄███▀▄▄ ███    ███   ███    ███  ▄███▄▄▄    \s
                                ███   ███   ███ ▀███████████   ▄███▀   ▀ ███    ███ ▀█████████▀  ▀▀███▀▀▀    \s
                                ███   ███   ███   ███    ███ ▄███▀       ███    ███   ███          ███    █▄ \s
                                ███   ███   ███   ███    ███ ███▄     ▄█ ███    ███   ███          ███    ███\s
                                 ▀█   ███   █▀    ███    █▀   ▀████████▀ ████████▀   ▄████▀        ██████████\s
                                                                                                              \s
                
                
                A mountain of muscle and determination, Mazupe stands as one of the most formidable Quacera warriors. His battle-scarred body and intimidating presence make even the bravest warriors think twice before engaging. With every swing of his weapon, he embodies raw power and unyielding resolve, leaving a trail of defeated foes in his wake. His deep, resonant voice commands respect and loyalty, uniting his comrades under a banner of strength and honor.
                
                
                Pros:
                1. High HP: Mazupe has increased durability, making them harder to take down in combat.
                2. Increased Mana from Block: Mazupe gains more mana when using the block skill, improving resource management during battles.
                3. Veteran Expertise: With experience across all 3 factions, Mazupe can adapt to various combat styles and strategies.
                4. Exploration Knowledge: Mazupe's familiarity with diverse terrains allows for greater adaptability in different environments.
                
                
                Cons:
                1. Overreliance on Block: Mazupe's mana gain is tied to blocking, which could limit offensive options in certain situations.
                2. Target Due to High HP: Mazupe's large health pool makes them a prime target for enemies.
                3. Limited Specialization: Their broad experience means Mazupe lacks deep expertise in any one faction's abilities or tactics.
                4. Fatigue from Travel: Constantly moving between cities may lead to physical exhaustion, affecting performance in long battles.
                \n\n\n
                                              >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                \n\n\n
                
                                             ▄███████▄   ▄█     ▄███████▄    ▄████████ ███    █▄ \s
                                            ██▀     ▄██ ███    ███    ███   ███    ███ ███    ███\s
                                                  ▄███▀ ███▌   ███    ███   ███    ███ ███    ███\s
                                             ▀█▀▄███▀▄▄ ███▌   ███    ███   ███    ███ ███    ███\s
                                              ▄███▀   ▀ ███▌ ▀█████████▀  ▀███████████ ███    ███\s
                                            ▄███▀       ███    ███          ███    ███ ███    ███\s
                                            ███▄     ▄█ ███    ███          ███    ███ ███    ███\s
                                             ▀████████▀ █▀    ▄████▀        ███    █▀  ████████▀ \s
                                                                                                 \s
                
                
                As an elite Azrue warrior, Zipau moves like lightning across the battlefield. His fluid movements and precise strikes make him nearly impossible to track, let alone counter. With an innate sense of timing and an unparalleled mastery of his weapons, he weaves through enemy lines like a phantom. Each encounter leaves foes bewildered and on edge, as he appears and disappears with uncanny speed. His reputation for striking swiftly and decisively has made him a legend among both allies and adversaries alike.
                
                
                Pros:
                1. Increased Crit Chance: As an Azrueian, Zipau has a higher likelihood of landing critical hits, boosting damage output.
                2. Expert Knowledge: Zipau’s research at the Science Institute grants a deep understanding of the technology used by all 3 factions, allowing for strategic advantages.
                3. Extra Stats from Relics: Zipau gains additional stats from relics, enhancing overall abilities and combat effectiveness.
                
                
                Cons:
                1. Reliance on Crits: The increased crit chance may not always guarantee consistent damage, making Zipau vulnerable in prolonged fights.
                2. Limited Physical Durability: Zipau’s focus on research and technology might come at the cost of physical resilience or combat prowess.
                3. Overreliance on Relics: The extra stats from relics may become a crutch, potentially limiting Zipau's performance without these boosts.
                4. Knowledge Overload: Extensive information could overwhelm Zipau at times, leading to indecision or slower reactions in fast-paced situations.
                
                
                
                 ───────────────────────────────────────────────  FINAL BOSS  ───────────────────────────────────────────────\n
                
                
                
                
                                           ▄████████ ███▄▄▄▄       ███      ▄█      ███     ▄██   ▄  \s
                                          ███    ███ ███▀▀▀██▄ ▀█████████▄ ███  ▀█████████▄ ███   ██▄\s
                                          ███    █▀  ███   ███    ▀███▀▀██ ███▌    ▀███▀▀██ ███▄▄▄███\s
                                         ▄███▄▄▄     ███   ███     ███   ▀ ███▌     ███   ▀ ▀▀▀▀▀▀███\s
                                        ▀▀███▀▀▀     ███   ███     ███     ███▌     ███     ▄██   ███\s
                                          ███    █▄  ███   ███     ███     ███      ███     ███   ███\s
                                          ███    ███ ███   ███     ███     ███      ███     ███   ███\s
                                          ██████████  ▀█   █▀     ▄████▀   █▀      ▄████▀    ▀█████▀ \s
                                                                                                        \s
                
                
                Little is known about this mysterious entity, but it was found locked away deep within the vaults of the Luminari. Surrounding it were hundreds of Luminari remains, each one appearing to have been placed in a ritualistic pattern. The vault, a place usually reserved for sacred artifacts and relics of great power, had been sealed for centuries. Why were the Luminari—an ancient, revered order—protecting or perhaps imprisoning this being? What events led to the fall of so many of their kind? The truth lies hidden within the secrets of their lost history. Was it a failed experiment, a weapon too dangerous to remain free, or something far older, a force they feared but could not destroy? The answers remain elusive, waiting to be uncovered.
                
                
        
                 ────────────────────────────────────────────  CURRENT FACTIONS  ────────────────────────────────────────────\n
                
                
                
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
                
                

                 ────────────────────────────────────────────  ANCIENT FACTIONS  ────────────────────────────────────────────\n
                
                
                
                               ▄█       ███    █▄     ▄▄▄▄███▄▄▄▄    ▄█  ███▄▄▄▄      ▄████████    ▄████████  ▄█ \s
                              ███       ███    ███  ▄██▀▀▀███▀▀▀██▄ ███  ███▀▀▀██▄   ███    ███   ███    ███ ███ \s
                              ███       ███    ███  ███   ███   ███ ███▌ ███   ███   ███    ███   ███    ███ ███▌\s
                              ███       ███    ███  ███   ███   ███ ███▌ ███   ███   ███    ███  ▄███▄▄▄▄██▀ ███▌\s
                              ███       ███    ███  ███   ███   ███ ███▌ ███   ███ ▀███████████ ▀▀███▀▀▀▀▀   ███▌\s
                              ███       ███    ███  ███   ███   ███ ███  ███   ███   ███    ███ ▀███████████ ███ \s
                              ███▌    ▄ ███    ███  ███   ███   ███ ███  ███   ███   ███    ███   ███    ███ ███ \s
                              █████▄▄██ ████████▀    ▀█   ███   █▀  █▀    ▀█   █▀    ███    █▀    ███    ███ █▀  \s
                              ▀                                                                   ███    ███     \s
                
                        
                
                The Luminari stand as legends in the annals of history, their brilliance casting long shadows even centuries after their extinction. These beings were the undisputed masters of scientific advancement and technological innovation, credited with creating the most powerful relics known to exist. Their understanding of the fundamental forces of reality far surpassed modern comprehension, allowing them to forge artifacts of such complexity and power that even today's most accomplished scholars can barely grasp their underlying principles. The relics they left behind are as dangerous as they are magnificent, often requiring immense willpower and physical resilience to wield - many who have attempted to harness their power have been consumed by it.
                
                Physically, the Luminari were beings of ethereal beauty, their forms seeming to exist somewhere between matter and energy. Their bodies radiated a soft, pulsing light that changed color with their thoughts and emotions, while their eyes held the depth of infinite knowledge. The ruins of their great cities still stand, though most are deemed too dangerous to approach due to the unstable relics and reality-warping technologies that remain active within. In terms of personality, historical records describe the Luminari as detached and analytical, viewing the world through the lens of pure logic and scientific pursuit.\s
                \n\n\n
                                              >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                \n\n\n
                
                                 ▄████████     ███        ▄████████    ▄████████ ███▄▄▄▄      ▄████████  ▄█      \s
                                ███    ███ ▀█████████▄   ███    ███   ███    ███ ███▀▀▀██▄   ███    ███ ███      \s
                                ███    █▀     ▀███▀▀██   ███    █▀    ███    ███ ███   ███   ███    ███ ███      \s
                               ▄███▄▄▄         ███   ▀  ▄███▄▄▄      ▄███▄▄▄▄██▀ ███   ███   ███    ███ ███      \s
                              ▀▀███▀▀▀         ███     ▀▀███▀▀▀     ▀▀███▀▀▀▀▀   ███   ███ ▀███████████ ███      \s
                                ███    █▄      ███       ███    █▄  ▀███████████ ███   ███   ███    ███ ███      \s
                                ███    ███     ███       ███    ███   ███    ███ ███   ███   ███    ███ ███▌    ▄\s
                                ██████████    ▄████▀     ██████████   ███    ███  ▀█   █▀    ███    █▀  █████▄▄██\s
                                                                      ███    ███                        ▀        \s
                                    ▄████████  ▄██████▄   ▄█        ▄██████▄     ▄████████    ▄████████  ▄█      \s
                                   ███    ███ ███    ███ ███       ███    ███   ███    ███   ███    ███ ███      \s
                                   ███    █▀  ███    ███ ███       ███    ███   ███    █▀    ███    █▀  ███▌     \s
                                   ███        ███    ███ ███       ███    ███   ███          ███        ███▌     \s
                                   ███        ███    ███ ███       ███    ███ ▀███████████ ▀███████████ ███▌     \s
                                   ███    █▄  ███    ███ ███       ███    ███          ███          ███ ███      \s
                                   ███    ███ ███    ███ ███▌    ▄ ███    ███    ▄█    ███    ▄█    ███ ███      \s
                                   ████████▀   ▀██████▀  █████▄▄██  ▀██████▀   ▄████████▀   ▄████████▀  █▀       \s
                                                         ▀                                                       \s
                
                
                
                The Eternal Colossi were beings of such magnificence and power that they blurred the line between mortal and divine. These massive entities, standing hundreds of feet tall, were regarded as the realm's supreme guardians, their very presence enough to ward off the greatest of threats. For five millennia, they walked the lands as living embodiments of protection and wisdom, their ancient knowledge and power unmatched by any race before or since. Each Colossus was unique in form and ability, some resembling massive stone warriors, others taking the shape of magnificent beasts, but all sharing an aura of divine purpose.
                
                Their physical forms defied conventional understanding, as they seemed to be crafted from living stone, ancient metal, and pure energy. Their bodies were covered in intricate patterns and runes that glowed with inner light, and their movements, despite their enormous size, carried a grace that seemed impossible for beings of such scale. The Colossi made their homes in sacred sites across the realm, each choosing a domain to protect and nurture. These locations, now empty, remain places of powerful energy and reverence, though the purpose of many of their ancient structures remains a mystery.\s
                
                
                
                 ────────────────────────────────────────────  DEBUFFS AND BUFFS  ───────────────────────────────────────────\n
                 
                 
                 
                
                   ▀█████████▄   ▄█          ▄████████    ▄████████    ▄████████  ▄█  ███▄▄▄▄      ▄██████▄     ▄████████\s
                     ███    ███ ███         ███    ███   ███    ███   ███    ███ ███  ███▀▀▀██▄   ███    ███   ███    ███\s
                     ███    ███ ███         ███    █▀    ███    █▀    ███    █▀  ███▌ ███   ███   ███    █▀    ███    █▀ \s
                    ▄███▄▄▄██▀  ███        ▄███▄▄▄       ███          ███        ███▌ ███   ███  ▄███          ███       \s
                   ▀▀███▀▀▀██▄  ███       ▀▀███▀▀▀     ▀███████████ ▀███████████ ███▌ ███   ███ ▀▀███ ████▄  ▀███████████\s
                     ███    ██▄ ███         ███    █▄           ███          ███ ███  ███   ███   ███    ███          ███\s
                     ███    ███ ███▌    ▄   ███    ███    ▄█    ███    ▄█    ███ ███  ███   ███   ███    ███    ▄█    ███\s
                   ▄█████████▀  █████▄▄██   ██████████  ▄████████▀   ▄████████▀  █▀    ▀█   █▀    ████████▀   ▄████████▀ \s
                                ▀                                                                                        \s
                
                
                
                In the world of Erotoma, blessings are divine gifts bestowed upon warriors after they conquer formidable foes. These blessings are much more than just temporary enhancements—they are permanent boons that shape the very essence of the victor. Upon slaying a corrupted being, vanquishing an elite, or defeating a powerful adversary, the victorious hero is granted a blessing that strengthens them for the challenges ahead.
                
                These blessings come in the form of subtle but significant enhancements to key stats—health, attack power, defense, dodge, and critical hit chance. Some blessings might provide only a modest boost, while others could amplify a stat by a tremendous amount, marking the hero as an ever-growing force to be reckoned with. For example, a single blessing could add 50 points to health, or it might increase critical hit chance by 5%, setting the warrior on a path toward greatness.
                
                The strength of the blessing correlates directly with the strength of the adversary. The mightier the foe, the greater the potential of the blessing. Facing a common soldier may yield a small, humble blessing—perhaps just a slight increase in defense. But taking down a colossal beast or a legendary hero could unlock blessings of incredible power, the kind that could turn the tide of a battle with a single strike.
                
                However, there is an element of unpredictability. The blessings are randomized, meaning that warriors are never entirely sure what they will receive. Some might find themselves blessed with exactly what they sought—a boost to their attack to better slay their enemies—but others may receive something entirely unexpected. A hero might be granted a surge in defense when they truly wanted more health, or they may receive a blessing that they didn't even realize was valuable, like an increase in their dodge stat, which could make them nearly untouchable in battle.
                
                In rare cases, a warrior may receive a legendary blessing—one of such immense power that it becomes a symbol of their status, making them a target for others seeking to challenge their might. These epic blessings often carry side effects, as they may grant abilities beyond simple stat boosts. Some blessings might even alter the warrior’s very abilities or grant new ones, making them a terrifying force with powers that stretch the limits of what the world thought possible.
                
                The randomness of blessings ensures that no two warriors’ paths are alike. One may become a towering juggernaut, while another could grow elusive and deadly with swift strikes, or a third may become a master of critical hits, dealing massive blows in the blink of an eye. It is this element of chance that keeps the world of Erotoma vibrant, as no hero can ever be fully certain of the path that their victories will carve for them.
                \n\n\n
                                              >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                \n\n\n
                
                                     ▄████████    ▄████████  ▄█    █▄   ▄██████▄     ▄████████    ▄████████\s
                                    ███    ███   ███    ███ ███    ███ ███    ███   ███    ███   ███    ███\s
                                    ███    █▀    ███    ███ ███    ███ ███    ███   ███    ███   ███    █▀ \s
                                   ▄███▄▄▄       ███    ███ ███    ███ ███    ███  ▄███▄▄▄▄██▀   ███       \s
                                  ▀▀███▀▀▀     ▀███████████ ███    ███ ███    ███ ▀▀███▀▀▀▀▀   ▀███████████\s
                                    ███          ███    ███ ███    ███ ███    ███ ▀███████████          ███\s
                                    ███          ███    ███ ███    ███ ███    ███   ███    ███    ▄█    ███\s
                                    ███          ███    █▀   ▀██████▀   ▀██████▀    ███    ███  ▄████████▀ \s
                                                                                    ███    ███             \s
                
                
                
                In the mystical realm of Erotoma, Favors are temporary boons granted by enigmatic beings—gods, spirits, or ancient forces—that players can invoke through offering Essence. Essence is an ethereal substance that can be harvested after each victorious battle. Whenever an enemy is slain, a fragment of their life force is absorbed as Essence, which can then be used to seek the favor of a higher power.
                
                The amount of Essence you collect depends on the strength of your opponent. Defeating a lowly foe might yield only a small amount of Essence, while vanquishing a mighty titan or a legendary adversary will flood you with an abundance of this valuable resource. The more powerful the enemy, the more Essence you accumulate, and therefore, the more chances you have to offer these energies in exchange for a favor. This means that the most challenging battles also offer the greatest opportunities to harness temporary enhancements that could turn the tide in your favor.
                
                Favors themselves are powerful but fleeting blessings. Unlike Blessings, which offer permanent stat boosts, Favors provide short-term enhancements that can significantly aid a warrior during a crucial moment. These buffs might include temporary increases in health, attack power, defense, dodge, or critical hit chance. However, the precise nature of the Favor is entirely random, so there is an element of luck involved. A warrior may receive exactly the boost they need—a surge in attack power just when facing a boss—but they might also be granted a defensive buff when offense would have been more desirable.
                
                Despite their power, Favors come with a critical limitation: you can only hold three Favors at a time. This forces strategic decision-making, as players must choose wisely when to use or renew their Favors. Do they save them for a particularly challenging fight? Or do they deploy them immediately to gain an advantage in a series of battles? The limited number of Favors ensures that no warrior can become overly reliant on these gifts, adding a layer of strategy and foresight to the experience.
                
                The randomness of the Favors, coupled with the limited number of uses, means that warriors must rely on both luck and skill in determining how best to use these temporary enhancements. The uncertainty of which Favor will manifest adds an element of risk, but also excitement, as players engage with the unknown each time they offer Essence to the mysterious being. Will they be blessed with the perfect boon, or will fate deliver something unexpected that forces them to adapt their strategy on the fly?
                
                Thus, Favors offer a thrilling and tactical dimension to battle, allowing heroes to experience fleeting moments of power that could be the difference between victory and defeat. But with limited opportunities to call upon these blessings and the capricious nature of their gifts, wise warriors understand the value of patience, timing, and a little bit of luck.
                \n\n\n
                                              >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                \n\n\n
                               ▄████████    ▄████████    ▄████████    ▄████████  ▄████████     ███        ▄████████\s
                              ███    ███   ███    ███   ███    ███   ███    ███ ███    ███ ▀█████████▄   ███    ███\s
                              ███    █▀    ███    █▀    ███    █▀    ███    █▀  ███    █▀     ▀███▀▀██   ███    █▀ \s
                             ▄███▄▄▄      ▄███▄▄▄      ▄███▄▄▄      ▄███▄▄▄     ███            ███   ▀   ███       \s
                            ▀▀███▀▀▀     ▀▀███▀▀▀     ▀▀███▀▀▀     ▀▀███▀▀▀     ███            ███     ▀███████████\s
                              ███    █▄    ███          ███          ███    █▄  ███    █▄      ███              ███\s
                              ███    ███   ███          ███          ███    ███ ███    ███     ███        ▄█    ███\s
                              ██████████   ███          ███          ██████████ ████████▀     ▄████▀    ▄████████▀ \s
                
                
                
                In Erotoma, the following Effects play a pivotal role in shaping the outcome of combat. Each effect can either empower the wielder or cripple the opponent, adding layers of strategy and unpredictability to every encounter.
                
                
                >> INFLICTION
                A debilitating effect that causes ongoing damage over time. Inflicted on a target by poisonous or cursed attacks, the INFLICTION effect saps a character's health little by little, forcing them to either find a way to cleanse it or endure its painful effects. It can be highly lethal if not managed quickly.
                
                >> REGEN
                A healing effect that grants gradual regeneration of health over time. This effect is especially useful for characters who wish to sustain themselves through prolonged battles. REGEN slowly restores a portion of the character's HP every turn, allowing them to recover without relying on potions or external sources.
                
                >> WEAKEN
                A crippling effect that lowers a target’s attack and defense, making them far less dangerous in combat. When an enemy is WEAKENED, their offensive and defensive capabilities are diminished, making them easier to defeat. This effect is often used to turn the tide of battle by neutralizing powerful foes.
                
                >> EMPOWER
                The opposite of WEAKEN, the EMPOWER effect temporarily boosts a character’s offensive and defensive abilities. It makes them more resilient and deadly, enhancing their overall stats. When a warrior is EMPOWERED, their attacks become stronger, and they can endure more damage before faltering, making them a true force to be reckoned with.
                
                >> FRAIL
                A fragile state that reduces a character's health or defensive capabilities. A FRAIL character is vulnerable and more susceptible to damage, and often struggles to withstand enemy blows. This effect is particularly dangerous for those who rely on their durability to survive, as it leaves them open to critical hits and powerful attacks.
                
                >> FORTIFY
                A defensive effect that increases a character’s resistance to damage. With FORTIFY, a warrior becomes harder to injure, whether through enhanced armor, hardened skin, or magical shields. This effect is vital for frontline fighters or tanks, who must endure heavy punishment without succumbing to defeat.
                
                >> SHARPEN
                An offensive effect that enhances the character's ability to deal critical damage. With SHARPEN, a warrior's attacks become more precise, and their critical hit chance increases. This effect is especially useful for characters who focus on striking hard and fast, maximizing their damage output and bringing down foes quickly.
                
                >> ENSHROUD
                An effect that cloaks the target in shadows, fog, or a protective aura, making it harder for enemies to land successful attacks. ENSHROUD boosts a character’s Dodge or evasion, allowing them to slip through danger with ease. It can be particularly useful when trying to avoid heavy-hitting attacks or when facing foes that rely on precision.
                
                >> STUN
                A debilitating effect that temporarily paralyzes a character, preventing them from acting for a set period. STUN leaves a target helpless, unable to move or attack, making them vulnerable to follow-up strikes. This effect is one of the most dangerous, as it leaves the affected character at the mercy of their enemies, unable to retaliate or defend themselves.
                
                
                These Effects are the tools of battle, shifting the balance between victory and defeat. Whether a warrior uses Regen to outlast an enemy or relies on Empower to strike down a foe swiftly, every battle in Erotoma is a delicate dance of cause and effect. And with the right combination of Effects, any warrior can turn the tide of battle in their favor—or succumb to the devastating consequences of their opponent’s power.
                
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
