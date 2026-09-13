import java.util.ArrayList;

public class Swap2Num {
    public static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Before swap: " + list);
        swap(list, 1, 3);
        System.out.println("After swap: " + list);
    }
}
