import java.util.*;
public class InbuiltRev {
    public static void main(String[] args) {
        Integer arr[]={1,2,7,8,3};
        //Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
