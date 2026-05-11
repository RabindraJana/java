import java.util.*;
public class Largest {
    public static int lar(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if (largest<number[i]) {
                largest=number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[]={3,7,8,9,10,32,67,89,12,36};
        lar(number);
        System.out.println(lar(number));
    }
}
