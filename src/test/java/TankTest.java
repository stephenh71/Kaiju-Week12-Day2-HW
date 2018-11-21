import Kaiju.SmallLizard;
import Vehicles.Tank;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TankTest {

    Tank tank;
    SmallLizard smallLizard;

    @Before
    public void setUp() throws Exception {
        tank = new Tank("Chieftan", 100, 7);
        smallLizard = new SmallLizard("Godzuki", 100, 10);

    }

    @Test
    public void getType() {
        assertEquals("Chieftan", tank.getType());
    }

    @Test
    public void setName() {
        tank.setType("Chieftan");
        assertEquals("Chieftan", tank.getType());
    }

    @Test
    public void getHealthValue() {
        assertEquals(100, tank.getHealthValue());
    }

    @Test
    public void setHealthValue() {
        tank.setHealthValue(20);
        assertEquals(20,tank.getHealthValue());
    }

    @Test
    public void getAttackValue() {
        assertEquals(7, tank.getAttackValue());
    }

    @Test
    public void setAttackValue() {
        tank.setAttackValue(5);
        assertEquals(5,tank.getAttackValue());
    }

    @Test
    public void canTakeDamage() {
        tank.takeDamage(23);
        assertEquals(77, tank.getHealthValue());
    }

    @Test
    public void canInflictDamage() {
        tank.attack(smallLizard);
        assertEquals(93, smallLizard.getHealthValue());
    }
}
