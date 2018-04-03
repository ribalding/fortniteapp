package com.tomandryan.fortnite;

import com.tomandryan.fortnite.model.Weapons;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    public ExampleUnitTest(){

    }

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void compareWeaponStatsTest(){
        int comparisonResultTest = Weapons.compareWeaponStats(90.00, 120.00);
        assertEquals("compareWeaponStats method correctly returns the percentage difference between two numbers",33, comparisonResultTest);
    }
}

