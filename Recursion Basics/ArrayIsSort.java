public class ArrayIsSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example input
        boolean isSorted = isSorted(arr, 0);
        System.out.println("Array is sorted: " + isSorted);
    }

    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }
}
