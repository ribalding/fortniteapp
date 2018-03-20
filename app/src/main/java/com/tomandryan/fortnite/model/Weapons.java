package com.tomandryan.fortnite.model;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ryanh on 3/13/2018.
 */

public class Weapons {
    public final static List<String> ALL_WEAPON_TYPES = Arrays.asList("Assault Rifle (Grey)", "Assault Rifle (Green)", "Assault Rifle (Blue)", "Assault Rifle (Purple)", "Assault Rifle (Gold)",
            "Burst Assault Rifle (Grey)", "Burst Assault Rifle (Green)", "Burst Assault Rifle (Blue)", "Scoped Assault Rifle (Blue)", "Scoped Assault Rifle (Purple)",
            "Bolt Action Sniper Rifle (Blue)", "Bolt Action Sniper Rifle (Purple)", "Bolt Action Sniper Rifle (Gold)", "Crossbow (Blue)", "Crossbow (Purple)",
            "Grenade Launcher (Blue)", "Grenade Launcher (Purple)", "Grenade Launcher (Gold)", "Hand Cannon (Purple)", "Hand Cannon (Gold)",
            "Hunting Rifle (Green)","Hunting Rifle (Blue)","Minigun (Purple)", "Minigun (Gold)", "Semi-Auto Sniper Rifle (Purple)", "Semi-Auto Sniper Rifle (Gold)",
            "Pistol (Grey)", "Pistol (Green)",  "Pistol (Blue)","Suppressed Pistol (Purple)", "Suppressed Pistol (Gold)",
            "Revolver (Grey)", "Revolver (Green)", "Revolver (Blue)", "Rocket Launcher (Blue)", "Rocket Launcher (Purple)", "Rocket Launcher (Gold)",
            "Pump Shotgun (Grey)", "Pump Shotgun (Green)", "Tactical Shotgun (Blue)", "Tactical Shotgun (Purple)", "Tactical Shotgun (Green)",
            "Suppressed Submachine Gun (Grey)", "Suppressed Submachine Gun (Green)", "Suppressed Submachine Gun (Blue)", "Tactical Submachine Gun (Green)", "Tactical Submachine Gun (Blue)", "Tactical Submachine Gun (Purple");

    public static Weapon getWeaponStats(String weaponName) {
        switch(weaponName){
            case "Assault Rifle (Grey)":
                return new Weapon("Assault Rifle (Grey)",165,30,5.5,30,2.3,"Common", "Medium");
            case "Assault Rifle (Green)":
                return new Weapon("Assault Rifle (Green)",170.5,31,5.5,30,2.2,"Uncommon", "Medium");
            case "Assault Rifle (Blue)":
                return new Weapon("Assault Rifle (Blue)",181.5,33,5.5,30,2.2,"Rare", "Medium");
            case "Assault Rifle (Purple)":
                return new Weapon("Assault Rifle (Purple)",192.5,35,5.5,30,2.1,"Epic", "Medium");
            case "Assault Rifle (Gold)":
                return new Weapon("Assault Rifle (Gold)",198,36,5.5,30,2.1,"Legendary", "Medium");
            case "Burst Assault Rifle (Grey)":
                return new Weapon("Burst Assault Rifle (Grey)",109.62,27,4.06,30,2.9,"Common", "Medium");
            case "Burst Assault Rifle (Green)":
                return new Weapon("Burst Assault Rifle (Green)",117.74,29,4.06,30,2.7,"Uncommon", "Medium");
            case "Burst Assault Rifle (Blue)":
                return new Weapon("Burst Assault Rifle (Blue)",121.8,30,4.06,30,2.5,"Rare", "Medium");
            case "Scoped Assault Rifle (Blue)":
                return new Weapon("Scoped Assault Rifle (Blue)",80.5,23,3.5,20,2.3,"Rare", "Medium");
            case "Scoped Assault Rifle (Purple)":
                return new Weapon("Scoped Assault Rifle (Purple)",84,24,3.5,20,2.3,"Epic", "Medium");
            case "Bolt Action Sniper Rifle (Blue)":
                return new Weapon("Bolt Action Sniper Rifle (Blue)",34.65,105,.33,1,3.0,"Rare", "Heavy");
            case "Bolt Action Sniper Rifle (Purple)":
                return new Weapon("Bolt Action Sniper Rifle (Purple)",36.3,110,.33,1,2.8,"Epic", "Heavy");
            case "Bolt Action Sniper Rifle (Gold)":
                return new Weapon("Bolt Action Sniper Rifle (Gold)",38.28,116,.33,1,2.7,"Legendary", "Heavy");
            case "Crossbow (Blue)":
                return new Weapon("Crossbow (Blue)",30,50,.6,5,2.2,"Rare", "Arrows");
            case "Crossbow (Purple)":
                return new Weapon("Crossbow (Purple)",45,75,.6,5,2.2,"Epic", "Arrows");
            case "Grenade Launcher (Blue)":
                return new Weapon("Grenade Launcher (Blue)",100,100,1.0,6,3.0,"Rare", "Rockets");
            case "Grenade Launcher (Purple)":
                return new Weapon("Grenade Launcher (Purple)",105,105,1.0,6,2.8,"Epic", "Rockets");
            case "Grenade Launcher (Gold)":
                return new Weapon("Grenade Launcher (Gold)",110,110,1.0,6,2.7,"Legendary", "Rockets");
            case "Handcannon (Purple)":
                return new Weapon("Handcannon (Purple)",60,75,.8,7,2.1,"Epic", "Heavy");
            case "Handcannon (Gold)":
                return new Weapon("Handcannon (Gold)",62.4,78,.8,7,2.0,"Legendary", "Heavy");
            case "Hunting Rifle (Green)":
                return new Weapon("Hunting Rifle (Green)",68.8,86,.8,1,1.9,"Uncommon", "Heavy");
            case "Hunting Rifle (Blue)":
                return new Weapon("Hunting Rifle (Blue)",72,90,.8,1,1.8,"Rare", "Heavy");
            case "Minigun (Purple)":
                return new Weapon("Minigun (Purple)",204,17,12.0,0,4.7,"Epic", "Light");
            case "Minigun (Gold)":
                return new Weapon("Minigun (Gold)",204,17,12.0,0,4.7,"Legendary", "Light");
            case "Semi-Auto Sniper Rifle (Purple)":
                return new Weapon("Semi-Auto Sniper Rifle (Purple)",75.6,63,1.2,10,2.5,"Epic", "Heavy");
            case "Semi-Auto Sniper Rifle (Gold)":
                return new Weapon("Semi-Auto Sniper Rifle (Gold)",79.2,66,1.2,10,2.3,"Legendary", "Heavy");
            case "Pistol (Grey)":
                return new Weapon("Pistol (Grey)",155.25,23,6.75,16,1.5, "Common", "Light");
            case "Pistol (Green)":
                return new Weapon("Pistol (Green)",162,24,6.75,16,1.5, "Uncommon", "Light");
            case "Pistol (Blue)":
                return new Weapon("Pistol (Blue)",168.75,25,6.75,16,1.4, "Rare", "Light");
            case "Suppressed Pistol (Purple)":
                return new Weapon("Suppressed Pistol (Purple)",175.5,26,6.75,16,1.3, "Epic", "Light");
            case "Suppressed Pistol (Gold)":
                return new Weapon("Suppressed Pistol (Gold)",189,28,6.75,16,1.3, "Legendary", "Light");
            case "Revolver (Grey)":
                return new Weapon("Revolver (Grey)",48.6,54,.9,6,2.4, "Common", "Medium");
            case "Revolver (Green)":
                return new Weapon("Revolver (Green)",51.3,57,.9,6,2.3, "Uncommon", "Medium");
            case "Revolver (Blue)":
                return new Weapon("Revolver (Blue)",54,60,.9,6,2.2, "Rare", "Medium");
            case "Rocket Launcher (Blue)":
                return new Weapon("Rocket Launcher (Blue)",82.5,110,.75,1,2.3, "Rare", "Rockets");
            case "Rocket Launcher (Purple)":
                return new Weapon("Rocket Launcher (Purple)",87,116,.75,1,2.2, "Epic", "Rockets");
            case "Rocket Launcher (Gold)":
                return new Weapon("Rocket Launcher (Gold)",90.75,121,.75,1,1.9, "Legendary", "Rockets");
            case "Pump Shotgun (Grey)":
                return new Weapon("Pump Shotgun (Grey)",63,90,.7,5,4.8,"Common","Shells n Slugs");
            case "Pump Shotgun (Green)":
                return new Weapon("Pump Shotgun (Green)",66.5,95,.7,5,4.6,"Uncommon","Shells n Slugs");
            case "Tactical Shotgun (Green)":
                return new Weapon("Tactical Shotgun (Green)",100.5,67,1.5,8,6.3,"Uncommon","Shells n Slugs");
            case "Tactical Shotgun (Blue)":
                return new Weapon("Tactical Shotgun (Blue)",105,70,1.5,8,6.0,"Rare","Shells n Slugs");
            case "Tactical Shotgun (Purple)":
                return new Weapon("Tactical Shotgun (Purple)",111,74,1.5,8,5.7,"Epic","Shells n Slugs");
            case "Suppressed Submachine Gun (Grey)":
                return new Weapon("Suppressed Submachine Gun (Grey)",153,17,9.0,30,2.2,"Common","Light");
            case "Suppressed Submachine Gun (Green)":
                return new Weapon("Suppressed Submachine Gun (Green)",162,18,9.0,30,2.1,"Uncommon","Light");
            case "Suppressed Submachine Gun (Blue)":
                return new Weapon("Suppressed Submachine Gun (Blue)",171,19,9.0,30,2.0,"Rare","Light");
            case "Tactical Submachine Gun (Green)":
                return new Weapon("Tactical Submachine Gun (Green)",208,16,13.0,35,2.4,"Uncommon","Light");
            case "Tactical Submachine Gun (Blue)":
                return new Weapon("Tactical Submachine Gun (Blue)",221,17,13.0,35,2.4,"Uncommon","Light");
            case "Tactical Submachine Gun (Purple)":
                return new Weapon("Tactical Submachine Gun (Purple)",234,18,13.0,35,2.4,"Uncommon","Light");
        }
        return null;
    }

}


