package main.java;

public class NumberOfNonAlphabetSigns {

    public int getNumberOfNonAlphabetSigns() {
        return numberOfNonAlphabetSigns;
    }

    int numberOfNonAlphabetSigns;

    public NumberOfNonAlphabetSigns(String text) {
        this.numberOfNonAlphabetSigns = calculateNonAlphabetSigns(text);
    }

    private int calculateNonAlphabetSigns(String text){
        int amount = 0;
        char [] signsTab = text.toCharArray();
        int ascii;
        for (char sign:signsTab) {
            ascii = (int)sign;
            if((ascii>=97 && ascii <= 122) || (ascii>=65 && ascii <=90)) continue; //rules created using ASCII table alphabet
                else amount++;
        }
        return amount;
    }
}
