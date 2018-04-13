package com.tomandryan.fortnite.model;

import com.tomandryan.fortnite.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.graphics.Color;
import android.widget.TextView;

/**
 * Created by ryanh and tom on 3/13/2018.
 */

public class Weapons {

    public static List<String> getWeaponNameList(){
        // loop through ALL_WEAPONS,  pull out the gunName variable of each and add it to the list that you are creating, return the list.
        List<String> allWeaponNames = new ArrayList<>();
        for(Weapon currentWeapon:ALL_WEAPONS){
            String currentWeaponName = currentWeapon.getGunName();
            allWeaponNames.add(currentWeaponName);
        }
        return allWeaponNames;
    }

    private static final List<Weapon> ALL_WEAPONS = Arrays.asList(
            new Weapon("Assault Rifle (Grey)", 165, 30, 5.5, 30, 2.3, "Common", "Medium", R.drawable.assault_rifle_grey_image),
            new Weapon("Assault Rifle (Green)", 170.5, 31, 5.5, 30, 2.2, "Uncommon", "Medium", R.drawable.assault_rifle_green_image),
            new Weapon("Assault Rifle (Blue)", 181.5, 33, 5.5, 30, 2.2, "Rare", "Medium", R.drawable.assault_rifle_blue_image),
            new Weapon("Assault Rifle (Purple)", 192.5, 35, 5.5, 30, 2.1, "Epic", "Medium", R.drawable.assault_rifle_purple_image),
            new Weapon("Assault Rifle (Gold)", 198, 36, 5.5, 30, 2.1, "Legendary", "Medium", R.drawable.assault_rifle_gold_image),
            new Weapon("Burst Assault Rifle (Grey)", 109.62, 27, 4.06, 30, 2.9, "Common", "Medium", R.drawable.burst_assault_rifle_grey_image),
            new Weapon("Burst Assault Rifle (Green)", 117.74, 29, 4.06, 30, 2.7, "Uncommon", "Medium", R.drawable.burst_assault_rifle_green_image),
            new Weapon("Burst Assault Rifle (Blue)", 121.8, 30, 4.06, 30, 2.5, "Rare", "Medium", R.drawable.burst_assault_rifle_blue_image),
            new Weapon("Scoped Assault Rifle (Blue)", 80.5, 23, 3.5, 20, 2.3, "Rare", "Medium", R.drawable.scoped_assault_rifle_blue),
            new Weapon("Scoped Assault Rifle (Purple)", 84, 24, 3.5, 20, 2.3, "Epic", "Medium", R.drawable.scoped_assault_rifle_purple),
            new Weapon("Bolt Action Sniper Rifle (Blue)", 34.65, 105, .33, 1, 3.0, "Rare", "Heavy", R.drawable.bolt_action_sniper_blue),
            new Weapon("Bolt Action Sniper Rifle (Purple)", 36.3, 110, .33, 1, 2.8, "Epic", "Heavy", R.drawable.bolt_action_sniper_purple),
            new Weapon("Bolt Action Sniper Rifle (Gold)", 38.28, 116, .33, 1, 2.7, "Legendary", "Heavy", R.drawable.bolt_action_sniper_gold),
            new Weapon("Crossbow (Blue)", 30, 50, .6, 5, 2.2, "Rare", "Arrows", R.drawable.crossbow_blue),
            new Weapon("Crossbow (Purple)", 45, 75, .6, 5, 2.2, "Epic", "Arrows", R.drawable.crossbow_purple),
            new Weapon("Grenade Launcher (Blue)", 100, 100, 1.0, 6, 3.0, "Rare", "Rockets", R.drawable.grenade_launcher_blue),
            new Weapon("Grenade Launcher (Purple)", 105, 105, 1.0, 6, 2.8, "Epic", "Rockets", R.drawable.grenade_launcher_purple),
            new Weapon("Grenade Launcher (Gold)", 110, 110, 1.0, 6, 2.7, "Legendary", "Rockets", R.drawable.grenade_launcher_gold),
            new Weapon("Handcannon (Purple)", 60, 75, .8, 7, 2.1, "Epic", "Heavy", R.drawable.handcannon_purple),
            new Weapon("Handcannon (Gold)", 62.4, 78, .8, 7, 2.0, "Legendary", "Heavy", R.drawable.handcannon_gold),
            new Weapon("Hunting Rifle (Green)", 68.8, 86, .8, 1, 1.9, "Uncommon", "Heavy", R.drawable.hunting_rifle_green),
            new Weapon("Hunting Rifle (Blue)", 72, 90, .8, 1, 1.8, "Rare", "Heavy", R.drawable.hunting_rifle_blue),
            new Weapon("Minigun (Purple)", 204, 17, 12.0, 0, 4.7, "Epic", "Light", R.drawable.minigun_purple),
            new Weapon("Minigun (Gold)", 204, 17, 12.0, 0, 4.7, "Legendary", "Light", R.drawable.minigun_gold),
            new Weapon("Semi-Auto Sniper Rifle (Purple)", 75.6, 63, 1.2, 10, 2.5, "Epic", "Heavy", R.drawable.semi_sniper_purple),
            new Weapon("Semi-Auto Sniper Rifle (Gold)", 79.2, 66, 1.2, 10, 2.3, "Legendary", "Heavy", R.drawable.semi_sniper_gold),
            new Weapon("Pistol (Grey)", 155.25, 23, 6.75, 16, 1.5, "Common", "Light", R.drawable.pistol_grey),
            new Weapon("Pistol (Green)", 162, 24, 6.75, 16, 1.5, "Uncommon", "Light", R.drawable.pistol_green),
            new Weapon("Pistol (Blue)", 168.75, 25, 6.75, 16, 1.4, "Rare", "Light", R.drawable.pistol_blue),
            new Weapon("Suppressed Pistol (Purple)", 175.5, 26, 6.75, 16, 1.3, "Epic", "Light", R.drawable.suppressed_pistol_purple),
            new Weapon("Suppressed Pistol (Gold)", 189, 28, 6.75, 16, 1.3, "Legendary", "Light", R.drawable.suppressed_pistol_gold),
            new Weapon("Revolver (Grey)", 48.6, 54, .9, 6, 2.4, "Common", "Medium", R.drawable.revolver_grey),
            new Weapon("Revolver (Green)", 51.3, 57, .9, 6, 2.3, "Uncommon", "Medium", R.drawable.revolver_green),
            new Weapon("Revolver (Blue)", 54, 60, .9, 6, 2.2, "Rare", "Medium", R.drawable.revolver_blue),
            new Weapon("Rocket Launcher (Blue)", 82.5, 110, .75, 1, 2.3, "Rare", "Rockets", R.drawable.rocket_launcher_blue),
            new Weapon("Rocket Launcher (Purple)", 87, 116, .75, 1, 2.2, "Epic", "Rockets", R.drawable.rocket_launcher_purple),
            new Weapon("Rocket Launcher (Gold)", 90.75, 121, .75, 1, 1.9, "Legendary", "Rockets", R.drawable.rocket_launcher_gold),
            new Weapon("Tactical Shotgun (Grey)", 100.5, 67, 1.5, 8, 6.3, "Common", "Shells n Slugs", R.drawable.ryguy),
            new Weapon("Tactical Shotgun (Green)", 105, 70, 1.5, 8, 6.0, "Uncommon", "Shells n Slugs", R.drawable.tactical_shotgun_green),
            new Weapon("Tactical Shotgun (Blue)", 111, 74, 1.5, 8, 5.7, "Rare", "Shells n Slugs", R.drawable.tactical_shotgun_blue),
            new Weapon("Suppressed Submachine Gun (Grey)", 153, 17, 9.0, 30, 2.2, "Common", "Light", R.drawable.suppressed_smg_grey),
            new Weapon("Suppressed Submachine Gun (Green)", 162, 18, 9.0, 30, 2.1, "Uncommon", "Light", R.drawable.suppressed_smg_green),
            new Weapon("Suppressed Submachine Gun (Blue)", 171, 19, 9.0, 30, 2.0, "Rare", "Light", R.drawable.suppressed_smg_blue),
            new Weapon("Tactical Submachine Gun (Green)", 208, 16, 13.0, 35, 2.4, "Uncommon", "Light", R.drawable.tactical_smg_green),
            new Weapon("Tactical Submachine Gun (Blue)", 221, 17, 13.0, 35, 2.4, "Rare", "Light", R.drawable.tactical_smg_blue),
            new Weapon("Tactical Submachine Gun (Purple)", 234, 18, 13.0, 35, 2.4, "Epic", "Light", R.drawable.tactical_smg_purple),
            new Weapon("Guided Missile (Purple)", 78.75, 105, .75, 1, 2,"Epic","Rockets", R.drawable.guided_missile_purple),
            new Weapon("Guided Missile (Gold)", 82.50, 110, .75, 1, 1.9,"Legendary","Rockets", R.drawable.guided_missile_gold),
            new Weapon("Heavy Shotgun (Purple)", 73.5, 73, 1, 7, 5.9, "Epic", "Shells n Slugs", R.drawable.heavy_shotgun_purple),
            new Weapon("Heavy Shotgun (Gold)", 77, 77, 1, 7, 5.6, "Legendary", "Shells n Slugs", R.drawable.heavy_shotgun_gold)
    );

    public static Weapon getWeaponStats(int index) {
        return ALL_WEAPONS.get(index);
    }

    public static int compareWeaponStats(Double currentWeaponStat, Double potentialWeaponStat) {

        // find the difference between currentWeaponStat and potentialWeaponStat
        Double differenceBetweenStats = potentialWeaponStat - currentWeaponStat;

        // divide the difference by the original number and multiply by 100. Negatives are decreases.
        Double differenceDividedBetweenStats = (differenceBetweenStats / currentWeaponStat) * 100;
        long roundedDifferenceBetweenStats = Math.round(differenceDividedBetweenStats);
        return (int) roundedDifferenceBetweenStats;
    }


    public static int compareWeaponStats(int currentWeaponStat, int potentialWeaponStat) {
        double d = (double) currentWeaponStat;
        double d2 = (double) potentialWeaponStat;
        return compareWeaponStats(d, d2);
    }

  public static int percentagePositive(int roundedDifferenceBetweenStats) {
        if(roundedDifferenceBetweenStats > 0) {
            return Color.GREEN;
        }else if(roundedDifferenceBetweenStats == 0) {
            return Color.BLACK;
        }else {
            return Color.RED;
        }

    }

}



