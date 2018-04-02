package com.tomandryan.fortnite;

import com.tomandryan.fortnite.model.Weapons;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CompareWeaponStatsTest {

    @Test
    public void compareWeaponStatsTest(){
        int comparisonResultTest = Weapons.compareWeaponStats(90.00, 120.00);
            assertEquals(33, comparisonResultTest);
    }

    public CompareWeaponStatsTest(){
    }
}

