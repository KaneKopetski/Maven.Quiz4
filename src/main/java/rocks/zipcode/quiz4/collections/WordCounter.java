package rocks.zipcode.quiz4.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordCounter {
    Map<String, Integer> wordCountMap;

    public WordCounter(String... strings) {
        wordCountMap = new LinkedHashMap<>();
        for(String string : strings) {
            if(wordCountMap.containsKey(string)){
                wordCountMap.put(string, wordCountMap.get(string) + 1);
            } else {
                wordCountMap.put(string, 1);
            }
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return wordCountMap;
    }
}
