package src.main.java;

public class NumberOfSentences {

    int numberOfSentences;


    public NumberOfSentences(String address) {
        this.numberOfSentences = getNumberOfSentencesInText(address);
    }


    public int getNumberOfSentences() {
        return numberOfSentences;
    }

    private int getNumberOfSentencesInText(String text) {
        int counter = text.split("[!?.]+").length;
        return counter - 1;
    }

}
