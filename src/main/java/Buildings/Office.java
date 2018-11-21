package Buildings;

import Behaviours.IDamage;

public class Office implements IDamage {

    public int healthValue;

    public Office(int healthValue) { ;
        this.healthValue = healthValue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int takeDamage(int damage){
        return healthValue -= damage;
    }
}

