package main.java;

public class NumberOfSigns {

    //iterator of sings
    int signsAmount;

    public NumberOfSigns() {

    }

    public int getSignsAmount() {
        return signsAmount;
    }

    public NumberOfSigns(String text){
        this.signsAmount = calculateSignsAmountFromText(text);
    }

    public int calculateSignsAmountFromText(String text){
        int amount = 0;
        char [] signsTab = text.toCharArray();
        for (char sign:signsTab) {
            if(sign!=' ' && sign!='\n') amount++;
        }
        return amount;
    }



}
