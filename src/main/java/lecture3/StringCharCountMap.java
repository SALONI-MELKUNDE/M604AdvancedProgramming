package lecture3;

import java.util.Map;
import java.util.TreeMap;

public class StringCharCountMap {


    public Map<Character, Integer> getCharacterFrequency(String str) {
        Map<Character, Integer> frequencyMap = new TreeMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }
        return frequencyMap;
    }
}


