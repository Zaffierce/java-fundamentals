import java.text.SimpleDateFormat;
import java.util.Calendar;

// File name matches EXACTLY with class name
public class Demo_basics {

  //running a file means running the main method
  public static void main(String[] args) {
    System.out.println("Hello, Java");
    //System.out.println(isItSalmonSeason("July"));
    Calendar cal = Calendar.getInstance();
    String currentMonth = new SimpleDateFormat("MMMM").format(cal.getTime());
    System.out.println(isItSalmonSeason(currentMonth));

    String myName = "Jon";

    //option 1 for created an array;  give it a size, fill in the data
    // String[] names = new String[3];
    // names[0] = "Michelle";
    // names[1] = "Nicholas";
    // names[2] = "Jon";

    //option 2; use curley braces to specify the data inside of the array
    String[] names = new String[]{"Michelle", "Nicholas", "Jeff"};
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
  }

  //writing a method.  for now.... 
  //they always start with "public static"
  //then return type (or void)
  //then name of method
  public static boolean isItSalmonSeason(String month) {
    //july - september
    // == works for primities (float, byte, double, char, long, short, boolean, int)
    // .equals works well for objects (everything else)
    if(month.equals("July") || month.equals("August") || month.equals("September")) {
      return true;
    } else {
      return false;
    }
  }

}