package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class RestaurantTest {

    Restaurant makas;

    @Before
    public void setup() throws Exception {
        makas = new Restaurant("McDonodolololo", 1, 1);
    }

    @Test
    public void testRestaurants_toString() {
        String expectedResult = "This restaurant's name is McDonodolololo, they have a rating of 1 and a price rating of 1";

        assertEquals("This should return a string with the restaurants name, rating and price.",
                expectedResult,
                makas.toString());
    }

    @Test
    public void testRestaurants_review() {
        makas.addReviewedHead("Bob Dole", "Makas is the shiz nit.", 5);
        assertEquals("Should have 5 stars",
                5,
                makas.head.data.restaurantRating);
    }

    @Test
    public void testRestaurants_review_avg() {
        makas.addReviewedHead("Bob Dole", "Makas is the shiz nit.", 5);
        makas.addReviewedHead("James Dansie", "I used to work here, it sucked.  Bob was okay though.  :thumbsup:", 3);
        assertEquals("Should have 5 stars",
                "This restaurant's name is McDonodolololo, they have a rating of 4 and a price rating of 1",
                makas.toString());
    }

}