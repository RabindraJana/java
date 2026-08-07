public class MergeSort {
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // Base case: array is already sorted
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Copy data to left and right subarrays
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // Recursively sort the subarrays
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted subarrays
        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0; // Index for left subarray
        int j = 0; // Index for right subarray
        int k = 0; // Index for merged array

        // Merge the two subarrays into the original array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy any remaining elements from the left subarray
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Copy any remaining elements from the right subarray
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Before: " + java.util.Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("After:  " + java.util.Arrays.toString(arr));
    }
}