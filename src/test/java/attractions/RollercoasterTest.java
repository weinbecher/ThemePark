package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(14, 1.2, 40.0);
        visitor2 = new Visitor(6, 2.3, 80.0);
        visitor3 = new Visitor(26, 1.5, 80.0);
        ;
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void hasPriceForDifferentPeople() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor1), 0.01);
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.01);
    }


    @Test
    public void hasSecurityCheck(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor3));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }
}
