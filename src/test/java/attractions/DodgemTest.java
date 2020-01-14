package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(14, 1.2, 40.0);
        visitor2 = new Visitor(6, 2.3, 80.0);

    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(4.50, dodgems.defaultPrice(),0.01);
    }

    @Test
    public void hasPriceForDifferentPeople(){
        assertEquals(4.50, dodgems.priceFor(visitor1),0.01);
        assertEquals(2.25, dodgems.priceFor(visitor2),0.01);

    }
}
