package main.java;

import java.util.HashMap;
import java.util.Map;


public class TopTenWords {

    Map<String,Integer> topTenWordsMap = new HashMap<String, Integer>();

    public TopTenWords(String address) {
        this.topTenWordsMap = getTopTenWordsStatistic(address);
    }

    public Map<String, Integer> getTopTenWordsMap() {
        return topTenWordsMap;
    }

    private Map<String,Integer> getTopTenWordsStatistic(String text) {

        Map<String,Integer> topTenWords = new HashMap<String, Integer>();

        String[] words = text.split("\\W+");

        for (String word:words) {
            if(word.length()>5){
                if (topTenWords.containsKey(word)) topTenWords.put(word, (topTenWords.get(word) + 1));
                else
                    topTenWords.put(word, 1);
                }
        }
        return topTenWords;
    }

    public void showMap(Map map){
        map.forEach((k,v) -> System.out.println(k + ":" + v));
    }

    //words map
}
