package com.tomandryan.fortnite.enums;

/**
 * Created by ryanh on 3/6/2018.
 */

public enum WeaponTypes {
    TacticalShotgun(0),
    PumpShotgun(1);

    private final int value;
    WeaponTypes(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }
}
