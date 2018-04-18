package com.tomandryan.fortnite.model;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class WeaponAttributeSet{
    private List<WeaponAttribute> attributeList;

    public WeaponAttributeSet(List<WeaponAttribute> attributeList){
        this.attributeList = attributeList;
    }

    public List<WeaponAttribute> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(List<WeaponAttribute> attributeList) {
        this.attributeList = attributeList;
    }


}
