package elements.creature.hero;

import elements.creature.Creature;
import elements.creature.value.Effects;
import elements.creature.value.Skills;
import elements.creature.value.Stats;

import java.util.ArrayList;
import java.util.Arrays;

import static elements.creature.value.Effects.*;

public class Supa extends Hero {

    public Supa(){
        super();
        this.NAME = "SupaIdolSkibidiGyattSirKhaiCenat";
        this.STATS = new Stats(10000,69,420,-1.0,0.5);
        this.CURRSTATS = new Stats(10000,69,420,-1.0,0.5);
        this.SKILLS = new ArrayList<>(Supa_Skills);

        for(Skills skill: SKILLS){
            int uses = skill.getUses();
            TOTAL_USES.add(uses);
            CURR_USES.add(uses);
        }

    }

    @Override
    public String skillDesc() {

        //i might put effects here, basta isetup lang na ang 3rd skill kay no damage
        //gitapul jud ko legit

        return String.format(
                """
                >> %s\t\t──>\tDeals damage and has unlimited uses.
                
                >> %s\t──>\tDeals damage and applies WEAKEN to enemy for 2 turns.    \t──>   %d | %d
                
                >> %s\t\t──>\tApplies FORTIFY to self for 4 turns.                   \t\t──>  %d | %d
                
                >> %s\t\t──>\tApplies FRAIL to enemy for 3 turns.                    \t\t──>   %d | %d

                >> %s\t──>\tDeals damage and applies INFLICTION to enemy for 3 turns.\t──>   %d | %d
                """,
                SKILLS.get(0).getName(),
                SKILLS.get(1).getName(),getCURR_USES(2),getTOTAL_USES(2),
                SKILLS.get(2).getName(),getCURR_USES(3),getTOTAL_USES(3),
                SKILLS.get(3).getName(),getCURR_USES(4),getTOTAL_USES(4),
                SKILLS.get(4).getName(),getCURR_USES(5),getTOTAL_USES(5)
        );
    }

    @Override
    protected String skill(int skillNum, boolean isCrit, int damage, Creature creature) {
        String msg;
        String crit = isCrit ? "CRIT! " : "";
        Effects effects = getSKILL_EFFECTS(skillNum);

        //wa koy gibutang na effects kay gitapul ko

        switch (skillNum){
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                msg = String.format(
                        """
                        %s uses Skill: %s!
                        
                        %sDealt %d damage!
                        """,
                        NAME, getSKILL_NAME(skillNum),
                        crit,damage
                );
        }

        return msg;
    }
}



