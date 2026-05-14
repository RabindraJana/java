public class SetIthBit {
    public static void main(String[] args) {
        int n=10,i=2;
        int bitMask = 1<<i;
        //int newNumber = n | bitMask;
        System.out.println(n | bitMask);
    }
}
