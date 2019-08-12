package src.main.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class TopTenWords {

    Map<String,Integer> topTenWordsMap = new HashMap<String, Integer>();

    public TopTenWords(String address) {
        this.topTenWordsMap = getTopTenWordsStatistic(address);
    }

    public Map<String, Integer> getTopTenWordsMap() {
        return topTenWordsMap;
    }

    public static Map<String, Integer> sortByValue(final Map<String, Integer> wordCounts) {
        return wordCounts.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
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

        final Map<String, Integer> sortedByCount = sortByValue(topTenWords);

        int count = 0;
        int max = 10;

        Map<String,Integer> resultMap = new HashMap<String, Integer>();

        for (Map.Entry<String,Integer> entry:sortedByCount.entrySet()) {
            if (count >= max) break;

            resultMap.put(entry.getKey(), entry.getValue());
            count++;
        }

        //showMap(resultMap);

        return resultMap;
    }

    public void showMap(Map map){
        map.forEach((k,v) -> System.out.println(k + ":" + v));
    }
    public void showMap(){
        this.topTenWordsMap.forEach((k,v) -> System.out.println(k + ":" + v));
    }
    //words map
}
