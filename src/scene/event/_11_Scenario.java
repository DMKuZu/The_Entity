package scene.event;

import elements.creature.hero.Hero;
import elements.creature.value.Skills;
import game.Game;

import java.util.Arrays;

import static game.WhichScene.*;

public class _11_Scenario extends Event {

    public _11_Scenario(Hero HERO, int currWorld, int currEncounter, Game GAME){
        super(HERO,currWorld,currEncounter,GAME);

    }

    @Override
    protected String displayText_Display() {
        switch (HERO.getNAME()){
            case "Radea":
                switch (currWorld){
                    case 1:
                        switch (currEncounter){
                            case 1:
                                return String.format("""
                                        As they continued, a group of Azrue Blade Dancers appeared, their movements fluid and precise, circling around %s with a deadly grace. These warriors were once revered for their elegance in combat, but now their eyes were filled with a predatory gleam, their attacks driven by dark energy.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Azrueian Blade Dancers ]
                                        """, HERO.getNAME()
                                );
                            case 2:
                                return String.format("""
                                        The mist thickened, and %s felt a shift in the air as a figure emerged—a Twisted Bladedancer, embodying a chaotic mix of speed and arcane power. This fighter moved with a fluidity that would once have been awe-inspiring, but now it was a deadly, distorted dance.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Twisted Bladedancer ]
                                        """, HERO.getNAME()
                                );
                            case 3:
                                return String.format("""
                                        A faint sound caught their attention, and %s saw the quick, darting figures of Azrue Scouts emerging from the shadows. Once messengers and gatherers of knowledge, these Scouts had been twisted, their keen senses and speed turned into tools of aggression.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Azrueian Scouts ]
                                        """, HERO.getNAME()
                                );
                            case 4:
                                return """
                                        On the outskirts of a shadowed field, a group of Azrue WindRanger emerged, their forms blurred as they moved with incredible speed. They struck with ruthless precision, their former grace turned into a weapon of twisted vengeance.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Azrueian WindRanger ]
                                        """;
                            case 5:
                                return String.format("""
                                        %s took a steadying breath and stepped onto the shadowed path. Dark energy clung to the air, swirling with the oppressive aura of the Chronomancer of Dread, who stood waiting, their eyes filled with dark intelligence.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Chronomancer of Dread ]
                                        """, HERO.getNAME()
                                );
                            case 6:
                                return String.format("""
                                        At last, %s found a hidden sanctuary, where the winds swept through open arches, whispering of the past. They took a moment to rest and gather their strength, feeling the winds ease their fatigue and heal their wounds.
                                        
                                        
                                        
                                        >> [ YOU HAVE FOUND A SAFE SPOT ]
                                        """, HERO.getNAME()
                                );
                            case 7:
                                return String.format("""
                                        The mountain’s peak stretched vast and desolate, crowned by the ancient colosseum—a dark monument to a forgotten age. Its blackened stone walls, embedded with pulsing red crystals, exuded a sinister energy. This place, once a sanctuary for the Azures, had been where speed and skill were celebrated, where friends had become legends. But now, silence and a heavy presence lingered, shadows whispering of lost glory.
                                        
                                        As %s approached, the bone-deep chill of the thin air carried traces of the past. Steps echoed faintly, and visions of warriors training, laughing, and racing across the stones seemed to flicker in the mind’s eye. Reaching the colosseum’s edge, %s froze.
                                        
                                        A figure stood still against the darkened sky, framed by jagged spires and the eerie glow of the crystals. It was Zipau, their form flickering as if caught between dimensions. Crimson lightning arced from their hands, and their once-familiar face had become a haunting mask of malice.
                                        
                                        %s’s breath caught, memories swirling. A thousand words fought to emerge, but before any could, Zipau vanished in a burst of red lightning, reappearing at the colosseum’s entrance.
                                        
                                        "Zipau..." %s called, voice tinged with sorrow. "It’s me. You don’t have to do this. You can still come back."
                                        
                                        Zipau’s laugh rang cold and mocking, the sound echoing sharply through the colosseum. "Back?" Their voice dripped with bitterness. "Back to what? To a world that discarded me while you moved on? You left me here, abandoned to this darkness."
                                        
                                        "No!" %s pleaded, stepping forward. "I never abandoned you. I searched for you, Zipau. I swear it. This corruption—it’s twisting you, but it’s not who you are. You’re stronger than this."
                                        
                                        Zipau sneered, eyes glowing with scorn. "Still clinging to that naive hope? Look around, %s." A hand gestured to the corrupted arena as the crystals flared. "This is all that’s left. You’re a fool to think you can save me."
                                        
                                        Crimson lightning crackled as Zipau moved in flashes, tainting the arena with streaks of corruption. Their laughter, once warm, had twisted into something sharp and cruel. "If you want to try saving me," Zipau mocked, voice echoing from all directions, "then prove yourself. Or are you still afraid?"
                                        
                                        Heart heavy, %s stepped across the colosseum’s threshold. Memories surged—training side by side, pushing each other, sharing dreams. The ghosts of their past seemed to linger in the air, reminders of the bond they once shared.
                                        
                                        Reaching the arena’s center, %s felt the shadows thicken. From the depths, Zipau emerged, red lightning casting their face in a sinister glow.
                                        
                                        "This won’t hurt," Zipau taunted, their voice a dark, mocking promise.
                                        
                                        %s’s fists clenched, sadness giving way to determination. "It doesn’t have to be like this, Zipau," %s said, desperation threading through the words. "We fought together here. We made each other stronger. Don’t throw it all away."
                                        
                                        Zipau’s expression hardened, contempt flickering in their eyes. "You still don’t get it. Those memories mean nothing. I wasted time as your friend, watching you take the glory. Not anymore."
                                        
                                        Grief weighed heavily on %s’s heart, but they stepped closer, voice steady. "Then I’ll fight you—not to hurt you, but because I believe in the friend you once were. And I’ll keep fighting until I find them again."
                                        
                                        
                                        
                                        >> [ WARNING: Incoming World Boss Battle with Corrupted Zipau ]
                                        """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                                );
                            case 8:
                            default:
                                return String.format("""
                                        As they moved forward, a sudden movement caught the %s’s eye. A group of Azrue Skirmishers approached, their forms blurred by their speed. These warriors once fought to protect their people, but now their eyes glinted with something darker, their movements sharpened by a twisted purpose.    
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Azrueian Skirmishers ]
                                        """, HERO.getNAME()
                                );
                        }
                    case 2:
                        switch (currEncounter){
                            case 1:
                                return """
                                        As they climbed higher, a group of Quacera Sentinels blocked their way, their eyes vacant and devoid of recognition. These were the steadfast protectors of Vurgar’s borders, now twisted into relentless enforcers of corruption.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Quacera Sentinels ]
                                        """;
                            case 2:
                                return String.format("""
                                        The %s took a steadying breath and stepped onto the narrow trail. Dark shadows loomed along rocky walls, and the air thickened with the Warlord's corrupted presence. At the cliff's summit stood the massive figure, his scarred armor and cold gaze promising destruction.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Warlord of Ruin ]
                                        """, HERO.getNAME()
                                );
                            case 3:
                                return String.format("""
                                        Taking the longer route, %s descended into the gorge. Soon, the sounds of warriors sparring echoed through canyon walls. A group of Smashkin spotted them, eyes blazing with battle-hunger
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Quacera Smashkin ]
                                        """, HERO.getNAME()
                                );
                            case 4:
                                return """
                                        A group of Quacera Wardens, once the esteemed protectors of their kin, now approached with blank stares and dark energy. They launched their attack, twisted pride driving them forward.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Quacera Wardens ]
                                        """;
                            case 5:
                                return """
                                        As they moved deeper into the heart of Vurgar, an oppressive shadow loomed over them—a Titan of the Abyss. Massive and unyielding, it embodied raw strength corrupted into pure malice, each footstep shaking the ground.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Titan of the Abyss ]
                                        """;
                            case 6:
                                return String.format("""
                                        After the intense challenges, %s stumbled upon a hidden Quacera sanctuary. Here, they found a small oasis where they could rest, surrounded by carved stone walls honoring warriors who had come before. They meditated, feeling the strength of their ancestors flow through them, preparing for the final trial ahead.
                                        
                                        
                                        
                                        >> [ YOU HAVE FOUND A SAFE SPOT ]
                                        """, HERO.getNAME()
                                );
                            case 7:
                                return String.format("""
                                        After a grueling climb through relentless winds and treacherous terrain, %s reached the summit. The frigid air clung tightly, and the darkening skies cast an eerie glow over the mountains below. This sacred site, where Quacera royalty had been crowned, now bore a shadow of corruption.
                                        
                                        In the clearing stood Mazupe, their once-noble form grotesquely fused with darkened armor, veins pulsing with an unnatural glow. They turned, rage-filled eyes meeting %s's gaze. A flicker of recognition passed, but it was buried beneath hatred.
                                        
                                        "Mazupe," %s called softly. "It’s me. Do you remember who you were?"
                                        
                                        A growl rose from Mazupe’s chest. "Who I was? I am nothing but decay, abandoned atop these cliffs while you... you left me to rot."
                                        
                                        Pain tightened in %s's chest, but their gaze stayed firm. "I never abandoned you. The corruption—it’s not who you are. The Mazupe I knew wouldn’t surrender to this darkness."
                                        
                                        Mazupe's laugh was harsh. "Lies! You were always celebrated while I was cast into shadow, forgotten. I became nothing, just a pawn."
                                        
                                        The ground trembled as Mazupe stepped forward, shadows swallowing the clearing. "You took everything I was and left me with this!" A corrupted fist glowed with dark energy, raised in fury.
                                        
                                        %s stood their ground. "You were a protector of your clan, a warrior of honor. This darkness doesn’t define you. I came here because I believe in that warrior still."
                                        
                                        For a moment, doubt flickered in Mazupe’s expression, but it was smothered by rage. "You speak of honor?" they hissed. "Where was your honor when I was left to this fate? There is no honor left in me—only rage."
                                        
                                        With a roar, Mazupe lunged, shaking the mountain. Ancient pillars crumbled as a massive fist crashed down, splitting the earth. %s barely dodged the blow, feeling the raw power tear through the ground.
                                        
                                        "Is this truly what you want?" %s shouted over the chaos. "To let corruption destroy everything we stood for?"
                                        
                                        Mazupe’s bitter laugh rang out. "There’s nothing left to stand for! All I was—my strength, my loyalty—was discarded! Now, I’ll take everything from you, as you took everything from me!"
                                        
                                        With another roar, they charged, shadows swirling like a storm, the mountaintop trembling under the weight of a once-noble soul consumed by darkness.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming World Boss Battle with Corrupted Mazupe ]
                                        """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                                );
                            case 8:
                            default:
                                return String.format("""
                                        At the base of a cliff, a group of Quacera Initiates appeared, their young faces filled with determination yet shadowed with a hint of something darker. They recognized %s, but their loyalty had been twisted by corruption, driving them to see their former ally as an enemy.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Quacera Initiates ]
                                        """, HERO.getNAME()
                                );
                        }
                    case 3:
                    default:
                        switch (currEncounter){
                            case 1:
                                return String.format("""
                                        The forest around him grew colder, and a soft mist rolled in, twisting through the trees. %s’s focus sharpened as he felt a dark presence seep through the air—Nightmare Sylphs, elusive and ethereal, slipped out of the mist, and the world around him began to twist, visions pulling at his fears and doubts.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Nightmare Sylphs ]
                                        """, HERO.getNAME()
                                );
                            case 2:
                                return """
                                        As he ventured further, a sharp chill fell over the forest, and an oppressive silence settled around him. The shadows seemed to thicken, draining the light from the trees and stones. A dark, void-like presence approached—the Shadowmaster—its eldritch energy swirling through the clearing.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Shadowmaster of the Void ]
                                        """;
                            case 3:
                                return String.format("""
                                        As %s moved through the denser parts of the forest, a faint hissing echoed through the trees. He halted, feeling sharp presences slithering closer—Spectral Serpents were drawn to his psionic energy, their forms ghostly and predatory.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Spectral Serpents ]
                                        """, HERO.getNAME()
                                );
                            case 4:
                                return String.format("""
                                        Continuing forward, %s spotted faint shadows above him, and a chorus of shrieks shattered the stillness. Spectral Harpies circled the treetops, diving in swift, disorienting attacks.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Spectral Serpents ]
                                        """, HERO.getNAME()
                                );
                            case 5:
                                return String.format("""
                                        The %s stepped onto the darker trail, where trees twisted in grotesque shapes and shadows whispered terrible secrets. The atmosphere grew stifling, thick with vile energy that seemed to consume light itself.
                                        
                                        A low, rumbling growl vibrated through the ground. Ahead, shadows coalesced into the towering Abomination of the Deep—a shifting mass of dark energy that defied comprehension.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Abomination of the Deep ]
                                        """, HERO.getNAME()
                                );
                            case 6:
                                return String.format("""
                                        After the grueling trials, %s stumbled into a hidden sanctuary veiled within the depths of the forest. The air was thick with psionic energy, yet here it felt different—gentle, almost soothing. The energy flowed around in soft waves, lifting the ache from weary muscles, and easing the weight from a battle-worn mind. Vibrant streams of light pulsed gently from ancient stones arranged in a circle, their runes glowing with a soft, ethereal light that whispered of ancient strength and wisdom passed down through generations.
                                        
                                        As %s moved into the heart of the sanctuary, the wounds across battered skin began to close, the bruises fading as the psionic energy knit flesh back together. A calm washed over the space, soothing the battle-worn tension, and thoughts cleared, the exhaustion receding as strength returned. Taking a slow, deep breath, (Chosen Character) felt the sanctuary's power seep into the core, grounding the spirit, bringing forth memories of purpose.
                                        
                                        For the first time in what felt like an eternity, there was peace, however brief, and in that stillness, %s drew upon the wisdom of those who had come before. The trials were far from over, but with this sanctuary's ancient energy surrounding the space, came renewal and readiness to face whatever lay ahead.
                                        
                                        
                                        
                                        >> [ YOU HAVE FOUND A SAFE SPOT ]
                                        """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                                );
                            case 7:
                                return String.format(
                                        """
                                        In the heart of their homeland, %s wandered through streets once filled with laughter and life, now eerily silent and draped in decay. The air was heavy with the weight of abandonment, the crumbling buildings and overgrown pathways testaments to the time and tragedy that had passed. Memories of a vibrant past haunted every corner, each familiar landmark a painful reminder of what had been lost. Despite the desolation, %s pressed forward, driven by a lingering hope to uncover the truth behind the shadows consuming their world.
                                                
                                        As the sun began its descent, casting long, haunting shadows over the land, %s reached the outskirts of the village, where remnants of an ancient battlefield lay. The plains of Erotoma stretched out ahead, and in the distance loomed the colossal resting form of Gaius, a legendary warrior of the Eternal Colossi Faction. His massive stone visage, half-submerged in the earth, seemed to gaze upward as though guarding the land even in death. The sight stirred both sorrow and reverence within %s, a painful echo of a past filled with both triumph and loss.
                                                
                                        Seeking solace, %s set up camp near the fallen giant. Beneath the faint glow of ancient runes etched into Gaius’s stone form, they found a brief respite from the weight of their journey. The hum of energy radiating from the Colossus held back the creeping darkness, offering a fragile sense of peace—a rare comfort in a world teetering on the brink.
                                                
                                                
                                        At midnight, that peace dissolved. A red mist rolled in like a tide, swallowing the starlight and shrouding the plains in a suffocating silence. Jolted awake, %s felt the air thicken, their own heartbeat the only sound breaking the unnatural hush. Within the mist, shadows shifted and elongated, their unnatural, humanlike forms flickering like echoes of tormented souls. Then came the laughter—soft, mocking, and uncomfortably familiar.
                                                
                                        "Show yourself!" %s demanded, voice trembling.
                                                
                                        The shadows coalesced into a figure just beyond sight. Before %s could react, a sudden force struck from behind, sending them crashing into a weathered stone pillar. Scrambling to escape the cascade of debris, they gasped for air as the mocking laughter grew louder, reverberating through the mist like a twisted reflection of their own voice.
                                                
                                        Realizing they were in no state to fight, %s fled into the darkness, haunted by memories of family and friends left behind. The journey became a desperate flight through a graveyard of recollections, each step stirring a resolve to return and confront whatever horrors awaited them at dawn.
                                                
                                                
                                        By sunrise, %s once again stood in their decayed hometown, its streets void of life, the silence oppressive. Every echo and shadow seemed to hold secrets, the air thick with an unseen presence. At last, unable to bear the tension, %s spun around, shouting into the emptiness, "Why are you following me? What do you want?"
                                                
                                        A voice, sharp and cold, responded, "To tie up loose ends."
                                                
                                        From the shadows stepped a figure identical to %s, every feature mirrored but twisted by malice. "I am what you could never become," the figure sneered. "Stronger. Wiser. Perfected. You’re nothing but a ghost clinging to the past."
                                                
                                        %s’s fists clenched, anger mingling with fear. "What purpose does destroying this land serve?"
                                                
                                        The figure smirked. "Impatience suits you. Let’s settle this now."
                                                
                                        The ground cracked and gave way, transporting them to a suspended stone platform in an endless void. Crimson crystal spears erupted below, their deadly points gleaming in the dim light. The corrupted figure raised their arms, summoning dark energy that crackled like a storm.
                                                
                                        "Only one of us leaves this place," they declared. "Let’s make this interesting."
                                                
                                        %s steadied their weapon, each breath weighted with the battles and memories that had defined them. This final confrontation would decide the fate of their world. As the corrupted figure charged, hatred burning in their eyes, %s stepped forward, ready to face the darkness head-on.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming World Boss Battle with Corrupted %s ]
                                        """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                                );
                            case 8:
                            default:
                                return String.format("""
                                        The stillness was broken by a faint rustling, sharp and rhythmic, coming from all around. %s focused his mind, feeling quick, cunning presences flit from tree to tree. Then, a Psionic Goblin appeared in the path, as if it was waiting all along.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Psionic Goblin ]
                                        """, HERO.getNAME()
                                );
                        }
                }
            case "Mazupe":
                switch (currWorld){
                    case 1:
                        switch (currEncounter){
                            case 1:
                                return String.format("""
                                        The forest around him grew colder, and a soft mist rolled in, twisting through the trees. %s’s focus sharpened as he felt a dark presence seep through the air—Nightmare Sylphs, elusive and ethereal, slipped out of the mist, and the world around him began to twist, visions pulling at his fears and doubts.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Nightmare Sylphs ]
                                        """, HERO.getNAME()
                                );
                            case 2:
                                return """
                                        As he ventured further, a sharp chill fell over the forest, and an oppressive silence settled around him. The shadows seemed to thicken, draining the light from the trees and stones. A dark, void-like presence approached—the Shadowmaster—its eldritch energy swirling through the clearing.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Shadowmaster of the Void ]
                                        """;
                            case 3:
                                return String.format("""
                                        As %s moved through the denser parts of the forest, a faint hissing echoed through the trees. He halted, feeling sharp presences slithering closer—Spectral Serpents were drawn to his psionic energy, their forms ghostly and predatory.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Spectral Serpents ]
                                        """, HERO.getNAME()
                                );
                            case 4:
                                return String.format("""
                                        Continuing forward, %s spotted faint shadows above him, and a chorus of shrieks shattered the stillness. Spectral Harpies circled the treetops, diving in swift, disorienting attacks.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Spectral Serpents ]
                                        """, HERO.getNAME()
                                );
                            case 5:
                                return String.format("""
                                        The %s stepped onto the darker trail, where trees twisted in grotesque shapes and shadows whispered terrible secrets. The atmosphere grew stifling, thick with vile energy that seemed to consume light itself.
                                        
                                        A low, rumbling growl vibrated through the ground. Ahead, shadows coalesced into the towering Abomination of the Deep—a shifting mass of dark energy that defied comprehension.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Abomination of the Deep ]
                                        """, HERO.getNAME()
                                );
                            case 6:
                                return String.format("""
                                        After the grueling trials, %s stumbled into a hidden sanctuary veiled within the depths of the forest. The air was thick with psionic energy, yet here it felt different—gentle, almost soothing. The energy flowed around in soft waves, lifting the ache from weary muscles, and easing the weight from a battle-worn mind. Vibrant streams of light pulsed gently from ancient stones arranged in a circle, their runes glowing with a soft, ethereal light that whispered of ancient strength and wisdom passed down through generations.
                                        
                                        As %s moved into the heart of the sanctuary, the wounds across battered skin began to close, the bruises fading as the psionic energy knit flesh back together. A calm washed over the space, soothing the battle-worn tension, and thoughts cleared, the exhaustion receding as strength returned. Taking a slow, deep breath, (Chosen Character) felt the sanctuary's power seep into the core, grounding the spirit, bringing forth memories of purpose.
                                        
                                        For the first time in what felt like an eternity, there was peace, however brief, and in that stillness, %s drew upon the wisdom of those who had come before. The trials were far from over, but with this sanctuary's ancient energy surrounding the space, came renewal and readiness to face whatever lay ahead.
                                        
                                        
                                        
                                        >> [ YOU HAVE FOUND A SAFE SPOT ]
                                        """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                                );
                            case 7:
                                return String.format("""
                                        The mist clung to the ground, blurring reality as %s stepped into the clearing. Once a place of joy and gatherings, it was now swallowed by silence, broken only by whispers of times past.
                                        
                                        At the edge of the shadows, Radea stood—a twisted figure cloaked in dark energy. The warmth in their once-bright eyes was gone, replaced by an emptiness glowing red.
                                        
                                        "%s," Radea hissed, their voice laced with venom. "You abandoned me to this ruin, this darkness."
                                        
                                        %s took a faltering step forward. "No, Radea. I didn't abandon you. We were separated—I would never choose this."
                                        
                                        Radea's sharp, mocking laugh cut through the mist. "Liar! You were always the chosen one, basking in glory while I was left in shadow. Now, this darkness is all I am."
                                        
                                        The clearing pulsed with fury as shadows crept toward %s, claws of hatred pulling everything into the void. Desperate, %s whispered, "I searched for you every day. I never stopped."
                                        
                                        "Save your words," Radea spat. "Do you think this can be fixed? I have become something beyond you, and you... you are my only enemy."
                                        
                                        Shadows swirled violently, Radea’s broken soul given form. "%s," they whispered, voice trembling but resolute. "Face me and die, for that is the only end I will accept."
                                        
                                        The clearing darkened, suffocating with grief and resentment. Where joy had once thrived, now only two figures remained. %s, heart breaking, whispered, "Then let’s end this." Raising a weapon, they faced the inevitable—the last battle between what once was and the darkness that now consumed it all.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming World Boss Battle with Corrupted Radea ]
                                        """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                                );
                            case 8:
                            default:
                                return String.format("""
                                        The stillness was broken by a faint rustling, sharp and rhythmic, coming from all around. %s focused his mind, feeling quick, cunning presences flit from tree to tree. Then, a Psionic Goblin appeared in the path, as if it was waiting all along.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Psionic Goblin ]
                                        """, HERO.getNAME()
                                );
                        }
                    case 2:
                        switch (currEncounter){
                            case 1:
                                return String.format("""
                                        As they continued, a group of Azrue Blade Dancers appeared, their movements fluid and precise, circling around %s with a deadly grace. These warriors were once revered for their elegance in combat, but now their eyes were filled with a predatory gleam, their attacks driven by dark energy.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Azrueian Blade Dancers ]
                                        """, HERO.getNAME()
                                );
                            case 2:
                                return String.format("""
                                        The mist thickened, and %s felt a shift in the air as a figure emerged—a Twisted Bladedancer, embodying a chaotic mix of speed and arcane power. This fighter moved with a fluidity that would once have been awe-inspiring, but now it was a deadly, distorted dance.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Twisted Bladedancer ]
                                        """, HERO.getNAME()
                                );
                            case 3:
                                return String.format("""
                                        A faint sound caught their attention, and %s saw the quick, darting figures of Azrue Scouts emerging from the shadows. Once messengers and gatherers of knowledge, these Scouts had been twisted, their keen senses and speed turned into tools of aggression.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Azrueian Scouts ]
                                        """, HERO.getNAME()
                                );
                            case 4:
                                return """
                                        On the outskirts of a shadowed field, a group of Azrue WindRanger emerged, their forms blurred as they moved with incredible speed. They struck with ruthless precision, their former grace turned into a weapon of twisted vengeance.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Azrueian WindRanger ]
                                        """;
                            case 5:
                                return String.format("""
                                        %s took a steadying breath and stepped onto the shadowed path. Dark energy clung to the air, swirling with the oppressive aura of the Chronomancer of Dread, who stood waiting, their eyes filled with dark intelligence.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Chronomancer of Dread ]
                                        """, HERO.getNAME()
                                );
                            case 6:
                                return String.format("""
                                        At last, %s found a hidden sanctuary, where the winds swept through open arches, whispering of the past. They took a moment to rest and gather their strength, feeling the winds ease their fatigue and heal their wounds.
                                        
                                        
                                        
                                        >> [ YOU HAVE FOUND A SAFE SPOT ]
                                        """, HERO.getNAME()
                                );
                            case 7:
                                return String.format("""
                                        The mountain’s peak stretched vast and desolate, crowned by the ancient colosseum—a dark monument to a forgotten age. Its blackened stone walls, embedded with pulsing red crystals, exuded a sinister energy. This place, once a sanctuary for the Azures, had been where speed and skill were celebrated, where friends had become legends. But now, silence and a heavy presence lingered, shadows whispering of lost glory.
                                        
                                        As %s approached, the bone-deep chill of the thin air carried traces of the past. Steps echoed faintly, and visions of warriors training, laughing, and racing across the stones seemed to flicker in the mind’s eye. Reaching the colosseum’s edge, %s froze.
                                        
                                        A figure stood still against the darkened sky, framed by jagged spires and the eerie glow of the crystals. It was Zipau, their form flickering as if caught between dimensions. Crimson lightning arced from their hands, and their once-familiar face had become a haunting mask of malice.
                                        
                                        %s’s breath caught, memories swirling. A thousand words fought to emerge, but before any could, Zipau vanished in a burst of red lightning, reappearing at the colosseum’s entrance.
                                        
                                        "Zipau..." %s called, voice tinged with sorrow. "It’s me. You don’t have to do this. You can still come back."
                                        
                                        Zipau’s laugh rang cold and mocking, the sound echoing sharply through the colosseum. "Back?" Their voice dripped with bitterness. "Back to what? To a world that discarded me while you moved on? You left me here, abandoned to this darkness."
                                        
                                        "No!" %s pleaded, stepping forward. "I never abandoned you. I searched for you, Zipau. I swear it. This corruption—it’s twisting you, but it’s not who you are. You’re stronger than this."
                                        
                                        Zipau sneered, eyes glowing with scorn. "Still clinging to that naive hope? Look around, %s." A hand gestured to the corrupted arena as the crystals flared. "This is all that’s left. You’re a fool to think you can save me."
                                        
                                        Crimson lightning crackled as Zipau moved in flashes, tainting the arena with streaks of corruption. Their laughter, once warm, had twisted into something sharp and cruel. "If you want to try saving me," Zipau mocked, voice echoing from all directions, "then prove yourself. Or are you still afraid?"
                                        
                                        Heart heavy, %s stepped across the colosseum’s threshold. Memories surged—training side by side, pushing each other, sharing dreams. The ghosts of their past seemed to linger in the air, reminders of the bond they once shared.
                                        
                                        Reaching the arena’s center, %s felt the shadows thicken. From the depths, Zipau emerged, red lightning casting their face in a sinister glow.
                                        
                                        "This won’t hurt," Zipau taunted, their voice a dark, mocking promise.
                                        
                                        %s’s fists clenched, sadness giving way to determination. "It doesn’t have to be like this, Zipau," %s said, desperation threading through the words. "We fought together here. We made each other stronger. Don’t throw it all away."
                                        
                                        Zipau’s expression hardened, contempt flickering in their eyes. "You still don’t get it. Those memories mean nothing. I wasted time as your friend, watching you take the glory. Not anymore."
                                        
                                        Grief weighed heavily on %s’s heart, but they stepped closer, voice steady. "Then I’ll fight you—not to hurt you, but because I believe in the friend you once were. And I’ll keep fighting until I find them again."
                                        
                                        
                                        
                                        >> [ WARNING: Incoming World Boss Battle with Corrupted Zipau ]
                                        """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                                );
                            case 8:
                            default:
                                return String.format("""
                                        As they moved forward, a sudden movement caught the %s’s eye. A group of Azrue Skirmishers approached, their forms blurred by their speed. These warriors once fought to protect their people, but now their eyes glinted with something darker, their movements sharpened by a twisted purpose.    
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Azrueian Skirmishers ]
                                        """, HERO.getNAME()
                                );
                        }
                    case 3:
                    default:
                        switch (currEncounter){
                            case 1:
                                return """
                                        As they climbed higher, a group of Quacera Sentinels blocked their way, their eyes vacant and devoid of recognition. These were the steadfast protectors of Vurgar’s borders, now twisted into relentless enforcers of corruption.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Quacera Sentinels ]
                                        """;
                            case 2:
                                return String.format("""
                                        The %s took a steadying breath and stepped onto the narrow trail. Dark shadows loomed along rocky walls, and the air thickened with the Warlord's corrupted presence. At the cliff's summit stood the massive figure, his scarred armor and cold gaze promising destruction.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Warlord of Ruin ]
                                        """, HERO.getNAME()
                                );
                            case 3:
                                return String.format("""
                                        Taking the longer route, %s descended into the gorge. Soon, the sounds of warriors sparring echoed through canyon walls. A group of Smashkin spotted them, eyes blazing with battle-hunger
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Quacera Smashkin ]
                                        """, HERO.getNAME()
                                );
                            case 4:
                                return """
                                        A group of Quacera Wardens, once the esteemed protectors of their kin, now approached with blank stares and dark energy. They launched their attack, twisted pride driving them forward.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Quacera Wardens ]
                                        """;
                            case 5:
                                return """
                                        As they moved deeper into the heart of Vurgar, an oppressive shadow loomed over them—a Titan of the Abyss. Massive and unyielding, it embodied raw strength corrupted into pure malice, each footstep shaking the ground.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Titan of the Abyss ]
                                        """;
                            case 6:
                                return String.format("""
                                        After the intense challenges, %s stumbled upon a hidden Quacera sanctuary. Here, they found a small oasis where they could rest, surrounded by carved stone walls honoring warriors who had come before. They meditated, feeling the strength of their ancestors flow through them, preparing for the final trial ahead.
                                        
                                        
                                        
                                        >> [ YOU HAVE FOUND A SAFE SPOT ]
                                        """, HERO.getNAME()
                                );
                            case 7:
                                return String.format(
                                        """
                                        In the heart of their homeland, %s wandered through streets once filled with laughter and life, now eerily silent and draped in decay. The air was heavy with the weight of abandonment, the crumbling buildings and overgrown pathways testaments to the time and tragedy that had passed. Memories of a vibrant past haunted every corner, each familiar landmark a painful reminder of what had been lost. Despite the desolation, %s pressed forward, driven by a lingering hope to uncover the truth behind the shadows consuming their world.
                                                
                                        As the sun began its descent, casting long, haunting shadows over the land, %s reached the outskirts of the village, where remnants of an ancient battlefield lay. The plains of Erotoma stretched out ahead, and in the distance loomed the colossal resting form of Gaius, a legendary warrior of the Eternal Colossi Faction. His massive stone visage, half-submerged in the earth, seemed to gaze upward as though guarding the land even in death. The sight stirred both sorrow and reverence within %s, a painful echo of a past filled with both triumph and loss.
                                                
                                        Seeking solace, %s set up camp near the fallen giant. Beneath the faint glow of ancient runes etched into Gaius’s stone form, they found a brief respite from the weight of their journey. The hum of energy radiating from the Colossus held back the creeping darkness, offering a fragile sense of peace—a rare comfort in a world teetering on the brink.
                                                
                                                
                                        At midnight, that peace dissolved. A red mist rolled in like a tide, swallowing the starlight and shrouding the plains in a suffocating silence. Jolted awake, %s felt the air thicken, their own heartbeat the only sound breaking the unnatural hush. Within the mist, shadows shifted and elongated, their unnatural, humanlike forms flickering like echoes of tormented souls. Then came the laughter—soft, mocking, and uncomfortably familiar.
                                                
                                        "Show yourself!" %s demanded, voice trembling.
                                                
                                        The shadows coalesced into a figure just beyond sight. Before %s could react, a sudden force struck from behind, sending them crashing into a weathered stone pillar. Scrambling to escape the cascade of debris, they gasped for air as the mocking laughter grew louder, reverberating through the mist like a twisted reflection of their own voice.
                                                
                                        Realizing they were in no state to fight, %s fled into the darkness, haunted by memories of family and friends left behind. The journey became a desperate flight through a graveyard of recollections, each step stirring a resolve to return and confront whatever horrors awaited them at dawn.
                                                
                                                
                                        By sunrise, %s once again stood in their decayed hometown, its streets void of life, the silence oppressive. Every echo and shadow seemed to hold secrets, the air thick with an unseen presence. At last, unable to bear the tension, %s spun around, shouting into the emptiness, "Why are you following me? What do you want?"
                                                
                                        A voice, sharp and cold, responded, "To tie up loose ends."
                                                
                                        From the shadows stepped a figure identical to %s, every feature mirrored but twisted by malice. "I am what you could never become," the figure sneered. "Stronger. Wiser. Perfected. You’re nothing but a ghost clinging to the past."
                                                
                                        %s’s fists clenched, anger mingling with fear. "What purpose does destroying this land serve?"
                                                
                                        The figure smirked. "Impatience suits you. Let’s settle this now."
                                                
                                        The ground cracked and gave way, transporting them to a suspended stone platform in an endless void. Crimson crystal spears erupted below, their deadly points gleaming in the dim light. The corrupted figure raised their arms, summoning dark energy that crackled like a storm.
                                                
                                        "Only one of us leaves this place," they declared. "Let’s make this interesting."
                                                
                                        %s steadied their weapon, each breath weighted with the battles and memories that had defined them. This final confrontation would decide the fate of their world. As the corrupted figure charged, hatred burning in their eyes, %s stepped forward, ready to face the darkness head-on.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming World Boss Battle with Corrupted %s ]
                                        """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                                );
                            case 8:
                            default:
                                return String.format("""
                                        At the base of a cliff, a group of Quacera Initiates appeared, their young faces filled with determination yet shadowed with a hint of something darker. They recognized %s, but their loyalty had been twisted by corruption, driving them to see their former ally as an enemy.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Quacera Initiates ]
                                        """, HERO.getNAME()
                                );
                        }
                }
            case "Zipau":
            default:
                switch (currWorld){
                    case 1:
                        switch (currEncounter){
                            case 1:
                                return """
                                        As they climbed higher, a group of Quacera Sentinels blocked their way, their eyes vacant and devoid of recognition. These were the steadfast protectors of Vurgar’s borders, now twisted into relentless enforcers of corruption.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Quacera Sentinels ]
                                        """;
                            case 2:
                                return String.format("""
                                        The %s took a steadying breath and stepped onto the narrow trail. Dark shadows loomed along rocky walls, and the air thickened with the Warlord's corrupted presence. At the cliff's summit stood the massive figure, his scarred armor and cold gaze promising destruction.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Warlord of Ruin ]
                                        """, HERO.getNAME()
                                );
                            case 3:
                                return String.format("""
                                        Taking the longer route, %s descended into the gorge. Soon, the sounds of warriors sparring echoed through canyon walls. A group of Smashkin spotted them, eyes blazing with battle-hunger
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Quacera Smashkin ]
                                        """, HERO.getNAME()
                                );
                            case 4:
                                return """
                                        A group of Quacera Wardens, once the esteemed protectors of their kin, now approached with blank stares and dark energy. They launched their attack, twisted pride driving them forward.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Quacera Wardens ]
                                        """;
                            case 5:
                                return """
                                        As they moved deeper into the heart of Vurgar, an oppressive shadow loomed over them—a Titan of the Abyss. Massive and unyielding, it embodied raw strength corrupted into pure malice, each footstep shaking the ground.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Titan of the Abyss ]
                                        """;
                            case 6:
                                return String.format("""
                                        After the intense challenges, %s stumbled upon a hidden Quacera sanctuary. Here, they found a small oasis where they could rest, surrounded by carved stone walls honoring warriors who had come before. They meditated, feeling the strength of their ancestors flow through them, preparing for the final trial ahead.
                                        
                                        
                                        
                                        >> [ YOU HAVE FOUND A SAFE SPOT ]
                                        """, HERO.getNAME()
                                );
                            case 7:
                                return String.format("""
                                        After a grueling climb through relentless winds and treacherous terrain, %s reached the summit. The frigid air clung tightly, and the darkening skies cast an eerie glow over the mountains below. This sacred site, where Quacera royalty had been crowned, now bore a shadow of corruption.
                                        
                                        In the clearing stood Mazupe, their once-noble form grotesquely fused with darkened armor, veins pulsing with an unnatural glow. They turned, rage-filled eyes meeting %s's gaze. A flicker of recognition passed, but it was buried beneath hatred.
                                        
                                        "Mazupe," %s called softly. "It’s me. Do you remember who you were?"
                                        
                                        A growl rose from Mazupe’s chest. "Who I was? I am nothing but decay, abandoned atop these cliffs while you... you left me to rot."
                                        
                                        Pain tightened in %s's chest, but their gaze stayed firm. "I never abandoned you. The corruption—it’s not who you are. The Mazupe I knew wouldn’t surrender to this darkness."
                                        
                                        Mazupe's laugh was harsh. "Lies! You were always celebrated while I was cast into shadow, forgotten. I became nothing, just a pawn."
                                        
                                        The ground trembled as Mazupe stepped forward, shadows swallowing the clearing. "You took everything I was and left me with this!" A corrupted fist glowed with dark energy, raised in fury.
                                        
                                        %s stood their ground. "You were a protector of your clan, a warrior of honor. This darkness doesn’t define you. I came here because I believe in that warrior still."
                                        
                                        For a moment, doubt flickered in Mazupe’s expression, but it was smothered by rage. "You speak of honor?" they hissed. "Where was your honor when I was left to this fate? There is no honor left in me—only rage."
                                        
                                        With a roar, Mazupe lunged, shaking the mountain. Ancient pillars crumbled as a massive fist crashed down, splitting the earth. %s barely dodged the blow, feeling the raw power tear through the ground.
                                        
                                        "Is this truly what you want?" %s shouted over the chaos. "To let corruption destroy everything we stood for?"
                                        
                                        Mazupe’s bitter laugh rang out. "There’s nothing left to stand for! All I was—my strength, my loyalty—was discarded! Now, I’ll take everything from you, as you took everything from me!"
                                        
                                        With another roar, they charged, shadows swirling like a storm, the mountaintop trembling under the weight of a once-noble soul consumed by darkness.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming World Boss Battle with Corrupted Mazupe ]
                                        """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                                );
                            case 8:
                            default:
                                return String.format("""
                                        At the base of a cliff, a group of Quacera Initiates appeared, their young faces filled with determination yet shadowed with a hint of something darker. They recognized %s, but their loyalty had been twisted by corruption, driving them to see their former ally as an enemy.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Quacera Initiates ]
                                        """, HERO.getNAME()
                                );
                        }
                    case 2:
                        switch (currEncounter){
                            case 1:
                                return String.format("""
                                        The forest around him grew colder, and a soft mist rolled in, twisting through the trees. %s’s focus sharpened as he felt a dark presence seep through the air—Nightmare Sylphs, elusive and ethereal, slipped out of the mist, and the world around him began to twist, visions pulling at his fears and doubts.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Nightmare Sylphs ]
                                        """, HERO.getNAME()
                                );
                            case 2:
                                return """
                                        As he ventured further, a sharp chill fell over the forest, and an oppressive silence settled around him. The shadows seemed to thicken, draining the light from the trees and stones. A dark, void-like presence approached—the Shadowmaster—its eldritch energy swirling through the clearing.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Shadowmaster of the Void ]
                                        """;
                            case 3:
                                return String.format("""
                                        As %s moved through the denser parts of the forest, a faint hissing echoed through the trees. He halted, feeling sharp presences slithering closer—Spectral Serpents were drawn to his psionic energy, their forms ghostly and predatory.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Spectral Serpents ]
                                        """, HERO.getNAME()
                                );
                            case 4:
                                return String.format("""
                                        Continuing forward, %s spotted faint shadows above him, and a chorus of shrieks shattered the stillness. Spectral Harpies circled the treetops, diving in swift, disorienting attacks.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Spectral Serpents ]
                                        """, HERO.getNAME()
                                );
                            case 5:
                                return String.format("""
                                        The %s stepped onto the darker trail, where trees twisted in grotesque shapes and shadows whispered terrible secrets. The atmosphere grew stifling, thick with vile energy that seemed to consume light itself.
                                        
                                        A low, rumbling growl vibrated through the ground. Ahead, shadows coalesced into the towering Abomination of the Deep—a shifting mass of dark energy that defied comprehension.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Abomination of the Deep ]
                                        """, HERO.getNAME()
                                );
                            case 6:
                                return String.format("""
                                        After the grueling trials, %s stumbled into a hidden sanctuary veiled within the depths of the forest. The air was thick with psionic energy, yet here it felt different—gentle, almost soothing. The energy flowed around in soft waves, lifting the ache from weary muscles, and easing the weight from a battle-worn mind. Vibrant streams of light pulsed gently from ancient stones arranged in a circle, their runes glowing with a soft, ethereal light that whispered of ancient strength and wisdom passed down through generations.
                                        
                                        As %s moved into the heart of the sanctuary, the wounds across battered skin began to close, the bruises fading as the psionic energy knit flesh back together. A calm washed over the space, soothing the battle-worn tension, and thoughts cleared, the exhaustion receding as strength returned. Taking a slow, deep breath, (Chosen Character) felt the sanctuary's power seep into the core, grounding the spirit, bringing forth memories of purpose.
                                        
                                        For the first time in what felt like an eternity, there was peace, however brief, and in that stillness, %s drew upon the wisdom of those who had come before. The trials were far from over, but with this sanctuary's ancient energy surrounding the space, came renewal and readiness to face whatever lay ahead.
                                        
                                        
                                        
                                        >> [ YOU HAVE FOUND A SAFE SPOT ]
                                        """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                                );
                            case 7:
                                return String.format("""
                                        The mist clung to the ground, blurring reality as %s stepped into the clearing. Once a place of joy and gatherings, it was now swallowed by silence, broken only by whispers of times past.
                                        
                                        At the edge of the shadows, Radea stood—a twisted figure cloaked in dark energy. The warmth in their once-bright eyes was gone, replaced by an emptiness glowing red.
                                        
                                        "%s," Radea hissed, their voice laced with venom. "You abandoned me to this ruin, this darkness."
                                        
                                        %s took a faltering step forward. "No, Radea. I didn't abandon you. We were separated—I would never choose this."
                                        
                                        Radea's sharp, mocking laugh cut through the mist. "Liar! You were always the chosen one, basking in glory while I was left in shadow. Now, this darkness is all I am."
                                        
                                        The clearing pulsed with fury as shadows crept toward %s, claws of hatred pulling everything into the void. Desperate, %s whispered, "I searched for you every day. I never stopped."
                                        
                                        "Save your words," Radea spat. "Do you think this can be fixed? I have become something beyond you, and you... you are my only enemy."
                                        
                                        Shadows swirled violently, Radea’s broken soul given form. "%s," they whispered, voice trembling but resolute. "Face me and die, for that is the only end I will accept."
                                        
                                        The clearing darkened, suffocating with grief and resentment. Where joy had once thrived, now only two figures remained. %s, heart breaking, whispered, "Then let’s end this." Raising a weapon, they faced the inevitable—the last battle between what once was and the darkness that now consumed it all.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming World Boss Battle with Corrupted Radea ]
                                        """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                                );
                            case 8:
                            default:
                                return String.format("""
                                        The stillness was broken by a faint rustling, sharp and rhythmic, coming from all around. %s focused his mind, feeling quick, cunning presences flit from tree to tree. Then, a Psionic Goblin appeared in the path, as if it was waiting all along.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Psionic Goblin ]
                                        """, HERO.getNAME()
                                );
                        }
                    case 3:
                    default:
                        switch (currEncounter){
                            case 1:
                                return String.format("""
                                        As they continued, a group of Azrue Blade Dancers appeared, their movements fluid and precise, circling around %s with a deadly grace. These warriors were once revered for their elegance in combat, but now their eyes were filled with a predatory gleam, their attacks driven by dark energy.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Azrueian Blade Dancers ]
                                        """, HERO.getNAME()
                                );
                            case 2:
                                return String.format("""
                                        The mist thickened, and %s felt a shift in the air as a figure emerged—a Twisted Bladedancer, embodying a chaotic mix of speed and arcane power. This fighter moved with a fluidity that would once have been awe-inspiring, but now it was a deadly, distorted dance.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Twisted Bladedancer ]
                                        """, HERO.getNAME()
                                );
                            case 3:
                                return String.format("""
                                        A faint sound caught their attention, and %s saw the quick, darting figures of Azrue Scouts emerging from the shadows. Once messengers and gatherers of knowledge, these Scouts had been twisted, their keen senses and speed turned into tools of aggression.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Azrueian Scouts ]
                                        """, HERO.getNAME()
                                );
                            case 4:
                                return """
                                        On the outskirts of a shadowed field, a group of Azrue WindRanger emerged, their forms blurred as they moved with incredible speed. They struck with ruthless precision, their former grace turned into a weapon of twisted vengeance.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Azrueian WindRanger ]
                                        """;
                            case 5:
                                return String.format("""
                                        %s took a steadying breath and stepped onto the shadowed path. Dark energy clung to the air, swirling with the oppressive aura of the Chronomancer of Dread, who stood waiting, their eyes filled with dark intelligence.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Chronomancer of Dread ]
                                        """, HERO.getNAME()
                                );
                            case 6:
                                return String.format("""
                                        At last, %s found a hidden sanctuary, where the winds swept through open arches, whispering of the past. They took a moment to rest and gather their strength, feeling the winds ease their fatigue and heal their wounds.
                                        
                                        
                                        
                                        >> [ YOU HAVE FOUND A SAFE SPOT ]
                                        """, HERO.getNAME()
                                );
                            case 7:
                                return String.format(
                                        """
                                        In the heart of their homeland, %s wandered through streets once filled with laughter and life, now eerily silent and draped in decay. The air was heavy with the weight of abandonment, the crumbling buildings and overgrown pathways testaments to the time and tragedy that had passed. Memories of a vibrant past haunted every corner, each familiar landmark a painful reminder of what had been lost. Despite the desolation, %s pressed forward, driven by a lingering hope to uncover the truth behind the shadows consuming their world.
                                                
                                        As the sun began its descent, casting long, haunting shadows over the land, %s reached the outskirts of the village, where remnants of an ancient battlefield lay. The plains of Erotoma stretched out ahead, and in the distance loomed the colossal resting form of Gaius, a legendary warrior of the Eternal Colossi Faction. His massive stone visage, half-submerged in the earth, seemed to gaze upward as though guarding the land even in death. The sight stirred both sorrow and reverence within %s, a painful echo of a past filled with both triumph and loss.
                                                
                                        Seeking solace, %s set up camp near the fallen giant. Beneath the faint glow of ancient runes etched into Gaius’s stone form, they found a brief respite from the weight of their journey. The hum of energy radiating from the Colossus held back the creeping darkness, offering a fragile sense of peace—a rare comfort in a world teetering on the brink.
                                                
                                                
                                        At midnight, that peace dissolved. A red mist rolled in like a tide, swallowing the starlight and shrouding the plains in a suffocating silence. Jolted awake, %s felt the air thicken, their own heartbeat the only sound breaking the unnatural hush. Within the mist, shadows shifted and elongated, their unnatural, humanlike forms flickering like echoes of tormented souls. Then came the laughter—soft, mocking, and uncomfortably familiar.
                                                
                                        "Show yourself!" %s demanded, voice trembling.
                                                
                                        The shadows coalesced into a figure just beyond sight. Before %s could react, a sudden force struck from behind, sending them crashing into a weathered stone pillar. Scrambling to escape the cascade of debris, they gasped for air as the mocking laughter grew louder, reverberating through the mist like a twisted reflection of their own voice.
                                                
                                        Realizing they were in no state to fight, %s fled into the darkness, haunted by memories of family and friends left behind. The journey became a desperate flight through a graveyard of recollections, each step stirring a resolve to return and confront whatever horrors awaited them at dawn.
                                                
                                                
                                        By sunrise, %s once again stood in their decayed hometown, its streets void of life, the silence oppressive. Every echo and shadow seemed to hold secrets, the air thick with an unseen presence. At last, unable to bear the tension, %s spun around, shouting into the emptiness, "Why are you following me? What do you want?"
                                                
                                        A voice, sharp and cold, responded, "To tie up loose ends."
                                                
                                        From the shadows stepped a figure identical to %s, every feature mirrored but twisted by malice. "I am what you could never become," the figure sneered. "Stronger. Wiser. Perfected. You’re nothing but a ghost clinging to the past."
                                                
                                        %s’s fists clenched, anger mingling with fear. "What purpose does destroying this land serve?"
                                                
                                        The figure smirked. "Impatience suits you. Let’s settle this now."
                                                
                                        The ground cracked and gave way, transporting them to a suspended stone platform in an endless void. Crimson crystal spears erupted below, their deadly points gleaming in the dim light. The corrupted figure raised their arms, summoning dark energy that crackled like a storm.
                                                
                                        "Only one of us leaves this place," they declared. "Let’s make this interesting."
                                                
                                        %s steadied their weapon, each breath weighted with the battles and memories that had defined them. This final confrontation would decide the fate of their world. As the corrupted figure charged, hatred burning in their eyes, %s stepped forward, ready to face the darkness head-on.
                                        
                                        
                                        
                                        >> [ WARNING: Incoming World Boss Battle with Corrupted %s ]
                                        """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                                );
                            case 8:
                            default:
                                return String.format("""
                                        As they moved forward, a sudden movement caught the %s’s eye. A group of Azrue Skirmishers approached, their forms blurred by their speed. These warriors once fought to protect their people, but now their eyes glinted with something darker, their movements sharpened by a twisted purpose.    
                                        
                                        
                                        
                                        >> [ WARNING: Incoming battle with Azrueian Skirmishers ]
                                        """, HERO.getNAME()
                                );
                        }
                }
        }
    }


    @Override
    public void onInputReceived(String input) {
        GAME.nextEncounter();
        switch (currEncounter+1){
            case 1:
                System.out.println("Going to next _1_Norm...");
                GAME.nextScene(EVENT1);
                break;
            case 2:
                System.out.println("Going to next _2_Norm...");
                GAME.nextScene(EVENT2);
                break;
            case 3:
                System.out.println("Going to next _3_Elite...");
                GAME.nextScene(EVENT3);
                break;
            case 4:
                System.out.println("Going to next _4_Norm...");
                GAME.nextScene(EVENT4);
                break;
            case 5:
                System.out.println("Going to next _5_Norm...");
                GAME.nextScene(EVENT5);
                break;
            case 6:
                System.out.println("Going to next _6_Choose...");
                GAME.nextScene(EVENT6);
                break;
            case 7:
                System.out.println("Going to next _7_Rest...");
                GAME.nextScene(EVENT7);
                break;
            case 8:
                System.out.println("Going to next _8_Boss...");
                GAME.nextScene(EVENT8);
                break;
        }
    }
}