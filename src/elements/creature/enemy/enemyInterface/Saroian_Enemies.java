package elements.creature.enemy.enemyInterface;

import elements.creature.value.Skills;

import java.util.Arrays;
import java.util.List;

import static elements.creature.value.Effects.*;
import static elements.creature.value.Effects.FRAIL;

public interface Saroian_Enemies {
    List<String> Sar_Norm_List = Arrays.asList(
            "Psionic Goblin",
            "Nightmare Sylph",
            "Spectral Serpent",
            "Spectral Harpy",
            "Ebon-Faced Dryad"
    );

    List<String> Sar_Elite_List = Arrays.asList(
            "Shadowmaster of the Void",
            "Abomination of the Deep"
    );


    List<Skills> SarSkills = Arrays.asList(
            new Skills("Void Strike", 16, 0, NONE),
            new Skills("Soul Fracture", 23, 0, FRAIL),
            new Skills("Shroud of Shadows", 0, 0, ENSHROUD),
            new Skills("Cursed Infliction", 35, 0, INFLICTION)
    );

}