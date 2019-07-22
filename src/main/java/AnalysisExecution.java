package main.java;

import test.java.GetTestText;

import static main.java.DAO.getDataFile;

public class AnalysisExecution {

    public static void main(String[] args) {

        String address = args[0];

        AlphabetStats alphabetStats = new AlphabetStats(getDataFile(address));
        System.out.println("Here is statistic of alphabet signs use:\n");
        alphabetStats.showMap();

        NumberOfBlanks numberOfBlanks = new NumberOfBlanks(getDataFile(address));
        System.out.println("Number of blanks in text:" + numberOfBlanks.getNumberOfBlanks()+"\n");

        NumberOfSigns numberOfSigns = new NumberOfSigns(getDataFile(address));
        System.out.println("Number of signs in text:" + numberOfSigns.getSignsAmount()+"\n");

        NumberOfNonAlphabetSigns numberOfNonAlphabetSigns = new NumberOfNonAlphabetSigns(getDataFile(address));
        System.out.println("Number of non alphabetic signs in text:" + numberOfNonAlphabetSigns.getNumberOfNonAlphabetSigns()+"\n");

        NumberOfSentences numberOfSentences = new NumberOfSentences(getDataFile(address));
        System.out.println("Number of sentences text:" + numberOfSentences.getNumberOfSentences() +"\n");

        TopTenWords topTenWords = new TopTenWords(getDataFile(address));
        System.out.println("List of Top 10 most used words:\n");
        topTenWords.showMap();
    }

}
