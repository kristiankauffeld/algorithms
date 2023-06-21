public class Main {

  //Since Java doesn't support default parameters
  //this method is used for creating default parameters so that start=0 and end=arr.length-1.
  //Then when the method is called it is not necessary to specify the start and end.
    public static int bsRecursive(int[] arr, int target) {
        return bsRecursive(arr, target, 0, arr.length - 1);
    }
    
    private static int bsRecursive(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return bsRecursive(arr, target, mid + 1, end);
        }

        return bsRecursive(arr, target, start, mid - 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 9, 11, 18, 20, 21, 24, 30};
        System.out.println(bsRecursive(arr, 30));
    }
}
