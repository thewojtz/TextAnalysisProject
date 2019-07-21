package test.java;

import main.java.DAO;
import org.junit.Test;

import static org.junit.Assert.*;
import static test.java.GetTestText.getTestText;


public class DAOTest {

    private static final String testAddress = "./src/testTexts/testFile.txt";

    @Test
    public void contentVerificationTest(){
        DAO dataAccessObject = new DAO(testAddress);
        assertTrue(dataAccessObject.getContent().equals(getTestText(testAddress)));
    }

}
