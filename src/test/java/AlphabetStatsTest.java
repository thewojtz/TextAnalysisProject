package test.java;

import main.java.AlphabetStats;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static test.java.GetTestText.getTestText;

public class AlphabetStatsTest {

    private static final String testAddress = "./src/testTexts/alphabetStatsTest.txt";
    private static final int a = 11;    //expected data
    private static final int b = 7;
    private static final int c = 6;
    private static final int d = 4;
    private static final int g = 9;
    private static final int x = 2;
    private static final int f = 3;


    @Test
    public void alphabetStatsTest() {
        AlphabetStats stats = new AlphabetStats(getTestText(testAddress));
        //stats.showMap(stats.getAlphabetStatsMap());
        assertTrue((stats.getAlphabetStatsMap().get('a')==a)&&
                (stats.getAlphabetStatsMap().get('b')==b)&&
                (stats.getAlphabetStatsMap().get('c')==c)&&
                (stats.getAlphabetStatsMap().get('d')==d)&&
                (stats.getAlphabetStatsMap().get('g')==g)&&
                (stats.getAlphabetStatsMap().get('x')==x)&&
                (stats.getAlphabetStatsMap().get('f')==f)
        );


    }

}
