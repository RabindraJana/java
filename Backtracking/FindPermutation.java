//Find & Print all permutation of a string 
public class FindPermutation {
    public static void main(String[] args) {
        String str = "abc";
        permute(str.toCharArray(), 0);
    }

    public static void permute(char[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(arr, index + 1);
            swap(arr, index, i);
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
