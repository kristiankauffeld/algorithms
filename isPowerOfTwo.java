public class isPowerOfTwo {

    public static boolean isPowerOfTwo(double n) {
        if (n < 1) {
            return false;
        }

        double dividedNumber = n;

        while (dividedNumber != 1) {
            if (dividedNumber % 2 != 0) {
                return false;
            }
            dividedNumber = dividedNumber / 2;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(5));
        System.out.println(isPowerOfTwo(Math.pow(2, 50)));
    }

    //Best case: number = 13 => O(1)
    //Average case: O(log n)
    //Worst case: Math.pow(2, 50) => O(log n)
}
