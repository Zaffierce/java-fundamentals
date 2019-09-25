package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("What Even Is Life?", "This shop will answer all of lifes questions", 4);
    }

    @Test
    public void testToString() {
        String expectedResult = "This shop's called 'What Even Is Life?', their description is 'This shop will answer all of lifes questions' and they have a average price cost of 4";
        assertEquals("This tests the toString method to ensure the correct output",
                expectedResult,
                shop.toString());
    }

    @Test
    public void testConstructor() {
        assertEquals("What Even Is Life?", shop.shopName);
        assertEquals("This shop will answer all of lifes questions", shop.shopDescription);
        assertEquals(4, shop.shopCost);
    }

    @Test
    public void testReview_toString() {
        String expectedResult = "Billy Bob Thorton recently reviewed this place and had this to say: 'This place was pretty fantastic!'.  They rated the place as '5' out of 5 for the price.";
        assertEquals("This should return the review for a shop",
                expectedResult,
                shop.toStringReview());
    }

}