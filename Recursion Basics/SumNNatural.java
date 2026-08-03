public class SumNNatural {
    public static void main(String[] args) {
        int n = 5; // Example input
        int sum = sumNNatural(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }

    public static int sumNNatural(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNNatural(n - 1);
    }
}
