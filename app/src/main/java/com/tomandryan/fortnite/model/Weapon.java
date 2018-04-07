package com.tomandryan.fortnite.model;

import android.graphics.drawable.Drawable;
import android.media.Image;

/**
 * Created by Tom on 3/19/2018.
 */

public class Weapon {

    private String gunName;
    private double dps;
    private int damage;
    private double fireRate;
    private int magazineSize;
    private double reloadTime;
    private String rarity;
    private String bulletType;
    public Drawable image;


    public Weapon(String gunName, double dps, int damage, double fireRate, int magazineSize, double reloadTime, String rarity, String bulletType, Drawable image) {
        this.gunName = gunName;
        this.dps = dps;
        this.damage = damage;
        this.fireRate = fireRate;
        this.magazineSize = magazineSize;
        this.reloadTime = reloadTime;
        this.rarity = rarity;
        this.bulletType = bulletType;
        this.image = image;
    }

    public String getGunName() {
        return gunName;
    }

    public void setGunName(String gunName) {
        this.gunName = gunName;
    }

    public double getDps() {
        return dps;
    }

    public void setDps(double dps) {
        this.dps = dps;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getFireRate() {
        return fireRate;
    }

    public void setFireRate(double fireRate) {
        this.fireRate = fireRate;
    }

    public int getMagazineSize() {
        return magazineSize;
    }

    public void setMagazineSize(int magazineSize) {
        this.magazineSize = magazineSize;
    }

    public double getReloadTime() {
        return reloadTime;
    }

    public void setReloadTime(double reloadTime) {
        this.reloadTime = reloadTime;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getBulletType() {
        return bulletType;
    }

    public void setBulletType(String bulletType) {
        this.bulletType = bulletType;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

}


