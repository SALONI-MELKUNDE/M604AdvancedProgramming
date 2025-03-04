package lecture6;

public class MultithrededTask {

    private boolean isOddTurn = true;


    public synchronized void printOdd(int number) throws InterruptedException {
        while (!isOddTurn) {
            wait();
        }
        System.out.println("Odd Thread: " + number);
        isOddTurn = false;
        notify();
    }

    public synchronized void printEven(int number) throws InterruptedException {
        while (isOddTurn) {
            wait();
        }
        System.out.println("Even Thread: " + number);
        isOddTurn = true;
    }

    public static void main(String[] args) {
        MultithrededTask printer = new MultithrededTask();


        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 5; i += 2) {
                try {
                    printer.printOdd(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });




        oddThread.start();

    }
}

