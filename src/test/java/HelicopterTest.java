import Kaiju.BigLizard;
import Vehicles.Helicopter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HelicopterTest {

    Helicopter helicopter;
    BigLizard bigLizard;

    @Before
    public void setUp() throws Exception {
        helicopter = new Helicopter("Apache", 100, 2);
        bigLizard = new BigLizard("Godzilla", 100, 10);

    }

    @Test
    public void getType() {
        assertEquals("Apache", helicopter.getType());
    }

    @Test
    public void setName() {
        helicopter.setType("Sikorsky");
        assertEquals("Sikorsky", helicopter.getType());
    }

    @Test
    public void getHealthValue() {
        assertEquals(100, helicopter.getHealthValue());
    }

    @Test
    public void setHealthValue() {
        helicopter.setHealthValue(20);
        assertEquals(20,helicopter.getHealthValue());
    }

    @Test
    public void getAttackValue() {
        assertEquals(2, helicopter.getAttackValue());
    }

    @Test
    public void setAttackValue() {
        helicopter.setAttackValue(10);
        assertEquals(10,helicopter.getAttackValue());
    }

    @Test
    public void canTakeDamage() {
        helicopter.takeDamage(55);
        assertEquals(45, helicopter.getHealthValue());
    }

    @Test
    public void canInflictDamage() {
        helicopter.attack(bigLizard);
        assertEquals(98, bigLizard.getHealthValue());
    }

}
