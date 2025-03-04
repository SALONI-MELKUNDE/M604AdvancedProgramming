package lecture6;

public class sumoftheList {
    public static void main(String[] args) {

        long startTime = System.nanoTime();



        long sum = 0;
        for (int i = 1; i <= 1_000_000; i++) {
            sum += i;
        }


        long endTime = System.nanoTime();



        long duration = endTime - startTime;




        System.out.println("Sum of numbers from 1 to 1,000,000: " + sum);
        System.out.println("Time taken (nanoseconds): " + duration);
        System.out.println("Time taken (milliseconds): " + (duration / 1_000_000.0));
    }
}


