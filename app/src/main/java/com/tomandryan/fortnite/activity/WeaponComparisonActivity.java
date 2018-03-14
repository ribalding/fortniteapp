package com.tomandryan.fortnite.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

import com.tomandryan.fortnite.R;
import com.tomandryan.fortnite.listener.WeaponTypeListener;
import com.tomandryan.fortnite.model.Weapons;

import java.util.Arrays;
import java.util.List;

public class WeaponComparisonActivity extends AppCompatActivity {
    @BindView(R.id.weaponTypeA) Spinner weaponTypeA;
    @BindView(R.id.weaponRarityA) Spinner weaponRarityA;
    @BindView(R.id.weaponTypeB) Spinner weaponTypeB;
    @BindView(R.id.weaponRarityB) Spinner weaponRarityB;
    @BindView(R.id.weaponSelectionA) TextView weaponSelectionA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weapon_comparison_activity);

        ButterKnife.bind(this);

        ArrayAdapter<String> weaponTypeAdapter = new ArrayAdapter<String>(WeaponComparisonActivity.this, android.R.layout.simple_spinner_dropdown_item, Weapons.ALL_WEAPON_TYPES);
        weaponTypeA.setAdapter(weaponTypeAdapter);
        weaponTypeB.setAdapter(weaponTypeAdapter);

        ArrayAdapter<String> weaponRarityAdapter = new ArrayAdapter<String>(WeaponComparisonActivity.this, android.R.layout.simple_spinner_dropdown_item, Weapons.ALL_WEAPON_RARITIES);
        weaponRarityA.setAdapter(weaponRarityAdapter);
        weaponRarityB.setAdapter(weaponRarityAdapter);

        weaponTypeA.setOnItemSelectedListener(new WeaponTypeListener(weaponSelectionA));
    }


}
