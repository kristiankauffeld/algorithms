import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> fibonacci(int n) {
        List<Integer> fibonacciSequence = new ArrayList<>();
        fibonacciSequence.add(0);
        fibonacciSequence.add(1);

        for (int i = 2; i <= n; i++) {
            fibonacciSequence.add(fibonacciSequence.get(i - 1) + fibonacciSequence.get(i - 2));
        }
        return fibonacciSequence;
    }

    public static void main(String[] args) {
        List<Integer> result = fibonacci(5);
        System.out.println(result);
    }
}
