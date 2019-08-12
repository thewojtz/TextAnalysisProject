package src.test.java;

import src.main.java.NumberOfBlanks;
import org.junit.Test;
import src.test.java.GetTestText;

import static org.junit.Assert.assertEquals;

public class NumberOfBlanksTest {

    static final int testBlanksSignsAmount = 241; //number of expected blank signs in test text
    private static final String testAddress = "./src/test/resources/testTexts/testFile.txt";

    @Test
    public void numberOfBlanksTest() {
        NumberOfBlanks number = new NumberOfBlanks(GetTestText.getTestText(testAddress));
        assertEquals(testBlanksSignsAmount, number.getNumberOfBlanks());
    }

}
