package lecture2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main execution started.");

        // Call other classes' methods
        sorting.sortNumbers();
        SortListExample.sortList();
        storing1Mnoinlist.storeNumbers();
        swaptwono.swapTwoNumbers();
        XORswaptwono.swapUsingXOR();

        System.out.println("Main execution completed.");
    }
}

