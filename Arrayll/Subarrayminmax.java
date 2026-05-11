import java.util.*;
public class Subarrayminmax {
    public static void MixMin(int number[]){
        int maxsum= Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        for (int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=number[k];
                }
                if (sum>maxsum) {
                    maxsum=sum;
                }
                if (sum<minsum) {
                    minsum=sum;
                }
            }
        }
        System.out.println("MaxSum is "+maxsum);
        System.out.println("MinSum is "+minsum);
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        MixMin(number);
    }
}