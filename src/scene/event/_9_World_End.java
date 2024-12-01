package scene.event;

import elements.creature.hero.Hero;
import game.Game;

import static game.WhichScene.MENU;
import static game.WhichScene.START;


public class _9_World_End extends Event {

    public _9_World_End(Hero HERO, int currWorld, Game GAME){
        super(HERO,currWorld,GAME);
    }

    @Override
    protected String displayText_Display() {
        switch (HERO.getNAME()){
            case "Radea":
                return switch (currWorld) {
                    case 1 -> String.format("""
                            The battle was fierce and unrelenting, but at last, Zipau faltered, red lightning flickering and fading as knees hit the ground. Breaths came shallow, strength sapped. %s hesitated, clinging to the faint hope that perhaps, just perhaps, Zipau could still be saved. Kneeling down, %s gently placed a hand on the fallen friend's shoulder.
                            
                            "Zipau... come back," %s whispered, anguish clear in their voice. "Remember who you are. Remember us."
                            
                            For a moment, Zipau's gaze softened. Those cold, distant eyes regained a trace of their former warmth, looking up at %s with a glimmer of recognition.
                            
                            "%s..." Zipau murmured, voice barely a whisper, the weight of their friendship flickering back to life. But then confusion shadowed their face. "Why do I remember... a world that's lost to me?"
                            
                            The question hung heavy, an echo of another time. %s's heart twisted, confusion and despair mixing within. Before any response came, a cold whisper echoed—the entity's voice, merciless and absolute. "It's too late for Zipau, %s. Your friend is lost. Free this one from suffering."
                            
                            Tears welled as the weapon lifted, trembling. The task seemed unbearable, yet no choice remained. Driven by painful resolve, the strike came swiftly. The final blow sent Zipau crashing against the colosseum wall, their form dissolving into fragments, leaving only the lingering echo of what had been.
                            
                            Silence filled the arena, but within %s, a storm of emotions raged—anger, regret, sorrow, and a profound sense of loss. No chance to say goodbye, no body to bury, no final peace. Only emptiness remained, a soul fractured by necessary actions.
                            
                            Returning to the sanctuary, sleep proved elusive. Questions raced through %s's mind, haunted by Zipau's last words and the vision of "another world." Confusion and despair filled the night, leading to restless sleep, desperate for answers that wouldn’t come.
                            
                            Morning brought an ominous quiet, and as %s's eyes opened, a shadowy hooded figure stood at the sanctuary's edge. Red, piercing eyes stared forward, filled with malevolence.
                            
                            Acting on instinct, %s leapt forward, weapon ready. But before closing the distance, the figure raised a hand, and a powerful force hurled %s backward, cracking the ground on impact. A cruel, mocking laugh filled the air.
                            
                            "Tick... Tick... Boom!" the figure sneered, each word laced with menace. Then, with a burst of dark energy, it vanished, leaving a lingering fear.
                            
                            %s lay on the ground, catching their breath, mind racing. The figure's power and ominous words felt like pieces of some greater, darker plan. Fear crept in—fear of what the message meant and the horrors yet to come.
                            
                            Scrambling to stand, %s gathered belongings, casting a mournful look toward the colosseum and sanctuary. No true farewell to Zipau had been possible, and now even that comfort was denied. With every step, the loss and the hooded figure's words weighed heavily, a burden pressing upon the heart.
                            
                            Leaving the mountain, %s pressed onward, driven not by courage but by a desperate hope to escape the dark fate looming ahead. Yet the figure's voice lingered, its threat refusing to fade.
                            
                            
                            
                            >> [ WORLD 1 FINISHED ]
                            
                            """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                    );
                    case 2 -> String.format("""
                            After the bitter struggle, Mazupe fell to their knees, armor fractured, the dark energy fading like smoke in the cold mountain air. Once imposing, they now appeared fragile, shoulders slumped, the rage and power slipping away. Mazupe looked up at %s, and for a moment, a glimmer of recognition crossed their exhausted, pain-clouded eyes.
                            
                            %s's trembling hand hovered, weapon raised, torn between duty and the hope of saving a friend lost to darkness. "Mazupe," they whispered, voice breaking. "Are you still there? Tell me there's still a part of you left."
                            
                            Before Mazupe could answer, an ancient voice slipped into %s's mind—a cold whisper of ageless authority. "It is too late," the entity declared. "The Mazupe you knew is gone. Lay them to rest."
                            
                            Mazupe's gaze lifted, sorrow and longing in their eyes, as if reaching for a memory of who they once were. "Please..." they murmured, voice heavy with resignation. "End this."
                            
                            With great hesitation, %s raised their weapon, the weight of decision unbearable. Memories of their bond flooded in—laughter, battles fought together—making the act feel like a betrayal. But mercy demanded it. "I'm sorry, Mazupe," %s whispered, a tear slipping down as the blade struck. Mazupe crumpled, the last remnants of darkness seeping away as their body tumbled down the mountainside.
                            
                            A sorrowful peace settled over %s. Scrambling down, they reached Mazupe's lifeless form and knelt beside their friend, words faltering as loss took hold. Suddenly, a faint whisper escaped Mazupe's lips. "Why... do I remember... someone else?" they murmured. "Another... %s... someone who wouldn’t have left me."
                            
                            The words struck like a blow, stirring unease. Another version? The thought clawed at the edges of %s's mind. "Mazupe..." they whispered, but their friend had fallen silent, peaceful at last.
                            
                            With care, %s placed Mazupe’s body on an abandoned cart and climbed the mountain to a sacred overlook. There, beneath the serene sky, they dug a grave, each motion a burial of self. When Mazupe was laid to rest, %s knelt, memories of their bond flooding back. As dusk fell, they poured a drink at the grave. "You were my sibling, Mazupe. I'll carry our memories," they said, voice breaking in a final toast.
                            
                            Through the night, %s kept vigil, haunted by Mazupe’s last words. At dawn, they whispered a final goodbye and descended the mountain, grief and doubt weighing heavy. Near the base, a figure emerged from the mist—cloaked, motionless, with glowing red eyes. The figure’s silent gaze sent a chill through %s, tugging at something familiar, like a dark reflection.
                            
                            When %s called out, the figure vanished, leaving only unease and the entity’s whisper echoing: The Mazupe you knew is gone. The journey back to the citadel offered no answers, only a deepening resolve. Whatever darkness lay ahead, facing it was the only path forward.
                            
                            
                            
                            >> [ WORLD 2 FINISHED ]
                            
                            """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                    );
                    case 3 -> String.format(
                            """
                                    The brutal clash on the stone platform had reached its grim conclusion—a desperate battle between %s and a twisted, corrupted reflection of themselves. Every blow exchanged carried the weight of their scars, betrayals, and bitter memories. Now, as the dust settled, both combatants stood at the brink of collapse. The shadowed figure knelt, trembling and clutching their wounds, the malice that once fueled them now reduced to flickering embers.
                                    
                                    %s staggered forward, their voice shaking with anger and sorrow. "Why?" they demanded. "Why destroy everything—my friends, my home, everything I loved?"
                                    
                                    The figure let out a raspy laugh, their head tilting up just enough to meet the %s's eyes. "Why not? It was all for fun."
                                    
                                    The words struck like a dagger, twisting deep. Grief and rage overwhelmed %s as they surged forward, fists crashing down. Each strike carried the weight of every person lost, every life torn apart, every moment of devastation endured. The shadowed figure absorbed the blows, too broken to resist, laughing faintly even as their body crumbled under the assault, a grim satisfaction gleaming in their gaze.
                                    
                                    When the storm of fury subsided, %s stood over the broken figure, their bloodied knuckles trembling. The platform was silent save for their ragged breaths. But then, a brilliant light pierced the darkness, illuminating the fractured stone. %s turned, heart pounding, to see the radiant figure—the divine presence that had once given them hope.
                                    
                                    "My chosen one," the glowing being said, voice calm and steady. "You have done well."
                                    
                                    Relief surged through %s, tears threatening to spill. "You came…" they whispered. "After everything… you came. But why are you thanking me?"
                                    
                                    The figure's expression remained serene, though a faint glint of malice flickered in its eyes. "Why, for making me powerful."
                                    
                                    Before %s could react, the figure raised a hand, releasing a shockwave that shattered the platform. The ground split apart, and %s scrambled to avoid tumbling into the jagged, blood-red crystal spikes below. In a desperate move, they shoved the shadowed figure aside, propelling themselves toward a ledge. The broken figure fell, their body impaled by the deadly crystals, laughter cut short as their form went limp.
                                    
                                    %s pulled themselves onto the ledge, muscles trembling with exhaustion and fear. Above them, the radiant figure hovered, calm and untouched by the destruction below.
                                    
                                    "Why?" %s called out, their voice raw with anguish. "I trusted you! Through every battle, every loss, I clung to your light. You were my only hope in the darkness."
                                    
                                    The figure’s gaze turned cold, serene calm giving way to a cruel truth. "And your trust was the greatest gift of all. Every soul you cut down, every tear shed, every night spent in grief—it all fed my strength."
                                    
                                    %s’s legs buckled as the weight of betrayal crushed them. "Was any of it real?" they whispered. "My memories, my friends, my purpose… was I real?"
                                    
                                    The figure nodded, slow and deliberate. "You were a creation, a tool. Your memories were crafted to drive you to fight, to suffer. Every moment of your pain, every act of destruction—it was all for me."
                                    
                                    Tears spilled down %s’s face as they clutched their chest, trying to hold onto the fragments of what once felt real. "I killed them all… my friends, my family… because I trusted you. I thought I was saving the world."
                                    
                                    "And in doing so, you gave me everything I needed," the figure said, satisfaction lacing its tone. "Every triumph, every loss—your suffering was my sustenance."
                                    
                                    Grief and fury clashed within %s, but as despair loomed, a spark of resolve ignited. Slowly, they rose to their feet, weapon in hand.
                                    
                                    "Maybe everything I believed was a lie," they said, voice steady despite the pain. "But my resolve? That was mine. You didn’t give me purpose—I chose it."
                                    
                                    The figure’s expression twisted with irritation, its calm mask slipping. "Foolish. If you will not submit, I will erase you."
                                    
                                    The sky darkened as storm clouds churned, red lightning streaking through the heavens. %s stood firm, weapon gleaming in the crimson light, ready to face the being that had destroyed everything they held dear. With fury and grief as their strength, they stepped forward, determined to fight for what little remained of their shattered world.
                                    
                                    
                                    
                                    >> [ WORLD 3 FINISHED ]
                                    """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                    );
                    default -> """
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
                            \n\n\n
                            \n\t\t\t\t\tYOU HAVE FINISHED THE GAME
                            \n\t\t\t\t\t  THANK YOU FOR PLAYING
                            \n\n\t\t\t\t\t\t CREDITS:\n
                            \t\t\t\t\t  John Winston W. Tabada
                            \t\t\t\t\t   Aaron Rey A. Jacalan
                            \t\t\t\t\t   Lovely Shane P. Ong
                            \t\t\t\t\t   Ruhmer Jairus Espina
                            """;
                };
            case "Mazupe":
                return switch (currWorld) {
                    case 1 -> String.format("""
                                    The battle was brutal, a clash of power that scarred both souls. Radea fought with a fierceness deeper than any weapon, each attack carrying years of rage and betrayal. But finally, as the fight waned, Radea fell to knees, weakened and vulnerable. Silence settled heavily, thick as mist, broken only by ragged breaths. \s
                                    
                                    %s stepped forward, heart pounding with a glimmer of hope. If there was any chance to pull Radea back, it had to be tried. %s extended a hand, daring to hope, ready to save Radea if only for a reach back. \s
                                    
                                    Then a cold, absolute voice pierced %s's mind. The whisper echoed, slicing through fragile hope. "You cannot save Radea, %s. The Radea you knew is long gone." The words crushed %s. The extended hand fell, and %s looked at Radea, feeling a wave of defeat. Radea was there, just out of reach, but something vital was missing—the light within, the shared laughter, their once-unbreakable bond. \s
                                    
                                    Tears filled %s's eyes. Raising the weapon one final time, heart torn, it wasn’t a victory—it was a mercy. The strike was agonizing, shattering as Radea's form fell lifeless. \s
                                    
                                    As Radea lay there, rage faded, replaced by something hauntingly familiar. Radea's dimming eyes held a faint, tragic recognition. \s
                                    
                                    "Why, %s?" Radea murmured, voice a fragile whisper of sadness and longing. "Why do I remember... another you—a version of you who never let me down?" The words cut like glass, a final echo of who they once were. The light faded from Radea's eyes, and silence took over. \s
                                    
                                    %s fell to knees beside Radea, unable to contain the grief. Memories of their friendship—their laughter, shared dreams, battles fought together—flooded back, stark against the lifeless form. Cradling Radea's body, %s felt the weight of what was lost, the future now gone, the person Radea had been. \s
                                    
                                    With trembling hands, %s lifted Radea and carried toward the capital. Each step reopened wounds, the memories vivid and raw. Finally, %s reached a quiet spot near an ancient, gnarled tree, its branches heavy with age. Laying Radea gently into the earth, %s pressed the body as if seeking peace for both. \s
                                    
                                    Hours passed as %s sat beside Radea, guarding one last time. The day grew long, shadows stretching as %s relived their friendship, every misstep, every triumph, mourning what might have been. Radea's final words echoed: a version of you who never let me down. Guilt wrapped around %s's heart, squeezing tighter with every moment. \s
                                    
                                    The mist thickened, turning cold and foreboding. Looking up, %s saw a strange darkness enshrouding the clearing. From the mist, a hooded figure emerged, silent, its red eyes gleaming ominously. Its icy gaze locked onto %s, almost mocking. \s
                                    
                                    "Who are you?" %s called, voice trembling with anger and sorrow. \s
                                    
                                    The figure laughed, chilling and gleeful. "Tick... Tock... %s," it sneered, words dripping malice. Then, with a rush of dark energy, the figure vanished, leaving only silence and the weight of fear. \s
                                    
                                    Alone, shaken, %s looked down at Radea's grave. The ominous encounter left a sense of being hunted, haunted by incomprehensible shadows. \s
                                    
                                    As the sky dimmed to crimson and gold, %s rose, casting a final look at Radea's resting place. The weight of loss hung heavy, an endless ache. With a hardened heart, %s turned from the grave, leaving Radea's memory etched into the soul. \s
                                    
                                    The journey ahead seemed darker than ever, but with steely resolve, %s continued. For Radea’s sake, the path forward remained clear, though each step carried the pain of a lost friend and the shadow of the darkness now awaiting.
                                    
                                    
                                    
                                    >> [ WORLD 1 FINISHED ]
                                    
                                    """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(),
                            HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                    );
                    case 2 -> String.format("""
                            The battle raged fiercely until Zipau faltered, red lightning fading as they collapsed to their knees. Breathing shallow, strength drained, %s hesitated, clinging to a faint hope that saving Zipau was still possible. Kneeling, they gently placed a hand on their fallen friend’s shoulder.
                            
                            "Zipau... come back," %s whispered, voice heavy with anguish. "Remember who you are. Remember us."
                            
                            For a moment, Zipau’s gaze softened, warmth returning briefly to their cold, distant eyes. "%s..." they murmured faintly, their friendship flickering back to life. But confusion clouded Zipau’s face. "Why do I remember... a world lost to me?"
                            
                            The question lingered painfully, but before %s could respond, the entity's voice cut through coldly. "It’s too late for Zipau. Free this one from suffering."
                            
                            Tears welled as %s raised their weapon with trembling hands. The strike came swiftly, hurling Zipau's form into the colosseum wall, where it shattered and dissolved into fragments. Silence filled the arena, leaving %s overwhelmed by loss, anger, and regret. No farewell, no body, only emptiness remained.
                            
                            Back in the sanctuary, haunted by Zipau’s last words and visions of "another world," %s found no rest. Morning arrived quietly, bringing a hooded figure with piercing red eyes to the sanctuary’s edge. Acting on instinct, %s attacked, but the figure flung them back effortlessly, mocking with a cruel laugh.
                            
                            "Tick... Tick... Boom!" the figure sneered before vanishing in a burst of dark energy, leaving %s shaken and fearful of the unknown plan ahead.
                            
                            Gathering their belongings, %s glanced back toward the colosseum and sanctuary, mourning the inability to truly say goodbye. Pressing onward, they carried the weight of loss and dread, driven by hope to escape the looming darkness while the figure’s chilling words echoed endlessly.
                            
                            
                            
                            >> [ WORLD 2 FINISHED ]
                            
                            """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                    );
                    case 3 -> String.format(
                            """
                                    The brutal clash on the stone platform had reached its grim conclusion—a desperate battle between %s and a twisted, corrupted reflection of themselves. Every blow exchanged carried the weight of their scars, betrayals, and bitter memories. Now, as the dust settled, both combatants stood at the brink of collapse. The shadowed figure knelt, trembling and clutching their wounds, the malice that once fueled them now reduced to flickering embers.
                                    
                                    %s staggered forward, their voice shaking with anger and sorrow. "Why?" they demanded. "Why destroy everything—my friends, my home, everything I loved?"
                                    
                                    The figure let out a raspy laugh, their head tilting up just enough to meet the %s's eyes. "Why not? It was all for fun."
                                    
                                    The words struck like a dagger, twisting deep. Grief and rage overwhelmed %s as they surged forward, fists crashing down. Each strike carried the weight of every person lost, every life torn apart, every moment of devastation endured. The shadowed figure absorbed the blows, too broken to resist, laughing faintly even as their body crumbled under the assault, a grim satisfaction gleaming in their gaze.
                                    
                                    When the storm of fury subsided, %s stood over the broken figure, their bloodied knuckles trembling. The platform was silent save for their ragged breaths. But then, a brilliant light pierced the darkness, illuminating the fractured stone. %s turned, heart pounding, to see the radiant figure—the divine presence that had once given them hope.
                                    
                                    "My chosen one," the glowing being said, voice calm and steady. "You have done well."
                                    
                                    Relief surged through %s, tears threatening to spill. "You came…" they whispered. "After everything… you came. But why are you thanking me?"
                                    
                                    The figure's expression remained serene, though a faint glint of malice flickered in its eyes. "Why, for making me powerful."
                                    
                                    Before %s could react, the figure raised a hand, releasing a shockwave that shattered the platform. The ground split apart, and %s scrambled to avoid tumbling into the jagged, blood-red crystal spikes below. In a desperate move, they shoved the shadowed figure aside, propelling themselves toward a ledge. The broken figure fell, their body impaled by the deadly crystals, laughter cut short as their form went limp.
                                    
                                    %s pulled themselves onto the ledge, muscles trembling with exhaustion and fear. Above them, the radiant figure hovered, calm and untouched by the destruction below.
                                    
                                    "Why?" %s called out, their voice raw with anguish. "I trusted you! Through every battle, every loss, I clung to your light. You were my only hope in the darkness."
                                    
                                    The figure’s gaze turned cold, serene calm giving way to a cruel truth. "And your trust was the greatest gift of all. Every soul you cut down, every tear shed, every night spent in grief—it all fed my strength."
                                    
                                    %s’s legs buckled as the weight of betrayal crushed them. "Was any of it real?" they whispered. "My memories, my friends, my purpose… was I real?"
                                    
                                    The figure nodded, slow and deliberate. "You were a creation, a tool. Your memories were crafted to drive you to fight, to suffer. Every moment of your pain, every act of destruction—it was all for me."
                                    
                                    Tears spilled down %s’s face as they clutched their chest, trying to hold onto the fragments of what once felt real. "I killed them all… my friends, my family… because I trusted you. I thought I was saving the world."
                                    
                                    "And in doing so, you gave me everything I needed," the figure said, satisfaction lacing its tone. "Every triumph, every loss—your suffering was my sustenance."
                                    
                                    Grief and fury clashed within %s, but as despair loomed, a spark of resolve ignited. Slowly, they rose to their feet, weapon in hand.
                                    
                                    "Maybe everything I believed was a lie," they said, voice steady despite the pain. "But my resolve? That was mine. You didn’t give me purpose—I chose it."
                                    
                                    The figure’s expression twisted with irritation, its calm mask slipping. "Foolish. If you will not submit, I will erase you."
                                    
                                    The sky darkened as storm clouds churned, red lightning streaking through the heavens. %s stood firm, weapon gleaming in the crimson light, ready to face the being that had destroyed everything they held dear. With fury and grief as their strength, they stepped forward, determined to fight for what little remained of their shattered world.
                                    
                                    
                                    
                                    >> [ WORLD 3 FINISHED ]
                                    """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                    );
                    default -> """
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
                            \n\n\n
                            \n\t\t\t\t\tYOU HAVE FINISHED THE GAME
                            \n\t\t\t\t\t  THANK YOU FOR PLAYING
                            \n\n\t\t\t\t\t\t CREDITS:\n
                            \t\t\t\t\t  John Winston W. Tabada
                            \t\t\t\t\t   Aaron Rey A. Jacalan
                            \t\t\t\t\t   Lovely Shane P. Ong
                            \t\t\t\t\t   Ruhmer Jairus Espina
                            """;
                };
            case "Zipau":
            default:
                return switch (currWorld) {
                    case 1 -> String.format("""
                            After the bitter struggle, Mazupe fell to their knees, armor fractured, the dark energy fading like smoke in the cold mountain air. Once imposing, they now appeared fragile, shoulders slumped, the rage and power slipping away. Mazupe looked up at %s, and for a moment, a glimmer of recognition crossed their exhausted, pain-clouded eyes.
                            
                            %s's trembling hand hovered, weapon raised, torn between duty and the hope of saving a friend lost to darkness. "Mazupe," they whispered, voice breaking. "Are you still there? Tell me there's still a part of you left."
                            
                            Before Mazupe could answer, an ancient voice slipped into %s's mind—a cold whisper of ageless authority. "It is too late," the entity declared. "The Mazupe you knew is gone. Lay them to rest."
                            
                            Mazupe's gaze lifted, sorrow and longing in their eyes, as if reaching for a memory of who they once were. "Please..." they murmured, voice heavy with resignation. "End this."
                            
                            With great hesitation, %s raised their weapon, the weight of decision unbearable. Memories of their bond flooded in—laughter, battles fought together—making the act feel like a betrayal. But mercy demanded it. "I'm sorry, Mazupe," %s whispered, a tear slipping down as the blade struck. Mazupe crumpled, the last remnants of darkness seeping away as their body tumbled down the mountainside.
                            
                            A sorrowful peace settled over %s. Scrambling down, they reached Mazupe's lifeless form and knelt beside their friend, words faltering as loss took hold. Suddenly, a faint whisper escaped Mazupe's lips. "Why... do I remember... someone else?" they murmured. "Another... %s... someone who wouldn’t have left me."
                            
                            The words struck like a blow, stirring unease. Another version? The thought clawed at the edges of %s's mind. "Mazupe..." they whispered, but their friend had fallen silent, peaceful at last.
                            
                            With care, %s placed Mazupe’s body on an abandoned cart and climbed the mountain to a sacred overlook. There, beneath the serene sky, they dug a grave, each motion a burial of self. When Mazupe was laid to rest, %s knelt, memories of their bond flooding back. As dusk fell, they poured a drink at the grave. "You were my sibling, Mazupe. I'll carry our memories," they said, voice breaking in a final toast.
                            
                            Through the night, %s kept vigil, haunted by Mazupe’s last words. At dawn, they whispered a final goodbye and descended the mountain, grief and doubt weighing heavy. Near the base, a figure emerged from the mist—cloaked, motionless, with glowing red eyes. The figure’s silent gaze sent a chill through %s, tugging at something familiar, like a dark reflection.
                            
                            When %s called out, the figure vanished, leaving only unease and the entity’s whisper echoing: The Mazupe you knew is gone. The journey back to the citadel offered no answers, only a deepening resolve. Whatever darkness lay ahead, facing it was the only path forward.
                            
                            
                            
                            >> [ WORLD 1 FINISHED ]
                            
                            """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                    );
                    case 2 -> String.format("""
                                    The battle was brutal, a clash of power that scarred both souls. Radea fought with a fierceness deeper than any weapon, each attack carrying years of rage and betrayal. But finally, as the fight waned, Radea fell to knees, weakened and vulnerable. Silence settled heavily, thick as mist, broken only by ragged breaths. \s
                                    
                                    %s stepped forward, heart pounding with a glimmer of hope. If there was any chance to pull Radea back, it had to be tried. %s extended a hand, daring to hope, ready to save Radea if only for a reach back. \s
                                    
                                    Then a cold, absolute voice pierced %s's mind. The whisper echoed, slicing through fragile hope. "You cannot save Radea, %s. The Radea you knew is long gone." The words crushed %s. The extended hand fell, and %s looked at Radea, feeling a wave of defeat. Radea was there, just out of reach, but something vital was missing—the light within, the shared laughter, their once-unbreakable bond. \s
                                    
                                    Tears filled %s's eyes. Raising the weapon one final time, heart torn, it wasn’t a victory—it was a mercy. The strike was agonizing, shattering as Radea's form fell lifeless. \s
                                    
                                    As Radea lay there, rage faded, replaced by something hauntingly familiar. Radea's dimming eyes held a faint, tragic recognition. \s
                                    
                                    "Why, %s?" Radea murmured, voice a fragile whisper of sadness and longing. "Why do I remember... another you—a version of you who never let me down?" The words cut like glass, a final echo of who they once were. The light faded from Radea's eyes, and silence took over. \s
                                    
                                    %s fell to knees beside Radea, unable to contain the grief. Memories of their friendship—their laughter, shared dreams, battles fought together—flooded back, stark against the lifeless form. Cradling Radea's body, %s felt the weight of what was lost, the future now gone, the person Radea had been. \s
                                    
                                    With trembling hands, %s lifted Radea and carried toward the capital. Each step reopened wounds, the memories vivid and raw. Finally, %s reached a quiet spot near an ancient, gnarled tree, its branches heavy with age. Laying Radea gently into the earth, %s pressed the body as if seeking peace for both. \s
                                    
                                    Hours passed as %s sat beside Radea, guarding one last time. The day grew long, shadows stretching as %s relived their friendship, every misstep, every triumph, mourning what might have been. Radea's final words echoed: a version of you who never let me down. Guilt wrapped around %s's heart, squeezing tighter with every moment. \s
                                    
                                    The mist thickened, turning cold and foreboding. Looking up, %s saw a strange darkness enshrouding the clearing. From the mist, a hooded figure emerged, silent, its red eyes gleaming ominously. Its icy gaze locked onto %s, almost mocking. \s
                                    
                                    "Who are you?" %s called, voice trembling with anger and sorrow. \s
                                    
                                    The figure laughed, chilling and gleeful. "Tick... Tock... %s," it sneered, words dripping malice. Then, with a rush of dark energy, the figure vanished, leaving only silence and the weight of fear. \s
                                    
                                    Alone, shaken, %s looked down at Radea's grave. The ominous encounter left a sense of being hunted, haunted by incomprehensible shadows. \s
                                    
                                    As the sky dimmed to crimson and gold, %s rose, casting a final look at Radea's resting place. The weight of loss hung heavy, an endless ache. With a hardened heart, %s turned from the grave, leaving Radea's memory etched into the soul. \s
                                    
                                    The journey ahead seemed darker than ever, but with steely resolve, %s continued. For Radea’s sake, the path forward remained clear, though each step carried the pain of a lost friend and the shadow of the darkness now awaiting.
                                    
                                    
                                    
                                    >> [ WORLD 2 FINISHED ]
                                    
                                    """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(),
                            HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                    );
                    case 3 -> String.format(
                            """
                                    The brutal clash on the stone platform had reached its grim conclusion—a desperate battle between %s and a twisted, corrupted reflection of themselves. Every blow exchanged carried the weight of their scars, betrayals, and bitter memories. Now, as the dust settled, both combatants stood at the brink of collapse. The shadowed figure knelt, trembling and clutching their wounds, the malice that once fueled them now reduced to flickering embers.
                                    
                                    %s staggered forward, their voice shaking with anger and sorrow. "Why?" they demanded. "Why destroy everything—my friends, my home, everything I loved?"
                                    
                                    The figure let out a raspy laugh, their head tilting up just enough to meet the %s's eyes. "Why not? It was all for fun."
                                    
                                    The words struck like a dagger, twisting deep. Grief and rage overwhelmed %s as they surged forward, fists crashing down. Each strike carried the weight of every person lost, every life torn apart, every moment of devastation endured. The shadowed figure absorbed the blows, too broken to resist, laughing faintly even as their body crumbled under the assault, a grim satisfaction gleaming in their gaze.
                                    
                                    When the storm of fury subsided, %s stood over the broken figure, their bloodied knuckles trembling. The platform was silent save for their ragged breaths. But then, a brilliant light pierced the darkness, illuminating the fractured stone. %s turned, heart pounding, to see the radiant figure—the divine presence that had once given them hope.
                                    
                                    "My chosen one," the glowing being said, voice calm and steady. "You have done well."
                                    
                                    Relief surged through %s, tears threatening to spill. "You came…" they whispered. "After everything… you came. But why are you thanking me?"
                                    
                                    The figure's expression remained serene, though a faint glint of malice flickered in its eyes. "Why, for making me powerful."
                                    
                                    Before %s could react, the figure raised a hand, releasing a shockwave that shattered the platform. The ground split apart, and %s scrambled to avoid tumbling into the jagged, blood-red crystal spikes below. In a desperate move, they shoved the shadowed figure aside, propelling themselves toward a ledge. The broken figure fell, their body impaled by the deadly crystals, laughter cut short as their form went limp.
                                    
                                    %s pulled themselves onto the ledge, muscles trembling with exhaustion and fear. Above them, the radiant figure hovered, calm and untouched by the destruction below.
                                    
                                    "Why?" %s called out, their voice raw with anguish. "I trusted you! Through every battle, every loss, I clung to your light. You were my only hope in the darkness."
                                    
                                    The figure’s gaze turned cold, serene calm giving way to a cruel truth. "And your trust was the greatest gift of all. Every soul you cut down, every tear shed, every night spent in grief—it all fed my strength."
                                    
                                    %s’s legs buckled as the weight of betrayal crushed them. "Was any of it real?" they whispered. "My memories, my friends, my purpose… was I real?"
                                    
                                    The figure nodded, slow and deliberate. "You were a creation, a tool. Your memories were crafted to drive you to fight, to suffer. Every moment of your pain, every act of destruction—it was all for me."
                                    
                                    Tears spilled down %s’s face as they clutched their chest, trying to hold onto the fragments of what once felt real. "I killed them all… my friends, my family… because I trusted you. I thought I was saving the world."
                                    
                                    "And in doing so, you gave me everything I needed," the figure said, satisfaction lacing its tone. "Every triumph, every loss—your suffering was my sustenance."
                                    
                                    Grief and fury clashed within %s, but as despair loomed, a spark of resolve ignited. Slowly, they rose to their feet, weapon in hand.
                                    
                                    "Maybe everything I believed was a lie," they said, voice steady despite the pain. "But my resolve? That was mine. You didn’t give me purpose—I chose it."
                                    
                                    The figure’s expression twisted with irritation, its calm mask slipping. "Foolish. If you will not submit, I will erase you."
                                    
                                    The sky darkened as storm clouds churned, red lightning streaking through the heavens. %s stood firm, weapon gleaming in the crimson light, ready to face the being that had destroyed everything they held dear. With fury and grief as their strength, they stepped forward, determined to fight for what little remained of their shattered world.
                                    
                                    
                                    
                                    >> [ WORLD 3 FINISHED ]
                                    """, HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME(), HERO.getNAME()
                    );
                    default -> """
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
                            \n\n\n
                            \n\t\t\t\t\tYOU HAVE FINISHED THE GAME
                            \n\t\t\t\t\t  THANK YOU FOR PLAYING
                            \n\n\t\t\t\t\t\t CREDITS:\n
                            \t\t\t\t\t  John Winston W. Tabada
                            \t\t\t\t\t   Aaron Rey A. Jacalan
                            \t\t\t\t\t   Lovely Shane P. Ong
                            \t\t\t\t\t   Ruhmer Jairus Espina
                            """;
                };
        }

    }



    @Override
    public void onInputReceived(String input) {
        GAME.resetEncounter();
        HERO.refresh_world();

        if(currWorld ==4){
            GAME.resetWorld();

            System.out.println("Going back to Menu...");
            GAME.nextScene(MENU);
        }
        else{
            GAME.nextWorld();

            System.out.println("Going to _0_World_Start...");
            GAME.nextScene(START);
        }
    }
}
