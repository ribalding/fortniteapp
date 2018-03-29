package com.tomandryan.fortnite.listener;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.tomandryan.fortnite.model.Weapon;
import com.tomandryan.fortnite.model.Weapons;


/**
 * Created by ryanh on 3/13/2018.
 */

public class WeaponTypeListener implements AdapterView.OnItemSelectedListener {
    private TextView currentWeaponDPS;
    private TextView currentWeaponDamage;
    private TextView currentWeaponFireRate;
    private TextView currentWeaponMagazineSize;
    private TextView currentWeaponReloadTime;
    private TextView currentWeaponRarity;
    private TextView currentWeaponBulletType;

    public WeaponTypeListener(TextView currentWeaponDPS,
                              TextView currentWeaponDamage,
                              TextView currentWeaponFireRate,
                              TextView currentWeaponMagazineSize,
                              TextView currentWeaponReloadTime,
                              TextView currentWeaponRarity,
                              TextView currentWeaponBulletType
                              ){
        this.currentWeaponDPS = currentWeaponDPS;
        this.currentWeaponDamage = currentWeaponDamage;
        this.currentWeaponFireRate = currentWeaponFireRate;
        this.currentWeaponMagazineSize = currentWeaponMagazineSize;
        this.currentWeaponReloadTime = currentWeaponReloadTime;
        this.currentWeaponRarity = currentWeaponRarity;
        this.currentWeaponBulletType = currentWeaponBulletType;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String selection = Weapons.ALL_WEAPON_TYPES.get(i);
        Weapon stats = Weapons.getWeaponStats(selection);
        this.setWeaponStats(stats);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    private void setWeaponStats (Weapon w) {
        this.currentWeaponDPS.setText(Double.toString(w.getDps()));
        /* do we need to send over weapon name as well? */
        this.currentWeaponDamage.setText(Integer.toString(w.getDamage()));
        this.currentWeaponFireRate.setText(Double.toString(w.getFireRate()));
        this.currentWeaponMagazineSize.setText(Integer.toString(w.getMagazineSize()));
        this.currentWeaponReloadTime.setText(Double.toString(w.getReloadTime()));
        this.currentWeaponRarity.setText(w.getRarity());
        this.currentWeaponBulletType.setText(w.getBulletType());

    }

}


