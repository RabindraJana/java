public class BinarySearch {
    public static int Bin(int number[],int key){
        int start =0,end=number.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (number[mid]==key) {
                return mid;
            }
            if (number[mid]<key) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[]={2,3,4,56,78,9,12,34};
        int key= 4;

        System.out.println(Bin(number, key));
    }

}
