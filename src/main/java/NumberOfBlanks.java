package main.java;

public class NumberOfBlanks {


    int numberOfBlanks;

    public NumberOfBlanks(String text){
        this. numberOfBlanks = calculateNumberOfBlanks(text);
    }

    public int getNumberOfBlanks() {
        return numberOfBlanks;
    }

    private int calculateNumberOfBlanks(String text){
        int amount = 0;
        char [] signsTab = text.toCharArray();
        for (char sign:signsTab) {
            if(Character.isWhitespace(sign))amount++; //rules created using ASCII table alphabet
        }
        return amount;
    }
    //blanks table/iterator
}
