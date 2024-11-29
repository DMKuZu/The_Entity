package scene.menu;

import elements.creature.hero.heroClass.Mazupe;
import elements.creature.hero.heroClass.Radea;
import elements.creature.hero.heroClass.Supa;
import elements.creature.hero.heroClass.Zipau;
import game.Game;
import scene.Scene;

import static game.WhichScene.START;

public class Choose_Hero extends Scene {

    public Choose_Hero(Game GAME){
        super(GAME);
    }

    @Override
    protected String displayText_Display() {
        return """
                The sun hung low on the horizon, casting an eerie, golden glow over the ancient ruins that Zipau, Radea, and Mazupe had stumbled upon in their latest adventure. The crumbling stone structures and half-buried relics were a stark contrast to the vibrant, untamed wilderness that surrounded them.
                
                As they ventured deeper into the ruins, their excitement was tempered by the unsettling stillness of the place. The air itself seemed to hum with residual energy—a remnant of the extraordinary beings who once walked these halls.
                
                "Doesn't this place feel... off to you?" Mazupe murmured, glancing around with a nervous energy. Even with a warrior's strength, something about these ruins made them feel small. "The stones themselves feel alive."
                
                "It feels old, untouched," Radea replied, heavy boots sending small echoes down the stone corridors. "Maybe we're the first to see it in centuries. The Luminari were said to build their cities in layers of reality—some visible, some hidden."
                
                Zipau's sharp gaze flicked around the chamber as the scout took a slow, measured breath. "Be careful. Ancient places like this are often guarded. The archives speak of entire expeditions that vanished in Luminari ruins, consumed by defenses we couldn't comprehend."
                
                The ruins of the Luminari had been long forgotten, their existence only ever mentioned a handful of times in the libraries of Erotoma. What little was known of them spoke of beings who transcended the ordinary boundaries of flesh and spirit, masters of science so advanced it seemed like magic. Their relics were said to be as deadly as they were magnificent—tools of power that had driven many would-be wielders to madness.
                
                After an hour of winding corridors, the group reached a massive chamber with faded murals painted along the stone walls. The pigments seemed to shift and flow, catching the light in impossible ways. The largest mural depicted battles between glowing, radiant beings and monstrous entities wreathed in shadow and flame. One figure stood apart, wrapped in chains and cloaked in shadows, with an inscription beneath: "Never set him free ever again."
                
                "What do you think it means?" Zipau asked, pointing to the ominous figure.
                
                "Maybe a warning," Radea replied. "The Luminari were known to seal away threats too great for even them to destroy. Their cities weren’t just centers of learning—they were prisons."
                
                Before they could discuss further, Mazupe called out from the far end of the chamber. The warrior's voice echoed, drawing the others to a collapsed corner where spectral light glimmered faintly. There, among the ruins, lay the remains of the Luminari. Their bones, faintly glowing, seemed to pulse weakly, their skeletal forms scattered like fallen stars. Even in death, their light lingered.
                
                Zipau suddenly raised a hand, halting the group. "Wait," the scout whispered, kneeling to examine the floor. "These grooves... they're not decorative. They're a trigger mechanism."
                
                Radea stepped forward, examining the etched lines. "It's a quantum-locked defense system," the scholar explained. "The Luminari used quantum entanglement in their traps. The wrong step could collapse reality itself." After careful study, Radea mapped a safe path through the chamber, the group following cautiously. Along the way, Zipau identified nearly invisible energy webs—barriers attuned to biological signatures. Radea skillfully manipulated the resonance of a crystal to part the filaments, allowing them to pass.
                
                At last, they reached a massive gate, its surface alive with shifting symbols. "A dynamic encryption lock," Radea observed. The scholar began decoding the equations, tracing them with fingers as they rearranged in real-time.
                
                "Or," Mazupe interrupted, finding subtle indentations in the frame. With a grunt of effort, the warrior applied raw strength to the ancient mechanisms. Slowly, the gate groaned open.
                
                Beyond it, suspended in a cage of light, an artifact pulsed with otherworldly energy. Its surface, like liquid starlight, shifted between silvery-white and pale blue. Around them, the remains of the Luminari glowed brighter, as if responding to the artifact’s presence. Fragments of their technology lay scattered—crystalline devices and flowing metal alloys that hinted at unimaginable advancements.
                
                The artifact seemed to resonate uniquely with each of them. Radea reached out but hesitated, awed by its power. "It's beautiful," the scholar whispered.
                
                "But dangerous," Zipau added, instincts warning of hidden threats.
                
                The artifact pulsed again, and for an instant, it seemed to look back at them—not with eyes, but with an awareness that transcended sight. The bones of the Luminari flared brightly, their residual energy echoing like a final lament for their civilization.
                
                Hearts racing, the trio stood before the artifact. Its presence seemed to call to each of them differently, as though testing their resolve. Whatever this relic was, it carried the weight of untold power—and consequences none of them could yet fathom.
                
                
                
                >> TO CONTINUE THE STORY, PLEASE CHOOSE A CHARACTER <<
                """;
    }

    @Override
    protected String displayText_Choice() {
        return """
                ───────────────────────────────────────
                Select your CHAMPION by typing either their number or name.
                
                1 : Radea
                2 : Mazupe
                3 : Zipau
                
                ───────────────────────────────────────
                
                Note:
                Each Champion brings unique strengths, skills, and abilities to the battlefield, and the choice you make will define the strategies and challenges you face. Consider carefully as your Champion will be your ally, guiding you through the toughest trials, so choose the one who resonates most with your playstyle and goals as they will be your key to victory.
                """;
    }

    @Override
    public void onInputReceived(String input) {
        switch (input.toLowerCase()) {
            case "1":
            case "radea":
                System.out.println("Chose Radea");
                GAME.setHERO(new Radea());
                GAME.nextScene(START);
                break;
            case "2":
            case "mazupe":
                System.out.println("Chose Mazupe");
                GAME.setHERO(new Mazupe());
                GAME.nextScene(START);
                break;
            case "3":
            case "zipau":
                System.out.println("Chose Zipau");
                GAME.setHERO(new Zipau());
                GAME.nextScene(START);
                break;
            case "69":
            case "superidolsirkhaigumonan":
                System.out.println("Chose SupaIdolSirKhai");
                GAME.setHERO(new Supa());
                GAME.nextScene(START);
                break;
            default:
                System.out.println("Invalid input: " + input);
                break;
        }
    }
}
