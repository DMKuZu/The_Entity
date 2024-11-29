package elements.creature.enemy.enemyInterface;

import elements.creature.value.Skills;

import java.util.Arrays;
import java.util.List;

import static elements.creature.value.Effects.*;
import static elements.creature.value.Effects.FRAIL;

public interface Quaceron_Enemies {
    List<String> Qua_Norm_List = Arrays.asList(
            "Quaceron Initiate",
            "Quaceron Sentinel",
            "Quaceron Smashkin",
            "Quaceron Warden",
            "Quaceron Brawler"
    );

    List<String> Qua_Elite_List = Arrays.asList(
            "Warlord of Ruin",
            "Titan of the Abyss"
    );

    List<Skills> QuaSkills = Arrays.asList(
            new Skills("Crushing Blow", 18, 0, NONE),
            new Skills("Abyssal Might", 24, 0, EMPOWER),
            new Skills("Iron Bastion", 0, 0, FORTIFY),
            new Skills("Vital Surge", 37, 0, REGEN)
    );
}

