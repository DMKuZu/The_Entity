package elements.creature;

import elements.creature.value.Skills;

import java.util.Arrays;
import java.util.List;

import static elements.creature.value.Effects.*;

public interface Hero_Skills {
    List<Skills> Mazupe_Skills = Arrays.asList(
            new Skills("Basic Strike",20,1,NONE),
            new Skills("Mountain Breaker",50,12,FRAIL),
            new Skills("War Cry",0,15,EMPOWER),
            new Skills("Stone SKin",0,15,REGEN),
            new Skills("Titan's Grip",80,5,STUN)
    );

    List<Skills> Radea_Skills = Arrays.asList(
            new Skills("Shadow Strike",20,1,NONE),
            new Skills("Psychic Drain",40,12,WEAKEN),
            new Skills("Mental Fortress",0,8,FORTIFY),
            new Skills("Thought Pierce",50,12,FRAIL),
            new Skills("Mass Hysteria",65,6,INFLICTION)
    );

    List<Skills> Zipau_Skills = Arrays.asList(
            new Skills("Quick Slash",25,1,NONE),
            new Skills("Flash Strike",40,15,EMPOWER),
            new Skills("Wind Walker",0,8,ENSHROUD),
            new Skills("Bright Blade",60,6,SHARPEN),
            new Skills("Blade Dance",80,3,FRAIL)
    );

    List<Skills> Supa_Skills = Arrays.asList(
            new Skills("Reality Warp",150,1,NONE),
            new Skills("Dimensional Shift",175,15,SHARPEN),
            new Skills("Pagbigyan",0,30,INFLICTION),
            new Skills("Void Embrace",0,10,REGEN),
            new Skills("Ultimate Erasure",300,3,STUN)
    );
}
