package com.tomandryan.fortnite.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

import com.tomandryan.fortnite.R;
import com.tomandryan.fortnite.listener.WeaponTypeListener;
import com.tomandryan.fortnite.model.Weapons;

public class WeaponComparisonActivity extends AppCompatActivity {
    @BindView(R.id.weaponTypeA) Spinner weaponTypeA;
    @BindView(R.id.weaponTypeB) Spinner weaponTypeB;
    @BindView(R.id.weaponSelectionA) TextView weaponSelectionA;
    @BindView(R.id.currentWeaponDPS) TextView currentWeaponDPS;
    @BindView(R.id.currentWeaponDamage) TextView currentWeaponDamage;
    @BindView(R.id.currentWeaponFireRate) TextView currentWeaponFireRate;
    @BindView(R.id.currentWeaponMagazineSize) TextView currentWeaponMagazineSize;
    @BindView(R.id.currentWeaponReloadTime) TextView currentWeaponReloadTime;
    @BindView(R.id.currentWeaponRarity) TextView currentWeaponRarity;
    @BindView(R.id.currentWeaponBulletType) TextView currentWeaponBulletType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weapon_comparison_activity);

        ButterKnife.bind(this);

        ArrayAdapter<String> weaponTypeAdapter = new ArrayAdapter<String>(WeaponComparisonActivity.this, android.R.layout.simple_spinner_dropdown_item, Weapons.ALL_WEAPON_TYPES);
        weaponTypeA.setAdapter(weaponTypeAdapter);
        weaponTypeB.setAdapter(weaponTypeAdapter);

        weaponTypeA.setOnItemSelectedListener(new WeaponTypeListener(
                currentWeaponDPS,
                currentWeaponDamage,
                currentWeaponFireRate,
                currentWeaponMagazineSize,
                currentWeaponReloadTime,
                currentWeaponRarity,
                currentWeaponBulletType));
    }


}
