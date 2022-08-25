import java.util.Arrays;

public class FibonacciNumbers {
    public static void main(String[] args) {

        int[] fibonacciNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(fibonacciNumbers));
        int x1 = 0;
        int x2 = 1;
        for (int i = 0; i < fibonacciNumbers.length; i++) {
            if (fibonacciNumbers[i] < 2) {
                System.out.print(fibonacciNumbers[i] + ", ");
            } else {
                for (int j = 2; j < fibonacciNumbers.length; j++) {
                    int sum = x1 + x2;
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
