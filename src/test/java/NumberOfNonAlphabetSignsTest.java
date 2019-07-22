package test.java;


import main.java.NumberOfNonAlphabetSigns;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.java.GetTestText.getTestText;

public class NumberOfNonAlphabetSignsTest {

    static final int testNonAlphabetSignsAmount = 292; //counted using MS Office 2007 and Notepad++

    private static final String testAddress = "./src/testTexts/testFile.txt";


    @Test
    public void numberOfNonAlphabetSignsTest() {
        NumberOfNonAlphabetSigns number = new NumberOfNonAlphabetSigns(getTestText(testAddress));
       //System.out.println(number.getNumberOfNonAlphabetSigns());
        assertEquals(testNonAlphabetSignsAmount, number.getNumberOfNonAlphabetSigns());
    }

}
