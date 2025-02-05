package lecture2;
import java.util.Arrays;

public class sorting {
    public static void sortNumbers() {
        int[] numbers = {5, 2, 8, 1, 3};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}


