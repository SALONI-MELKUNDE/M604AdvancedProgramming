package lecture2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListExample {
    public static void sortList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        Collections.sort(numbers);

        System.out.println("Sorted list: " + numbers);
    }
}

