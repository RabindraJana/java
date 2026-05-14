public class ClearLastIBit {
    public static void main(String[] args) {
        int n=15,i=2;
        int bitMask = ~0<<i;
        //int newNumber = n & bitMask;
        System.out.println(n & bitMask);
    }
}
