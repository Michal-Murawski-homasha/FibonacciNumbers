import java.math.BigInteger;
import java.util.Arrays;

public class FibonacciNumbers {
    public static void main(String[] args) {

        int[] fibonacciNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(Arrays.toString(fibonacciNumbers));
        BigInteger x1 = BigInteger.valueOf(0);
        BigInteger x2 = BigInteger.valueOf(1);
        for (int i = 0; i < fibonacciNumbers.length; i++) {
            if (fibonacciNumbers[i] < 2) {
                System.out.print(fibonacciNumbers[i] + ", ");
            } else {
                for (int j = 2; j < fibonacciNumbers.length; j++) {
                    BigInteger sum = x1.add(x2);
                    System.out.print(sum);
                    if (i < fibonacciNumbers.length - 1) {
                        System.out.print(", ");
                    }
                    x1 = x2;
                    x2 = sum;
                }
            }
        }
    }
}
