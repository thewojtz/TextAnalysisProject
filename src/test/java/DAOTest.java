package test.java;

import main.java.DAO;
import org.junit.Test;

import static org.junit.Assert.*;


public class DAOTest {

    private static final String testAddress = "C:\\Users\\THINKPADWOJTAS\\IdeaProjects\\TextAnalysisProject\\testFile.txt";
    private static final String testMessage = "It is a truth universally acknowledged, that a single man in possession\n" +
            "of a good fortune, must be in want of a wife.\n" +
            "\n" +
            "However little known the feelings or views of such a man may be on his\n" +
            "first entering a neighbourhood, this truth is so well fixed in the minds\n" +
            "of the surrounding families, that he is considered the rightful property\n" +
            "of some one or other of their daughters.\n" +
            "\n" +
            "“My dear Mr. Bennet,” said his lady to him one day, “have you heard that\n" +
            "Netherfield Park is let at last?”\n" +
            "\n" +
            "Mr. Bennet replied that he had not.\n" +
            "\n" +
            "“But it is,” returned she; “for Mrs. Long has just been here, and she\n" +
            "told me all about it.”\n" +
            "\n" +
            "Mr. Bennet made no answer.\n" +
            "\n" +
            "“Do you not want to know who has taken it?” cried his wife impatiently.\n" +
            "\n" +
            "“_You_ want to tell me, and I have no objection to hearing it.”\n" +
            "\n" +
            "This was invitation enough.\n" +
            "\n" +
            "“Why, my dear, you must know, Mrs. Long says that Netherfield is taken\n" +
            "by a young man of large fortune from the north of England; that he came\n" +
            "down on Monday in a chaise and four to see the place, and was so much\n" +
            "delighted with it, that he agreed with Mr. Morris immediately; that he\n" +
            "is to take possession before Michaelmas, and some of his servants are to\n" +
            "be in the house by the end of next week.”\n";

    @Test
    public void contentVerificationTest(){
        DAO dataAccessObject = new DAO(testAddress);
        assertTrue(dataAccessObject.getContent().equals(testMessage));
    }

}
