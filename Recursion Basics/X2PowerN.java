//Print x to the power of n
public class X2PowerN {
    public static void main(String[] args) {
        int x = 5; // Base
        int n = 2; // Exponent
        System.out.println(x + " to the power of " + n + " is: " + power(x, n));
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
}
