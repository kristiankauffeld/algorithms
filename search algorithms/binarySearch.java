public class Main {
    public static int bsIterative(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 9, 11, 18, 20, 21, 24, 30}; //length is 10
        System.out.println(bsIterative(arr, 5));
    }
}
