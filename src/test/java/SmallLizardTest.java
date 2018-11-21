import Kaiju.SmallLizard;
import Vehicles.Helicopter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SmallLizardTest {

    SmallLizard smallLizard;
    Helicopter helicopter;

    @Before
    public void setUp() throws Exception {
        smallLizard = new SmallLizard("Godzuki", 100, 5);
        helicopter = new Helicopter("Apache", 10, 1);
    }

    @Test
    public void getName() {
        assertEquals("Godzuki", smallLizard.getName());
    }

    @Test
    public void setName() {
        smallLizard.setName("John");
        assertEquals("John", smallLizard.getName());
    }

    @Test
    public void getHealthValue() {
        assertEquals(100, smallLizard.getHealthValue());
    }

    @Test
    public void setHealthValue() {
        smallLizard.setHealthValue(20);
        assertEquals(20,smallLizard.getHealthValue());
    }

    @Test
    public void getAttackValue() {
        assertEquals(5, smallLizard.getAttackValue());
    }

    @Test
    public void setAttackValue() {
        smallLizard.setAttackValue(2);
        assertEquals(2,smallLizard.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Roooooar...", smallLizard.roar());
    }

    @Test
    public void canTakeDamage() {
        smallLizard.takeDamage(1);
        assertEquals(99, smallLizard.getHealthValue());
    }

    @Test
    public void canInflictDamage() {
        smallLizard.attack(helicopter);
        assertEquals(5, helicopter.getHealthValue());
    }

    @Test
    public void fly() {
        assertEquals("Godzuki can fly", smallLizard.fly());
    }

}
