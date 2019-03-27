package au.edu.jcu.cp3406.stopwatchapp;

import org.junit.Test;
import org.junit.rules.Stopwatch;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class StopwatchTests {
    @Test
    public void testContructor(){
        Stopwatch stopwatch = new Stopwatch(){};
        assertEquals("00:00:00",stopwatch.toString());
    }

    private static void assertEquals(String s, String toString) {

    }
}