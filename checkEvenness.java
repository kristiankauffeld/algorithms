public class checkEvenness {
    /**
     * This Java file contains a function that checks if a number is even or not.
     */

    public static boolean checkEvenness(int n){
        // define a named constant for the divisor (2)
        final int DIVISOR = 2;

        boolean isEven = (n % DIVISOR == 0);
        return isEven;
    }
  
    public static void main(String[] args) {

        // return the result from the function and print it outside of the function
        boolean isEven = checkEvenness(5);
        System.out.println(isEven);

        isEven = checkEvenness(6);
        System.out.println(isEven);

    }
}
