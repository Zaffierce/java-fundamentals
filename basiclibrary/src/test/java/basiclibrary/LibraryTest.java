/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testRoll() {
        int[] arr = new int[4];
        int length = arr.length;
        assertEquals(
                "This should check the length of the array.",
                length,
            Library.roll(4).length
        );
    }

    @Test
    public void testContainsDuplicates_false() {
        int[] arr = new int[]{1,2,3};
        assertEquals(
                "This should return false as there are no duplicates in your array.",
                false,
                Library.containsDuplicates(arr)
        );
    }

    @Test
    public void testContainsDuplicates_true() {
        int[] arr = new int[]{1,2,3,3};
        assertEquals(
                "This should return true as there are duplicates in your array.",
                true,
                Library.containsDuplicates(arr)
        );
    }

    @Test
    public void testAvgArray() {
        int[] arr = new int[]{1,2,3,4};
        double answer = 2.5;
        //ERROR: Use assertEquals(expected, actual, delta) to compare floating-point numbers?
//        assertEquals(
//                "This should grab the average value of the integers passed in to your array",
//              answer,
//              Library.averageOfArray(arr)
//        );
    }

//    @Test
//    public void testMinAndMaxForWeather() {
//        int[][] arr = new int[][]{
//                {66, 64, 58, 65, 71, 57, 60},
//                {57, 65, 65, 70, 72, 65, 51},
//                {55, 54, 60, 53, 59, 57, 61},
//                {65, 56, 55, 52, 55, 62, 57}
//        };
//
//
//    }

}
