import java.util.*;
public class Kadans {
    public static void katana(int number[]){
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int cs=0;
        for(int i=0;i<number.length;i++){
            cs+=number[i];
            if (cs<0) {
                cs=0;
            }
            maxsum=Math.max(cs, maxsum);
            minsum=Math.min(cs, minsum);
        }
        System.out.println(maxsum);
        System.out.println(minsum);
    }
    public static void main(String[] args) {
        int number[]={-2,-3,4,-1,-2,1,5,-3};
        katana(number);
    }
}
