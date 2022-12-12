public class findMin {
    /**
     * Write a function that takes an array of numbers as input, and returns the
     * minimum value in the array.
     *
     * Example:
     * int[] numbers = {5, 3, 7, 2, 9, 1};
     * int min = findMin(numbers);
     * // min == 1
     */
    public static void findMin(int[] arr) {
        int minValue = arr[0];

        // iterate through the array starting from the second element (index 1)
        for (int i = 1; i < arr.length; i++) {

            // if the current element is less than the current minimum value, update minValue
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println(minValue);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 2, 9, 1};
        findMin(numbers);
    }
}
