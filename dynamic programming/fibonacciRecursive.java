import java.util.HashMap;

public class Main {
    public static int fib(int n, HashMap<Integer, Integer> cache) {
        if (n < 2) {
            return n;
        }

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        int result = fib(n - 1, cache) + fib(n - 2, cache);
        cache.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> cache = new HashMap<>();
        System.out.println(fib(6, cache));
    }
}
