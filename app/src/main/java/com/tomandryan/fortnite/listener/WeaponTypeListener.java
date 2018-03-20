package com.tomandryan.fortnite.listener;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import com.tomandryan.fortnite.model.Weapon;
import com.tomandryan.fortnite.model.Weapons;

/**
 * Created by ryanh on 3/13/2018.
 */

public class WeaponTypeListener implements AdapterView.OnItemSelectedListener {
    private TextView selectionView;

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String selection = Weapons.ALL_WEAPON_TYPES.get(i);
        Weapon stats = Weapons.getWeaponStats(selection);
        System.out.println(stats.getDps());
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public WeaponTypeListener(TextView tv){
        this.selectionView = tv;
    }
}


