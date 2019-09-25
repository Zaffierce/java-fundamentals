package inheritance;

import java.util.LinkedList;

public class Theater {
            /*
            name
            all of the movies currently playing which sounds like a List of some type
             */
    String theaterName;

    public Theater(String theaterName, LinkedList<String> nowPlaying) {
        this.theaterName = theaterName;
        this.nowPlaying = nowPlaying;
    }

    LinkedList<String> nowPlaying = new LinkedList<>();

    //Add movie method and remove movie method?

}
