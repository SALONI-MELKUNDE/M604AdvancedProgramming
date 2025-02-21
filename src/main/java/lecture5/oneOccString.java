package lecture5;

public class oneOccString {
    public static void main(String[] args) {
        String haystack = "sambutsam";
        String needle = "sam";
        int occurrenceIndex = findFirstOccurrenceKMP(haystack, needle);

        if (occurrenceIndex == -1) {
            System.out.println(-1);
        } else {
            int endIndex = occurrenceIndex + needle.length() - 1;
            System.out.println("Start: " + occurrenceIndex + ", End: " + endIndex);
        }
    }

    public static int findFirstOccurrenceKMP(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) {
            return -1;
        }
        if (haystack == null || haystack.isEmpty()) {
            return -1;
        }

        int[] prefixTable = buildPrefixTable(needle);
        int i = 0;
        int j = 0;

        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == needle.length()) {

                    return i - j;
                }
            } else {

                if (j > 0) {

                    j = prefixTable[j - 1];
                } else {

                    i++;
                }
            }
        }

        return -1;
    }

    private static int[] buildPrefixTable(String pattern) {
        int[] prefixTable = new int[pattern.length()];
        int len = 0;
        prefixTable[0] = 0;
        int i = 1;

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


