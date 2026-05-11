import java.util.*;
public class Prefixminmax {
    public static void prefix(int number[]){
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int prefix[]=new int[number.length];

        prefix[0]=number[0];
        for(int i =1; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                cursum=(start == 0) ? prefix[end]:prefix[end]-prefix[start-1];
                if (maxsum<cursum) {
                    maxsum=cursum;
                }
                if (minsum>cursum) {
                    minsum=cursum;
                }
            }
        }
        System.out.println(maxsum);
        System.out.println(minsum);
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        prefix(number);
    }
}
