import java.util.*;
public class Trappedwater {
    public static int water(int height[]) {
         
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }
        int righttmax[]=new int[height.length];
        righttmax[height.length-1]=height[height.length-1];
        for(int i = height.length-2;i>=0;i--){
            righttmax[i]=Math.max(height[i],righttmax[i+1]);
        }   
        int trappedwater=0; 
        for(int i=0;i<height.length;i++){
            int waterlev=Math.min(leftmax[i],righttmax[i]);
            trappedwater += (waterlev - height[i]);
        }   
        return trappedwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(water(height));

    }
}
