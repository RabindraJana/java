import java.util.ArrayList;

public class PairSum2 {
	public static boolean pairSum(ArrayList<Integer> arr, int target) {
		int n = arr.size();

		if (n < 2) {
			return false;
		}

		int pivot = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr.get(i) > arr.get(i + 1)) {
				pivot = i;
				break;
			}
		}

		int left = (pivot + 1) % n;
		int right = pivot;

		while (left != right) {
			int sum = arr.get(left) + arr.get(right);

			if (sum == target) {
				return true;
			}

			if (sum < target) {
				left = (left + 1) % n;
			} else {
				right = (right - 1 + n) % n;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(11);
		numbers.add(15);
		numbers.add(6);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);

		int target = 16;
		System.out.println(pairSum(numbers, target));
	}
}   