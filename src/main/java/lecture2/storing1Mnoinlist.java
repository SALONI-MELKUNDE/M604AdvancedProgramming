package lecture2;
import java.util.ArrayList;
import java.util.List;

public class storing1Mnoinlist {
    public static void storeNumbers() {
        List<Integer> numbers = new ArrayList<>(1_000_000);

        for (int i = 1; i <= 1_000_000; i++) {
            numbers.add(i);
        }

        System.out.println("List size: " + numbers.size());
        System.out.println("First 10 numbers: " + numbers.subList(0, 10));
    }

}

