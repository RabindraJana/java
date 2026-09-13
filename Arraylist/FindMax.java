import java.util.ArrayList;

public class FindMax {
    public static int findMaximum(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is empty or null");
        }

        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(45);
        numbers.add(7);
        numbers.add(89);
        numbers.add(34);

        System.out.println("Maximum value: " + findMaximum(numbers));
    }
}
