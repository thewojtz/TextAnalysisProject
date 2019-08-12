package src.main.java;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.isUpperCase;

public class AlphabetStats {

    Map<Character,Integer> alphabetStatsMap = new HashMap<Character,Integer>();

    public  AlphabetStats(){
    }

    public  AlphabetStats(String address){
        this.alphabetStatsMap = getAlphabetStats(address);
    }

    public Map<Character, Integer> getAlphabetStatsMap() {
        return alphabetStatsMap;
    }

    public Map <Character, Integer> getAlphabetStats(String text){

        Map<Character,Integer> statsMap = new HashMap<Character,Integer>();

        Character charSign = '1';
        int ascii;
        char [] signsTab = text.toCharArray();
        for (char sign:signsTab) {
            ascii = (int)sign;
            if((ascii>=97 && ascii <= 122) || (ascii>=65 && ascii <=90)) {
                charSign = sign;
                if (isUpperCase(sign))
                    charSign.toLowerCase(sign);
                else {
                    if (statsMap.containsKey(charSign)) statsMap.put(charSign, (statsMap.get(charSign) + 1));
                    else
                        statsMap.put(charSign, 1);
                }
            }
        }

        return statsMap;
    }
    
    public void showMap(){
        this.alphabetStatsMap.forEach((k,v) -> System.out.println(k + ":" + v));
    }
    public void showMap(Map map){
        map.forEach((k,v) -> System.out.println(k + ":" + v));
    }
    

}
