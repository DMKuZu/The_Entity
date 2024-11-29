package elements.creature.hero.heroClass;

import elements.creature.Creature;
import elements.creature.hero.Hero;
import elements.creature.value.Effects;
import elements.creature.value.Skills;
import elements.creature.value.Stats;

import java.util.ArrayList;

public class Zipau extends Hero {

    public Zipau(){
        super();
        this.NAME = "Zipau";
        this.STATS = new Stats(100,15,15,0.04,0.12);
        this.CURRSTATS = new Stats(100,15,15,0.04,0.12);
        this.SKILLS = new ArrayList<>(Zipau_Skills);

        for(Skills skill: SKILLS){
            int uses = skill.getUses();
            TOTAL_USES.add(uses);
            CURR_USES.add(uses);
        }
    }

    @Override
    public String skillDesc() {
        return String.format(
                """
                >> %s\t\t──>\tDeals damage and has unlimited uses.
                
                >> %s\t\t──>\tDeals damage and applies EMPOWER to self for 3 turns.\t──>\t%d | %d
                
                >> %s\t\t──>\tApplies ENSHROUD to self for 4 turns.                \t──>\t %d | %d
                
                >> %s\t\t──>\tDeals damage and applies SHARPEN to self for 3 turns.\t──>\t %d | %d

                >> %s\t\t──>\tDeals damage and applies FRAIL to enemy for 3 turns. \t──>\t %d | %d
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

        switch (skillNum){
            case 2:
                msg = String.format(
                        """
                        
                        
                        %s uses Skill: %s!
                        
                        %sDealt %d damage!
                        
                        Increased ATK by 15 for 3 turns!
                        """,
                        NAME, getSKILL_NAME(skillNum),
                        crit,damage
                );
                addEffects(effects,2,15);
                break;
            case 3:
                msg = String.format(
                        """
                        
                        
                        %s uses Skill: %s!
                        
                        Increased DODGE by 10 for 4 turns!
                        """,
                        NAME, getSKILL_NAME(skillNum)
                );
                addEffects(effects,4,10);
                break;
            case 4:
                msg = String.format(
                        """
                        
                        
                        %s uses Skill: %s!
                        
                        %sDealt %d damage!
                        
                        Increased CRIT by 25 for 3!
                        """,
                        NAME, getSKILL_NAME(skillNum),
                        crit,damage
                );
                addEffects(effects,3,20);
                break;
            case 5:
                msg = String.format(
                        """
                        
                        
                        %s uses Skill: %s!
                        
                        %sDealt %d damage!
                        
                        Decreased %s's DEF by 20 for 3 turns!
                        """,
                        NAME, getSKILL_NAME(skillNum),
                        crit,damage,
                        creature.getNAME()
                );
                creature.addEffects(effects,3,20);
                break;
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