import java.util.*;
public class Smallest {
    public static int smal(int number[]){
        int smallest= Integer.MAX_VALUE;
        for(int i =0; i< number.length; i++){
            if (number[i]< smallest) {
                smallest=number[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,6,8,93,25,8,};
        smal(number);
        System.out.println(smal(number));
    }
}