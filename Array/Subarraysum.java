import java.util.*;
public class Subarraysum {
    public static void araysum(int number[]){
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum += number[k];
                    System.out.print(number[k]+" ");
                }
                System.out.print(" ->"+sum);
                System.err.println();
            }
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        araysum(number);
    }
}
