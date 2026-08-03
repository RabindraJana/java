public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 6};
        int target = 3;
        int index = firstOccurrence(arr, target, 0);
        System.out.println("First occurrence of " + target + " is at index: " + index);
    }

    public static int firstOccurrence(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return -1; // Target not found
        }
        if (arr[index] == target) {
            return index; // Target found
        }
        return firstOccurrence(arr, target, index + 1); // Recur for next index
    }
}