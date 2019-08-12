package src.test.java;

import src.main.java.NumberOfSigns;
import org.junit.Test;
import src.test.java.GetTestText;


import static org.junit.Assert.assertEquals;

public class NumberOfSignsTest {

    static final int testSignsAmount = 970; //defined as signs without spaces according to MS Word 2007
    private static final String testAddress = "./src/test/resources/testTexts/testFile.txt";



    @Test
    public void numberOfAlphabetSignsTest() {
        NumberOfSigns testObject = new NumberOfSigns(GetTestText.getTestText(testAddress));
        //System.out.println(testObject.getSignsAmount());
        assertEquals(testSignsAmount, testObject.getSignsAmount());
    }

}
