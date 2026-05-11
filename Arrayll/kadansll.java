import java.util.*;
public class kadansll {
    public static void katanal(int number[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i = 0; i<number.length;i++){
            cs+=number[i];
            if (cs<0) {
                cs=0;
            }
            ms=Math.max(ms, cs);
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int number[]={-2,3,-1,2};
        katanal(number);
    }
}
