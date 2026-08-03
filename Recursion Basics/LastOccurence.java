public class LastOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5};
        int target = 2;
        int lastIndex = lastOccurence(arr, target, arr.length - 1);
        System.out.println("Last occurrence of " + target + " is at index: " + lastIndex);
    }

    public static int lastOccurence(int[] arr, int target, int index) {
        if (index < 0) {
            return -1; // Target not found
        }
        if (arr[index] == target) {
            return index; // Found the last occurrence
        }
        return lastOccurence(arr, target, index - 1); // Search in the left part
    }
}
