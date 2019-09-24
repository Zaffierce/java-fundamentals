package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    Review foods;

    @Before
    public void setUp() throws Exception {
        foods = new Review("Bob Dole", "This was gud.", 3);
    }

    @Test
    public void Review() {
        System.out.println(foods.toString());
    }

//    @Test
//    public void Review_toString() {
////        Review foods = new Review();
////        foods.restaurantReview();
//
//        assertEquals("blablabla...",
//                "This restaurant's name is All-You-Cana-Eat-4-Freeeeeeeeeee, they have a rating of 5 and a price rating of 1\n" +
//                        "The latest review left is...\n" +
//                        "This place is the bomb diggidy",
//                foods.toString()
//                );
//    }
//
//    @Test
//    public void Review_Insert(){
//        //Todo
//    }
}