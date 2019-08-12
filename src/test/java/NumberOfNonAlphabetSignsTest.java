package src.test.java;


import src.main.java.NumberOfNonAlphabetSigns;
import org.junit.Test;
import src.test.java.GetTestText;

import static org.junit.Assert.assertEquals;

public class NumberOfNonAlphabetSignsTest {

    static final int testNonAlphabetSignsAmount = 292; //counted using MS Office 2007 and Notepad++

    private static final String testAddress = "./src/test/resources/testTexts/testFile.txt";


    @Test
    public void numberOfNonAlphabetSignsTest() {
        NumberOfNonAlphabetSigns number = new NumberOfNonAlphabetSigns(GetTestText.getTestText(testAddress));
       //System.out.println(number.getNumberOfNonAlphabetSigns());
        assertEquals(testNonAlphabetSignsAmount, number.getNumberOfNonAlphabetSigns());
    }

}
