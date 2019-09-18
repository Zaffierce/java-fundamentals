import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads();
        clock();

    }

    public static String pluralize(String word, int number) {
        //if (number == 1) { return word; } else { return word += "s"; }
        if (number == 0 || number >= 2) {
            return word += "s";
        } else {
            return word;
        }
    }

    public static void flipNHeads() {
        int headCounter = 0;
        int flipCounter = 0;
        int max = 1;
        int min = 0;
        Random ran = new Random();
        while(headCounter < 2) {
            int randomNum = ran.nextInt((max - min) + 1);
            if (randomNum == 0) {
                headCounter++;
                flipCounter++;
                System.out.println("heads");
            } else {
                headCounter = 0;
                flipCounter++;
                System.out.println("tails");
            }
        }
        System.out.println("It took "+flipCounter+" flips to flip "+headCounter+" heads in a row.");
    }

    public static void clock() {
        // int hour = now.getHour();
        // int minute = now.getMinute();
        LocalDateTime now = LocalDateTime.now();
        int oldSecond = now.getSecond();
        while (true) {
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            now = LocalDateTime.now();
            int newSecond = now.getSecond();
            if (oldSecond != newSecond) {
                oldSecond = newSecond;
               System.out.println(time);
            }

        }
    }

}