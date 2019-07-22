package test.java;

import main.java.NumberOfSigns;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.java.GetTestText.getTestText;

public class NumberOfSignsTest {

    static final int testSignsAmount = 970; //defined as signs without spaces according to MS Word 2007
    private static final String testAddress = "./src/testTexts/testFile.txt";



    @Test
    public void numberOfAlphabetSignsTest() {
        NumberOfSigns testObject = new NumberOfSigns(getTestText(testAddress));
        //System.out.println(testObject.getSignsAmount());
        assertEquals(testSignsAmount, testObject.getSignsAmount());
    }

}
