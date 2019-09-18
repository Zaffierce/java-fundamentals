/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Random;
import java.util.Arrays;

public class Library {
//    public boolean someLibraryMethod() {
//        return true;
//    }
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(roll(6)));

        int[] dupArr = new int[]{1,2,3,4,5,6,7,8,9,10,1};
//        System.out.println(containsDuplicates(dupArr));

        int[] avgArr = new int[]{1,2,3,6,6};
//        System.out.println(averageOfArray(avgArr));

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
//        System.out.println(averageOfArrayOfArrays(weeklyMonthTemperatures));
    }

    public static int[] roll(int n) {
        int min = 1;
        int max = 6;
        Random random = new Random();
        int[] returnArr = new int[n];
        for (int i = 0; i < n; i++) {
            int randomNum = random.nextInt((max - min) + 1) + min;
            returnArr[i] = randomNum;
        }
        System.out.println("Rolling the dice "+n+" times... what do we get?");
        return returnArr;
    }

    public static boolean containsDuplicates(int[] arr) {
        //Used Solution 1 from this website:
        //https://javarevisited.blogspot.com/2015/06/3-ways-to-find-duplicate-elements-in-array-java.html
        boolean isDuplicate = false;
        int compare = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + " - I is equal to " + arr[j] + " - J");
                    isDuplicate = true;
                }
            }
        }
        return isDuplicate;
    }

    public static double averageOfArray(int[] arr) {
        int divideBy = arr.length;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / divideBy;
    }

//    public static int[] averageOfArrayOfArrays(int[][] arr) {
//        //
//
//    }

 }
