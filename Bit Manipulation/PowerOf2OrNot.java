public class PowerOf2OrNot {
    public static void main(String[] args) {
        int n = 13;
        if ((n & (n - 1)) == 0) {
        System.out.println("Power of 2");
        } else {
        System.out.println("Not a Power of 2");
        }
    }
}
