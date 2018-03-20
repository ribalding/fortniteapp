package com.tomandryan.fortnite.model;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ryanh on 3/13/2018.
 */

public class Weapons {
    public final static List<String> ALL_WEAPON_TYPES = Arrays.asList("Assault Rifle (Grey)", "Scoped Assault Rifle", "Burst Assault Rifle", "Suppressed Submachine Gun", "Tactical Submachine Gun",
            "Minigun", "Hand Cannon", "Pistol (Grey)", "Revolver", "Suppressed Pistol", "Bolt-Action Sniper Rifle", "Hunting Rifle", "Semi-Auto Sniper Rifle",
            "Pump Action Shotgun", "Tactical Shotgun", "Grenade Launcher", "Rocket Launcher", "Crossbow");

    public static Weapon getWeaponStats(String weaponName) {
        switch(weaponName){
            case "Assault Rifle (Grey)":
                return new Weapon("Assault Rifle (Grey)",165,30,5.5,30,2.3,"Grey", "Medium");
            case "Pistol (Grey)":
                return new Weapon("Pistol (Grey)",155.25,23,6.75,16,1.5, "Grey", "Light");
            case "Tactical Shotgun (Green)":
                return new Weapon("Tactical Shotgun (Green)",100.5,67,1.5,8,6.3,"Green","Shells n Slugs");
        }
        return null;
    }

}


