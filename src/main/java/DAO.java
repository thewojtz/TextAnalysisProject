package src.main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DAO {


    private String content;

    public DAO() {

    }

    public DAO(String address) {
        this.content = getDataFile(address);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static String getDataFile(String address){
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
