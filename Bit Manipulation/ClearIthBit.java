public class ClearIthBit {
    public static void main(String[] args) {
        int n=10,i=1;
        int bitMask = ~(1<<i);
        //int newNumber = n & bitMask;
        System.out.println(n & bitMask);
    }
}