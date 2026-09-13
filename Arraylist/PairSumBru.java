import java.util.ArrayList;

public class PairSumBru {
    public static void pairSumBruteForce(ArrayList<Integer> arr, int target) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == target) {
                    System.out.println("Pair found: (" + arr.get(i) + ", " + arr.get(j) + ")");
                }
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
        pairSumBruteForce(numbers, target);
    }
}
