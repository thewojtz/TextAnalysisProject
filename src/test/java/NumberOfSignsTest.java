package test.java;

import main.java.NumberOfSigns;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static test.java.GetTestText.getTestText;

public class NumberOfSignsTest {

    static final int testSignsAmount = 970; //defined as signs without spaces according to MS Word 2007
    private static final String testAddress = "./src/testTexts/testFile.txt";



    @Test
    public void numberOfAlphabetSignsTest() {
        NumberOfSigns testObject = new NumberOfSigns(getTestText(testAddress));
        System.out.println(testObject.getSignsAmount());
        assertTrue(testObject.getSignsAmount()==testSignsAmount);
    }

}
