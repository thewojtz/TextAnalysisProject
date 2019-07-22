package test.java;

import main.java.NumberOfSentences;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static test.java.GetTestText.getTestText;

public class NumberOfSentencesTest {

    private static final String testTextAddress = "./src/testTexts/sentencesNumberTest.txt";
    //private static final String testTextAddress = "./src/testTexts/testFile.txt";
    private static final int testNumberOfSentences = 5;

    @Test
    public void numberOfSentencesTest(){

        NumberOfSentences number = new NumberOfSentences(getTestText(testTextAddress));
        System.out.println(number.getNumberOfSentences());
        assertEquals(testNumberOfSentences, number.getNumberOfSentences());

    }



}
