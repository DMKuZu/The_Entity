package elements.creature.enemy.enemyInterface;

import elements.creature.value.Skills;

import java.util.Arrays;
import java.util.List;

import static elements.creature.value.Effects.*;

public interface Azrueian_Enemies {
    List<String> Azr_Norm_List = Arrays.asList(
            "Azrueian Skirmisher",
            "Azrueian Blade Dancer",
            "Azrueian Scout",
            "Azrueian WindRanger",
            "Azrueian Striker"
    );

    List<String> Azr_Elite_List = Arrays.asList(
            "Twisted Bladedancer",
            "Chronomancer of Dread"
    );

    List<Skills> AzrSkills = Arrays.asList(
            new Skills("Wind Shear", 17, 0, NONE),
            new Skills("Temporal Strike", 24, 0, WEAKEN),
            new Skills("Edge of Precision", 0, 0, SHARPEN),
            new Skills("Blade Flurry", 36, 0, FRAIL)
    );

}