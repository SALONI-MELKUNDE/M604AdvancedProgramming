package lecture2;

public class XORswaptwono {
    public static void swapUsingXOR() {
        int a = 10, b = 20;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After XOR swap - a: " + a + ", b: " + b);
    }

}

