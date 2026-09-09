//Backtracking on arrays
public class BackTracking {
    public static void main(String[] args) {
        int[] arr=new int[5];
        backtrack(arr,0,1);
        printArr(arr);
    }
    public static void backtrack(int[] arr, int i,int value){
        if(i==arr.length){
            printArr(arr);
            return;
        }
        arr[i]=value;
        backtrack(arr,i+1,value+1);
        arr[i]=arr[i]-2;
    }
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}