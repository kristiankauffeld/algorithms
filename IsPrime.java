public class IsPrime {
    public static void isPrime(int n) {
        boolean isPrime = true;

        // loop through the numbers from 2 to n-1
        for (int i = 2; i < n; i++) {
            // if n is divisible by i, then it is not a prime number
            if (n % i == 0) {
                System.out.println(n + " is not a prime");
                isPrime = false;
                break;
            }
        }
        // if isPrime is still true, then the loop must have completed without finding any factors of n,
        // so n must be a prime number
        if (isPrime) {
            System.out.println(n + " is a prime!");
        }
    }

    public static void main(String[] args) {
        isPrime(5);
        isPrime(9);
        isPrime(7);
        isPrime(12);
    }
}
