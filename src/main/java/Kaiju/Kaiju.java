package Kaiju;

import Behaviours.IAttack;
import Behaviours.IDamage;

public abstract class Kaiju implements IAttack, IDamage {

    public String name;
    public int healthValue;
    public int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String roar(){
        return "Roooooar...";
    }

    public int takeDamage(int damage){
        return healthValue -= damage;
    }

    public int attack(IDamage iDamage){
        return iDamage.takeDamage(attackValue);
    }

    public String fly(){
        return name + " can fly";
    }
}
