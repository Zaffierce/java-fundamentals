package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class TheaterTest {
    Theater theater;

    LinkedList<String> theater1_nowPlaying = new LinkedList<>();
//    LinkedList<String> theater2_nowPlaying = new LinkedList<>(); // Not implemented yet
    @Before
    public void setUp() throws Exception {
        theater1_nowPlaying.add("Lego Batman");
        theater1_nowPlaying.add("Super Troopers");
        theater1_nowPlaying.add("Avengers 37:  Groots Revenge");
        theater = new Theater("Code Fellows Cinemas", theater1_nowPlaying);


    }

    @Test
    public void testNowPlaying_toString() {
        System.out.println(theater.theaterName);
        System.out.println(theater.nowPlaying);
    }

}