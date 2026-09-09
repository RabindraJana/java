//find number of ways to reach from 0,0 to n-1,m-1 in a grid of n*m. allowed moves are right and down
public class GridWaya {
    public static void main(String[] args) {
        int n = 3; // number of rows
        int m = 3; // number of columns
        System.out.println("Number of ways to reach from (0,0) to (" + (n-1) + "," + (m-1) + "): " + countWays(n, m));
    }

    public static int countWays(int n, int m) {
        if (n == 1 || m == 1) {
            return 1;
        }
        return countWays(n - 1, m) + countWays(n, m - 1);
    }
}