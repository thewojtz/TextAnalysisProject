package test.java;

import main.java.NumberOfBlanks;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static test.java.GetTestText.getTestText;

public class NumberOfBlanksTest {

    static final int testBlanksSignsAmount = 241; //number of expected blank signs in test text
    private static final String testAddress = "./src/testTexts/testFile.txt";

    @Test
    public void numberOfBlanksTest() {
        NumberOfBlanks number = new NumberOfBlanks(getTestText(testAddress));
        assertEquals(testBlanksSignsAmount, number.getNumberOfBlanks());
    }

}
