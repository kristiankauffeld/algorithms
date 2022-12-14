public class Main {
    public static int binarySearch(int[] sortedArr, int element) {
        int startIndex = 0;
        int endIndex = sortedArr.length - 1;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (element == sortedArr[middleIndex]) {
                return middleIndex;
            }

            if (sortedArr[middleIndex] < element) {
                startIndex = middleIndex + 1;
            } else {
                endIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 9, 13, 99, 100};

        int index = binarySearch(array, 99);
        System.out.println(index);

    }
}