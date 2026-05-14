public class UpdateIthBit {
    public static void main(String[] args) {
        int n = 10, i = 2, newBit = 1;
        if (newBit == 0) {
            int bitMask = ~(1 << i);
            System.out.println(n & bitMask);
        } else {
            int bitMask = 1 << i;
            System.out.println(n | bitMask);
        }
    }
}
