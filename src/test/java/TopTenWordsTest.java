package src.test.java;

import src.main.java.TopTenWords;
import org.junit.Test;
import src.test.java.GetTestText;

import static org.junit.Assert.assertTrue;


public class TopTenWordsTest {

    private static final String testTextAddress = "./src/test/resources/testTexts/topTenWordsTest.txt";
    private static final int rowerek= 1;
    private static final int samolot = 4;
    private static final int zadanie = 3;
    private static final int testowanie = 3;


    @Test
    public void topTenWordsTest() {
        TopTenWords stats = new TopTenWords(GetTestText.getTestText(testTextAddress));

        assertTrue((stats.getTopTenWordsMap().get("rowerek")==rowerek)&&
                (stats.getTopTenWordsMap().get("samolot")==samolot)&&
                (stats.getTopTenWordsMap().get("zadanie")==zadanie)&&
                (stats.getTopTenWordsMap().get("testowanie")==testowanie));
    }

}
