package lecture4;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int originalNum = num;                     //storing the original number in a variable
        int sum = 0;
        int numOfDigits = String.valueOf(num).length();

        while (num > 0) {                        //logic to check the number
            int digit = num % 10;
            sum += Math.pow(digit, numOfDigits);
            num /= 10;
        }

        return sum == originalNum;  //returning the result

    }
}

