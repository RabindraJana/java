import java.util.*;
public class Traped {
    public static void trapping(int height[]){
        int mina;
        int leftmax[]=new int[height.length];
        int righttmax[]=new int[height.length];
        int trapedwater;

        for(int i=0;i<height.length;i++){
            if (height[i]>height[i+1]) {
                leftmax[i]=i;
            }
        }
        for(int i=height.length-1;i>=0;i--){
            if (height[i]>height[i+1]) {
                righttmax[i]=i;
                }
            }

            mina=Math.min(leftmax[i], righttmax[i]);
        trapedwater+=(mina-height[i]);
        }
        System.out.println(trapedwater);
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        trapping(height);
    }
}