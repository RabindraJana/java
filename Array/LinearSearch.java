public class LinearSearch {
    public static int llinearsearch(int number[],int key){
        for(int i=0; i<number.length; i++){
            if (number[i]==key) {
                return i;
            }
        }
        return -12;
    }

    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16,18};
        int key=14;
        int index= llinearsearch(number, key);

        if (index==-12) {
            System.out.println("not found");
        }
        else{
            System.out.println(index);
        }
    }
}