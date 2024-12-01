package elements.creature.hero.heroClass;

import elements.creature.Creature;
import elements.creature.hero.Hero;
import elements.creature.value.Effects;
import elements.creature.value.Skills;
import elements.creature.value.Stats;

import java.util.ArrayList;

public class Supa extends Hero {

    public Supa(){
        super();
        this.NAME = "The Man, The Myth, The Legend, Sir Khai Gumonan ";
        this.STATS = new Stats(69420,69,-420,-1.0,0.5);
        this.CURRSTATS = new Stats(69420,69,-420,-1.0,0.5);
        this.SKILLS = new ArrayList<>(Supa_Skills);

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
                
                >> %s\t──>\tDeals damage and applies SHARPEN to self for 10 turns.       ──>   %d | %d
                
                >> %s\t\t──>\tApplies INFLICTION to enemy for 10 turns.                    ──>   %d | %d
                
                >> %s\t\t──>\tApplies REGEN to self for 10 turns.                          ──>   %d | %d

                >> %s\t──>\tDeals damage and applies STUN to enemy for 3 turns.          ──>    %d | %d
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
                        
                        Increased CRIT by 50 for 10 turns!
                        """,
                        NAME, getSKILL_NAME(skillNum)
                );
                addEffects(effects,10, 50);
                break;
            case 3:
                msg = String.format(
                        """
                        
                        
                        
                        %s uses Skill: %s!
                        
                        Inflicts 100 damage to %s for 10 turns!
                        """,
                        NAME, getSKILL_NAME(skillNum),
                        creature.getNAME()
                );
                creature.addEffects(effects,10,100);
                break;
            case 4:
                msg = String.format(
                        """
                        
                        
                        
                        %s uses Skill: %s!
                        
                        Regenerate 100 HP for 10 turns!
                        """,
                        NAME, getSKILL_NAME(skillNum)
                );
                addEffects(effects,10,100);
                break;
            case 5:
                msg = String.format(
                        """
                        
                        
                        
                        %s uses Skill: %s!
                        
                        %sDealt %d damage!
                        
                        Stunned %s for 3 turns!
                        """,
                        NAME, getSKILL_NAME(skillNum),
                        crit,damage,
                        creature.getNAME()
                );
                creature.addEffects(effects,3,0);
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



