package src.test.java;

import src.main.java.NumberOfSentences;
import org.junit.Test;
import src.test.java.GetTestText;

import static org.junit.Assert.assertEquals;


public class NumberOfSentencesTest {

    private static final String testTextAddress = "./src/test/resources/testTexts/sentencesNumberTest.txt";
    //private static final String testTextAddress = "./src/testTexts/testFile.txt";
    private static final int testNumberOfSentences = 5;

    @Test
    public void numberOfSentencesTest(){

        NumberOfSentences number = new NumberOfSentences(GetTestText.getTestText(testTextAddress));
        //System.out.println(number.getNumberOfSentences());
        assertEquals(testNumberOfSentences, number.getNumberOfSentences());

    }



}
