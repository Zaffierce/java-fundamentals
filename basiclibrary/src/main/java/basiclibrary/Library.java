/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

public class Library {
    //    public boolean someLibraryMethod() {
//        return true;
//    }
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(roll(6)));
//
//        int[] dupArr = new int[]{1,2,3,4,5,6,7,8,9,10,1};
//        System.out.println(containsDuplicates(dupArr));
//
//        int[] avgArr = new int[]{1,2,3,6,6};
//        System.out.println(averageOfArray(avgArr));
//
//        int[][] weeklyMonthTemperatures = {
//                {66, 64, 58, 65, 71, 57, 60},
//                {57, 65, 65, 70, 72, 65, 51},
//                {55, 54, 60, 53, 59, 57, 61},
//                {65, 56, 55, 52, 55, 62, 57}
//        };
//        System.out.print(Arrays.toString(minAndMaxForWeather(weeklyMonthTemperatures)));
//        System.out.println(minAndMaxForWeather(weeklyMonthTemperatures));
//        System.out.println(averageOfArrayOfArrays(weeklyMonthTemperatures));
//        int[] testArr = new int[]{1,2,3,4,5,6,7,8,9};
//        System.out.println(getMaxNumber(testArr));
//        System.out.println(getMinNumber(testArr));
//        System.out.println(minAndMax(testArr));

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        System.out.println(tally(votes));
//        tally(votes);
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

    //    public static double calculateLowestAverage2dArray(int[][] arr) {
//        double lowestAverage = calculateAverages(arr[0]);
//
//        for (int i = 0; i < arr.length; i++) {
//            double currentAverage = calculateAverages(arr[i]);
//            if (lowestAverage > currentAverage) {
//                lowestAverage = currentAverage;
//            }
//        }
//        return lowestAverage;
//    }
//    public static int[] averageOfArrayOfArrays(int[][] arr) {
//        //
//
//    }

    public static String hashyMappy(int[][] weeklyMonthTemperatures) {
        int high = 0;
        //int high = Integer.MIN_VALUE; // Smallest value possible in Java
        int low = 200;
        //int low = Integer.MAX_VALUE; // Largest value possible in Java


        HashSet<Integer> monthTemps = new HashSet<>();
        for (int i = 0; i < weeklyMonthTemperatures.length; i++){
            for (int j = 0; j < weeklyMonthTemperatures[i].length; j++){
                monthTemps.add(weeklyMonthTemperatures[i][j]);
                if (weeklyMonthTemperatures[i][j]>high){
                    high=weeklyMonthTemperatures[i][j];
                }
                if (weeklyMonthTemperatures[i][j]<low){
                    low=weeklyMonthTemperatures[i][j];
                }
            }
        }
        //%d means insert a number at that spot
        //%s means insert a String at that spot
        StringBuilder tempNotSeen= new StringBuilder(String.format("High: %d\nLow: %d", high, low));
        for(int i = low; i<high; i++){
            if (!monthTemps.contains(i)){
                tempNotSeen.append(String.format("\nNever saw temperature: %d", i));
            }
        }
        return tempNotSeen.toString();
    }


    // Create a method that iterates through the array to find the max and min value
    // This method also keeps track of all unique values seen
    // Finally, iterate through the unique values and display any not seen.
    public static String minAndMaxForWeather(int[][] arr) {
//        HashSet<Integer> number = new HashSet<>();
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(Arrays.toString(arr));
//        }
//        for (int[] num : arr) {
//            System.out.println(Arrays.toString(arr));
//        }
    return "Test";
    }


    // Create a method that takes in a List of names
    // Create a list that contains unique words
    // Iterate through the incoming list and add +1 for every occurrence of that word
    // Return the word that has the highest value
    public static String tally (List<String> arr) {
        HashSet<String> voteSet = new HashSet<>(arr);
        HashMap<String, Integer> voteCounts = new HashMap<>();
        int maxVotes = 0;
        String maxWinner = "";
        for (String name : arr) {
            voteCounts.put(name, 0);
        }
        System.out.println(voteSet);
        for (int i = 0; i < arr.size(); i++){
            String word = arr.get(i);
            if (voteSet.contains(word)) {
                voteCounts.put(word, voteCounts.get(word) + 1);
            }
        }
        for (String i : voteCounts.keySet()) {
            if(voteCounts.get(i) > maxVotes) {
                maxVotes = voteCounts.get(i);
                maxWinner = i;
            }
        }
        String answer = maxWinner+" received the most votes! " +maxVotes+ " votes";
    return answer;
    }

}
