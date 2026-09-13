import java.util.ArrayList;
import java.util.Collections;

public class PairSum2Poin {
    public static void pairSumTwoPointer(ArrayList<Integer> arr, int target) {
        Collections.sort(arr);

        int left = 0;
        int right = arr.size() - 1;

        while (left < right) {
            int sum = arr.get(left) + arr.get(right);

            if (sum == target) {
                System.out.println("Pair found: (" + arr.get(left) + ", " + arr.get(right) + ")");
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);

        int target = 6;

        System.out.println("Pairs with sum " + target + ":");
        pairSumTwoPointer(numbers, target);
    }
}
