package lecture3;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        StringCharCountMap charCounter = new StringCharCountMap();

        String input = "This website is awesome.";


        Map<Character, Integer> frequencyMap = charCounter.getCharacterFrequency(input);


        System.out.println("Character Frequency Count:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

