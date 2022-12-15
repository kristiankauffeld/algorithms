import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 10, -3, -10, 1, 100, 99};

        int[] sortedArray = bubbleSort(arr);
        
        //unsorted array remains unsorted because bubbleSort() returns resultArray
        System.out.println(Arrays.toString(arr));

        // Print the sorted array
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] bubbleSort(int[] arr) {
        int[] resultArray = Arrays.copyOf(arr, arr.length);

        for (int outerIndex = 0; outerIndex < resultArray.length; outerIndex++) {
            // Using helper variable
            int outerElement = resultArray[outerIndex];

            for (int innerIndex = outerIndex + 1; innerIndex < resultArray.length; innerIndex++) {
                // Using helper variable
                int innerElement = resultArray[innerIndex];

                if (outerElement > innerElement) {
                    resultArray[outerIndex] = innerElement;
                    resultArray[innerIndex] = outerElement;

                    // Update the helper variables
                    outerElement = resultArray[outerIndex];
                    innerElement = resultArray[innerIndex];
                }
            }
        }
        return resultArray;
    }

    //bubble sort without helper variables
    public static int[] bubbleSort2(int[] arr) {
        for (int outerIndex = 0; outerIndex < arr.length; outerIndex++) {
            for (int innerIndex = outerIndex + 1; innerIndex < arr.length; innerIndex++) {
                if (arr[outerIndex] > arr[innerIndex]) {
                    // The 'temp' variable is needed in order to perform the swap
                    int temp = arr[outerIndex];
                    arr[outerIndex] = arr[innerIndex];
                    arr[innerIndex] = temp;
                }
            }
        }
        return arr;
    }
}