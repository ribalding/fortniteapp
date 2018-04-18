package com.tomandryan.fortnite;

import android.graphics.Color;

import com.tomandryan.fortnite.model.Weapons;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompareWeaponStatsTest {

    public CompareWeaponStatsTest() {
    }

    @Test
    public void compareWeaponStatsTest() {
        int comparisonResultTest = Weapons.compareWeaponStats(90.00, 120.00);
        assertEquals("compareWeaponStats method correctly returns the percentage difference between two numbers", 33, comparisonResultTest);
    }

    @Test
    public void percentagePositiveTest() {
        int percentagePositiveResultTest = Weapons.percentagePositive(10);
        assertEquals("percentagePositive method correctly changes the color of the percent change", Color.GREEN, percentagePositiveResultTest);
    }
}
