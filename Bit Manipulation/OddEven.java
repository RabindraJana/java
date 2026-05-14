public class OddEven {
    public static void main(String[] args) {
        int n =3;
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}