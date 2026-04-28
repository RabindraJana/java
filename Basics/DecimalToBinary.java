import java.util.*;
public class DecimalToBinary {
    public static void DecToBin(int n){
        int bin=0;
        int pow=0;
        int num=n;
        while (n>0) {
            int rem = n%2;
            bin = bin + rem * (int)Math.pow(10, pow);
            pow++;
            n=n/2;
        }
        System.out.println(bin);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        DecToBin(n);
    }
}
