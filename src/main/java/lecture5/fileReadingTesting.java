package lecture5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileReadingTesting {
    public static void main(String[] args) {

        // 1) Update this to your actual absolute path:
        //    e.g. C:\Users\Saloni\Downloads\Filetesting.txt
        String filePath = "C:\\Users\\Salon\\Downloads\\Filetesting.txt";

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        // Print out the path for clarity
        System.out.println("Looking for: " + filePath);

        // 2) Use the absolute path in FileReader
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
