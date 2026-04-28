import java.util.*;

public class BinaryToDecimal {
    public static void BinToDec(int n){
        int dec=0;
        int pow=0;
        int num=n;
        while (n>0) {
            int ld=n%10;
            dec=dec+ld*(int)Math.pow(2,pow);
            pow++;
            n=n/10;
        }
        System.out.println("Decimal of" + num + " = " + dec);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        BinToDec(n);
    }    
}
