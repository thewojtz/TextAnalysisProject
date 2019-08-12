package src.test.java;

import src.main.java.DAO;
import org.junit.Test;
import src.test.java.GetTestText;

import static org.junit.Assert.*;


public class DAOTest {

    private static final String testAddress = "./src/test/resources/testTexts/testFile.txt";

    @Test
    public void contentVerificationTest(){
        DAO dataAccessObject = new DAO(testAddress);
        assertTrue(dataAccessObject.getContent().equals(GetTestText.getTestText(testAddress)));
    }

}
