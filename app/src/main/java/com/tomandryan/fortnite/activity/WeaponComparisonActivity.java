package com.tomandryan.fortnite.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;

import com.tomandryan.fortnite.R;
import com.tomandryan.fortnite.listener.WeaponTypeListener;
import com.tomandryan.fortnite.model.Weapons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeaponComparisonActivity extends AppCompatActivity {
    @BindView(R.id.weaponTypeA) Spinner weaponTypeA;
    @BindView(R.id.weaponTypeB) Spinner weaponTypeB;
    @BindView(R.id.weaponSelectionA) TextView weaponSelectionA;
    @BindView(R.id.currentImage) ImageView currentImage;
    @BindView(R.id.currentDPS) TextView currentDPS;
    @BindView(R.id.currentDamage) TextView currentDamage;
    @BindView(R.id.currentHeadshotDamage) TextView currentHeadshotDamage;
    @BindView(R.id.currentFireRate) TextView currentFireRate;
    @BindView(R.id.currentMagazineSize) TextView currentMagazineSize;
    @BindView(R.id.currentReloadTime) TextView currentReloadTime;
    @BindView(R.id.currentRarity) TextView currentRarity;
    @BindView(R.id.currentBulletType) TextView currentBulletType;
    @BindView(R.id.potentialImage) ImageView potentialImage;
    @BindView(R.id.potentialDPS) TextView potentialDPS;
    @BindView(R.id.potentialDamage) TextView potentialDamage;
    @BindView(R.id.potentialHeadshotDamage) TextView potentialHeadshotDamage;
    @BindView(R.id.potentialFireRate) TextView potentialFireRate;
    @BindView(R.id.potentialMagazineSize) TextView potentialMagazineSize;
    @BindView(R.id.potentialReloadTime) TextView potentialReloadTime;
    @BindView(R.id.potentialRarity) TextView potentialRarity;
    @BindView(R.id.potentialBulletType) TextView potentialBulletType;
    @BindView(R.id.compareDPS) TextView compareDPS;
    @BindView(R.id.compareDamage) TextView compareDamage;
    @BindView(R.id.compareHeadshotDamage) TextView compareHeadshotDamage;
    @BindView(R.id.compareFireRate) TextView compareFireRate;
    @BindView(R.id.compareMagazineSize) TextView compareMagazineSize;
    @BindView(R.id.compareReloadTime) TextView compareReloadTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weapon_comparison_activity);

        ButterKnife.bind(this);
        setupStatsDisplay();
    }

    private void setupStatsDisplay(){
        // Create adapter to display weapon types in weapon type spinners
        ArrayAdapter<String> weaponTypeAdapter = new ArrayAdapter<String>(WeaponComparisonActivity.this, android.R.layout.simple_spinner_dropdown_item, Weapons.getWeaponNameList());
        weaponTypeA.setAdapter(weaponTypeAdapter);
        weaponTypeB.setAdapter(weaponTypeAdapter);

        // Set Weapon Type Listener on spinners to update stat displays on weapon selection
        weaponTypeA.setOnItemSelectedListener(new WeaponTypeListener(
                currentImage,
                currentDPS,
                currentDamage,
                currentHeadshotDamage,
                currentFireRate,
                currentMagazineSize,
                currentReloadTime,
                currentRarity,
                currentBulletType,
                        weaponTypeA,
                        weaponTypeB,
                        compareDPS,
                        compareDamage,
                        compareHeadshotDamage,
                        compareFireRate,
                        compareMagazineSize,
                        compareReloadTime
                        )
                );

        weaponTypeB.setOnItemSelectedListener(new WeaponTypeListener(
                        potentialImage,
                        potentialDPS,
                        potentialDamage,
                        potentialHeadshotDamage,
                        potentialFireRate,
                        potentialMagazineSize,
                        potentialReloadTime,
                        potentialRarity,
                        potentialBulletType,
                        weaponTypeA,
                        weaponTypeB,
                        compareDPS,
                        compareDamage,
                        compareHeadshotDamage,
                        compareFireRate,
                        compareMagazineSize,
                        compareReloadTime
                )
        );

    }


}
