public class Main {
    public static int jumpSearch(int[] arr, int target) {
        int jumpSize = (int) Math.sqrt(arr.length);
        int blockStart = 0;
        int blockEnd = jumpSize;

        while (blockStart < arr.length && arr[blockEnd - 1] < target) {
            blockStart = blockEnd;
            blockEnd += jumpSize;

            if (blockEnd > arr.length) {
                blockEnd = arr.length;
            }
        }

        for (int i = blockStart; i < blockEnd; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 9, 11, 18, 20, 21, 24, 30};
        System.out.println(jumpSearch(arr, 24));
        System.out.println(jumpSearch(arr, 5));
        System.out.println(jumpSearch(arr, 0));
        System.out.println(jumpSearch(arr, 31));
    }
}
