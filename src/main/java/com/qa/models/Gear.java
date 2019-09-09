package com.qa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gear {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    Long id;
    String gearName;
    String type;
    int ap;
    int Accuracy;
    int dp;
    int evasion;
    int hiddenEvasion;
    int damageReduction;
    int hiddendamageReduction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGearName() {
        return gearName;
    }

    public void setGearName(String gearName) {
        this.gearName = gearName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getAccuracy() {
        return Accuracy;
    }

    public void setAccuracy(int accuracy) {
        Accuracy = accuracy;
    }

    public int getDp() {
        return dp;
    }

    public void setDp(int dp) {
        this.dp = dp;
    }

    public int getEvasion() {
        return evasion;
    }

    public void setEvasion(int evasion) {
        this.evasion = evasion;
    }

    public int getHiddenEvasion() {
        return hiddenEvasion;
    }

    public void setHiddenEvasion(int hiddenEvasion) {
        this.hiddenEvasion = hiddenEvasion;
    }

    public int getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(int damageReduction) {
        this.damageReduction = damageReduction;
    }

    public int getHiddendamageReduction() {
        return hiddendamageReduction;
    }

    public void setHiddendamageReduction(int hiddendamageReduction) {
        this.hiddendamageReduction = hiddendamageReduction;
    }
}
