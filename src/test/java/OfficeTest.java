import Kaiju.SmallLizard;
import Buildings.Office;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OfficeTest {

    Office office;
    SmallLizard smallLizard;

    @Before
    public void setUp() throws Exception {
        office = new Office(200);
        smallLizard = new SmallLizard("Godzuki", 100, 10);
    }

    @Test
    public void getHealthValue() {
        assertEquals(200, office.getHealthValue());
    }

    @Test
    public void setHealthValue() {
        office.setHealthValue(20);
        assertEquals(20,office.getHealthValue());
    }

    @Test
    public void canTakeDamage() {
        office.takeDamage(46);
        assertEquals(154, office.getHealthValue());
    }
}

