package com.tomandryan.fortnite.listener;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.tomandryan.fortnite.R;
import com.tomandryan.fortnite.activity.WeaponComparisonActivity;
import com.tomandryan.fortnite.model.Weapon;
import com.tomandryan.fortnite.model.Weapons;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;


/**
 * OnItemSelectedListener implementation for setting text of supplied text views with
 * given weapon's stats when that weapon is selected.
 *
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
    private Spinner weaponSelectionA;
    private Spinner weaponSelectionB;
    private TextView compareDPS;

    public WeaponTypeListener(TextView currentWeaponDPS,
                              TextView currentWeaponDamage,
                              TextView currentWeaponFireRate,
                              TextView currentWeaponMagazineSize,
                              TextView currentWeaponReloadTime,
                              TextView currentWeaponRarity,
                              TextView currentWeaponBulletType,
                              Spinner weaponSelectionA,
                              Spinner weaponSelectionB,
                              TextView compareDPS
                              ){
        this.currentWeaponDPS = currentWeaponDPS;
        this.currentWeaponDamage = currentWeaponDamage;
        this.currentWeaponFireRate = currentWeaponFireRate;
        this.currentWeaponMagazineSize = currentWeaponMagazineSize;
        this.currentWeaponReloadTime = currentWeaponReloadTime;
        this.currentWeaponRarity = currentWeaponRarity;
        this.currentWeaponBulletType = currentWeaponBulletType;
        this.weaponSelectionA = weaponSelectionA;
        this.weaponSelectionB = weaponSelectionB;
        this.compareDPS = compareDPS;

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Weapon stats = Weapons.getWeaponStats(i);
        this.setWeaponStats(stats);
        updateComparison(weaponSelectionA, weaponSelectionB, compareDPS);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }


    /**
     * Set weapon stat display text views with currently selected weapon stats
     */
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

    private static void updateComparison(Spinner a, Spinner b, TextView compareDPS){
        Weapon selectA = Weapons.getWeaponStats(a.getSelectedItemPosition());
        Weapon selectB = Weapons.getWeaponStats(b.getSelectedItemPosition());
        Integer dps = Weapons.compareWeaponStats(selectA.getDps(), selectB.getDps());
        compareDPS.setText(dps.toString());
    }
}


