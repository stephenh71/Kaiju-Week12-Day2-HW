import Kaiju.BigLizard;
import Vehicles.Tank;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BigLizardTest {

    BigLizard bigLizard;
    Tank tank;

    @Before
    public void setUp() throws Exception {
        bigLizard = new BigLizard("Godzilla", 100, 10);
        tank = new Tank("Chieftan", 20, 2);
    }

    @Test
    public void getName() {
        assertEquals("Godzilla", bigLizard.getName());
    }

    @Test
    public void setName() {
        bigLizard.setName("John");
        assertEquals("John", bigLizard.getName());
    }

    @Test
    public void getHealthValue() {
        assertEquals(100, bigLizard.getHealthValue());
    }

    @Test
    public void setHealthValue() {
        bigLizard.setHealthValue(20);
        assertEquals(20,bigLizard.getHealthValue());
    }

    @Test
    public void getAttackValue() {
        assertEquals(10, bigLizard.getAttackValue());
    }

    @Test
    public void setAttackValue() {
        bigLizard.setAttackValue(5);
        assertEquals(5,bigLizard.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Roooooar...", bigLizard.roar());
    }

    @Test
    public void canTakeDamage() {
        bigLizard.takeDamage(2);
        assertEquals(98, bigLizard.getHealthValue());
    }

    @Test
    public void canInflictDamage() {
        bigLizard.attack(tank);
        assertEquals(10, tank.getHealthValue());
    }

    @Test
    public void fly() {
        assertEquals("Godzilla can fly", bigLizard.fly());
    }
}
