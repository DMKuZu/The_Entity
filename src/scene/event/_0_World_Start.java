package scene.event;

import elements.creature.hero.Hero;
import game.Game;


import static game.WhichScene.SCENARIO;
import static game.WhichScene.THE_ENTITY;


public class _0_World_Start extends Event {

    public _0_World_Start(Hero HERO,int currWorld, Game GAME){
        super(HERO, currWorld,GAME);
    }

    @Override
    protected String displayText_Display() {
        return switch (HERO.getNAME()) {
            case "Radea" -> switch (currWorld) {
                case 1 -> String.format(
                        """
                                In the vast, open plains of Erotoma, a faint mist rolled in over the golden grass, a haze filled with the quiet tension of a land touched by corruption. %s advanced across the plains, their keen eyes scanning the horizon, ever-alert to the changes in their homeland. This was once a place of freedom and swiftness, where the Azrue thrived. But now, an unnatural stillness had settled, an ominous warning of what lay ahead.
                                
                                
                                
                                >> [ NOW STARTING WORLD 1 ]
                                """, HERO.getNAME()
                );
                case 2 -> String.format(
                        """
                                The rocky paths of Vurgar rose before %s, winding through barren cliffs and shadowed valleys. The world felt desolate here, touched by corruption and tinged with the dark echoes of the once-proud Quacera race. Strength had been their creed, and every scarred mountain pass held memories of their greatest battles. But now, silence lay heavily over their homeland, broken only by distant echoes and the occasional whisper of corrupted energy.
                                
                                
                                
                                >> [ NOW STARTING WORLD 2 ]
                                """, HERO.getNAME()
                );
                case 3 -> String.format(
                        """
                                The twilight forests of Erotoma stretched before %s, dark and dense with psionic energy that shimmered in the faint light filtering through the treetops. With each step he took deeper into the shadows, he felt the ancient power of the people echoing around him. The sounds of the forest were muffled, replaced by a strange hum that grew louder with each passing moment.
                                
                                
                                
                                >> [ NOW STARTING WORLD 3 ]
                                """, HERO.getNAME()
                );
                default -> String.format(
                        """
                                You have reached the ultimate conclusion of the story, the final chapter where everything hangs in the balance. The air is thick with tension as you stand face to face with %s, the one who has pushed you to the brink. This is the final confrontation, the battle that will determine not only your fate but the fate of all that you hold dear. It is a fight against everything that has tormented you, a mano a mano clash with the very being that has stood in your way, orchestrating your torment and testing your resolve.
                                
                                Every step you’ve taken, every decision, has led you here, to this moment. The pain, the sacrifices, the lost friends—it all converges into a single, defining moment. With your freedom on the line, there can be no hesitation. The stakes are higher than ever before: this isn’t just about victory or defeat—it’s about your very essence, your will to survive.
                                
                                This is the final battle for your freedom. Every blow struck, every move made, will decide whether you remain break free from his chains or succumbed to it. The fight is not only physical but emotional, as you face the truth of everything you’ve endured. The weight of your past, the legacy of your struggles, and the promise of a somewhat better future are all embodied in this one moment. Will you be victorious, or will this battle claim you as yet another casualty of fate?
                                
                                
                                
                                The answer lies in your hands.
                                
                                
                                
                                >> [ WARNING: Incoming Final Boss Battle with The Entity ]
                                
                                """, HERO.getNAME()
                );
            };
            case "Mazupe" -> switch (currWorld) {
                case 1 -> String.format(
                        """
                                The twilight forests of Erotoma stretched before %s, dark and dense with psionic energy that shimmered in the faint light filtering through the treetops. With each step he took deeper into the shadows, he felt the ancient power of the people echoing around him. The sounds of the forest were muffled, replaced by a strange hum that grew louder with each passing moment.
                                
                                
                                
                                >> [ NOW STARTING WORLD 1 ]
                                """, HERO.getNAME()
                );
                case 2 -> String.format(
                        """
                                In the vast, open plains of Erotoma, a faint mist rolled in over the golden grass, a haze filled with the quiet tension of a land touched by corruption. %s advanced across the plains, their keen eyes scanning the horizon, ever-alert to the changes in their homeland. This was once a place of freedom and swiftness, where the Azrue thrived. But now, an unnatural stillness had settled, an ominous warning of what lay ahead.
                                
                                
                                
                                >> [ NOW STARTING WORLD 2 ]
                                """, HERO.getNAME()
                );
                case 3 -> String.format(
                        """
                                The rocky paths of Vurgar rose before %s, winding through barren cliffs and shadowed valleys. The world felt desolate here, touched by corruption and tinged with the dark echoes of the once-proud Quacera race. Strength had been their creed, and every scarred mountain pass held memories of their greatest battles. But now, silence lay heavily over their homeland, broken only by distant echoes and the occasional whisper of corrupted energy.
                                
                                
                                
                                >> [ NOW STARTING WORLD 3 ]
                                """, HERO.getNAME()
                );
                default -> String.format(
                        """
                                You have reached the ultimate conclusion of the story, the final chapter where everything hangs in the balance. The air is thick with tension as you stand face to face with %s, the one who has pushed you to the brink. This is the final confrontation, the battle that will determine not only your fate but the fate of all that you hold dear. It is a fight against everything that has tormented you, a mano a mano clash with the very being that has stood in your way, orchestrating your torment and testing your resolve.
                                
                                Every step you’ve taken, every decision, has led you here, to this moment. The pain, the sacrifices, the lost friends—it all converges into a single, defining moment. With your freedom on the line, there can be no hesitation. The stakes are higher than ever before: this isn’t just about victory or defeat—it’s about your very essence, your will to survive.
                                
                                This is the final battle for your freedom. Every blow struck, every move made, will decide whether you remain break free from his chains or succumbed to it. The fight is not only physical but emotional, as you face the truth of everything you’ve endured. The weight of your past, the legacy of your struggles, and the promise of a somewhat better future are all embodied in this one moment. Will you be victorious, or will this battle claim you as yet another casualty of fate?
                                
                                
                                
                                The answer lies in your hands.
                                
                                
                                
                                >> [ WARNING: Incoming Final Boss Battle with The Entity ]
                                
                                """, HERO.getNAME()
                );
            };
            default -> switch (currWorld) {
                case 1 -> String.format(
                        """
                                The rocky paths of Vurgar rose before %s, winding through barren cliffs and shadowed valleys. The world felt desolate here, touched by corruption and tinged with the dark echoes of the once-proud Quacera race. Strength had been their creed, and every scarred mountain pass held memories of their greatest battles. But now, silence lay heavily over their homeland, broken only by distant echoes and the occasional whisper of corrupted energy.
                                
                                
                                >> [ NOW STARTING WORLD 1 ]
                                """, HERO.getNAME()
                );
                case 2 -> String.format(
                        """
                                The twilight forests of Erotoma stretched before %s, dark and dense with psionic energy that shimmered in the faint light filtering through the treetops. With each step he took deeper into the shadows, he felt the ancient power of the people echoing around him. The sounds of the forest were muffled, replaced by a strange hum that grew louder with each passing moment.
                                
                                
                                
                                >> [ NOW STARTING WORLD 2 ]
                                """, HERO.getNAME()
                );
                case 3 -> String.format(
                        """
                                In the vast, open plains of Erotoma, a faint mist rolled in over the golden grass, a haze filled with the quiet tension of a land touched by corruption. %s advanced across the plains, their keen eyes scanning the horizon, ever-alert to the changes in their homeland. This was once a place of freedom and swiftness, where the Azrue thrived. But now, an unnatural stillness had settled, an ominous warning of what lay ahead.
                                
                                
                                
                                >> [ NOW STARTING WORLD 3 ]
                                """, HERO.getNAME()
                );
                default -> String.format(
                        """
                                You have reached the ultimate conclusion of the story, the final chapter where everything hangs in the balance. The air is thick with tension as you stand face to face with %s, the one who has pushed you to the brink. This is the final confrontation, the battle that will determine not only your fate but the fate of all that you hold dear. It is a fight against everything that has tormented you, a mano a mano clash with the very being that has stood in your way, orchestrating your torment and testing your resolve.
                                
                                Every step you’ve taken, every decision, has led you here, to this moment. The pain, the sacrifices, the lost friends—it all converges into a single, defining moment. With your freedom on the line, there can be no hesitation. The stakes are higher than ever before: this isn’t just about victory or defeat—it’s about your very essence, your will to survive.
                                
                                This is the final battle for your freedom. Every blow struck, every move made, will decide whether you remain break free from his chains or succumbed to it. The fight is not only physical but emotional, as you face the truth of everything you’ve endured. The weight of your past, the legacy of your struggles, and the promise of a somewhat better future are all embodied in this one moment. Will you be victorious, or will this battle claim you as yet another casualty of fate?
                                
                                
                                
                                The answer lies in your hands.
                                
                                
                                
                                >> [ WARNING: Incoming Final Boss Battle with The Entity ]
                                
                                """, HERO.getNAME()
                );
            };
        };

    }



    @Override
    public void onInputReceived(String input) {
        if(currWorld == 4){
            System.out.println("Final battle against The Entity...");
            GAME.nextScene(THE_ENTITY);
        }
        else{
            System.out.println("Going to Scenario...");
            GAME.nextScene(SCENARIO);
        }
    }
}
