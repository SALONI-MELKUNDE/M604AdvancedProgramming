package lecture5;

import java.util.ArrayList;
import java.util.List;

public class stringOcc {
    public static void main(String[] args) {
        String haystack1 = "sambutsam";
        String needle1 = "sam";
        List<Integer> occurrences = findAllOccurrencesKMP(haystack1, needle1);

        if (occurrences.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int startIndex : occurrences) {
                int endIndex = startIndex + needle1.length() - 1;
                System.out.println("Start: " + startIndex + ", End: " + endIndex);
            }
        }

    }

    public static List<Integer> findAllOccurrencesKMP(String haystack, String needle) {
        List<Integer> occurrences = new ArrayList<>();

        if (needle == null || needle.isEmpty()) {
            return occurrences;
        }
        if (haystack == null || haystack.isEmpty()) {
            return occurrences;
        }

        int[] prefixTable = buildPrefixTable(needle);
        int i = 0;
        int j = 0;

        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;

                if (j == needle.length()) {
                    occurrences.add(i - j);

                    j = prefixTable[j - 1];
                }
            } else {

                if (j > 0) {
                    j = prefixTable[j - 1];
                } else {
                    i++;
                }
            }
        }
        return occurrences;
    }

    private static int[] buildPrefixTable(String pattern) {
        int[] prefixTable = new int[pattern.length()];
        int len = 0;
        int i = 1;

        prefixTable[0] = 0;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                prefixTable[i] = len;
                i++;
            } else {
                if (len > 0) {
                    len = prefixTable[len - 1];
                } else {
                    prefixTable[i] = 0;
                    i++;
                }
            }
        }
        return prefixTable;
    }
}
