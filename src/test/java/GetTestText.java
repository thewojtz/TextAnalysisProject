package test.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GetTestText {

    //private static final String testAddress = "C:\\Users\\THINKPADWOJTAS\\IdeaProjects\\TextAnalysisProject\\testFile.txt";

    static public String getTestText(String address) {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(address)))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null)
            {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }
}
