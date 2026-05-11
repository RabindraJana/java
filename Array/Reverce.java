public class Reverce {
    public static void rev(int number[]){
        int start = 0, end=number.length-1;

        while (start<end) {
            int temp=number[end];
            number[end]=number[start];
            number[start]= temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,78,};
        rev(number);

        for(int i = 0; i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
}
