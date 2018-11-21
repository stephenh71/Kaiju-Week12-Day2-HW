package Vehicles;

import Behaviours.IAttack;
import Behaviours.IDamage;

public abstract class Vehicle implements IAttack, IDamage {

    public String type;
    public int healthValue;
    public int attackValue;

    public Vehicle(String type, int healthValue, int attackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public int takeDamage(int damage){
        return healthValue -= damage;
    }

    public int attack(IDamage iDamage){
        return iDamage.takeDamage(attackValue);
    }
}
