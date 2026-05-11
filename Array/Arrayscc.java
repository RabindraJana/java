import java.util.*;
public class Arrayscc {
    // public static void update(int marks[]){
    //     for(int i= 0; i< marks.length;i++){
    //         marks[i]= marks[i]+1;
    //     }

    public static int linearsearch(int number[], int key){
            for(int i=0;i<number.length; i++){
                if (number[i]==key) {
                    return i;
                }        
            }
        return -1;
    }
    public static void main(String[] args) {
        // int marks[]={97,98,99};
        // update(marks);
        // for(int i=0;i<marks.length;i++){
        //     System.out.println(marks[i]);
    //     }
    // }

    int number[]={2,4,6,8,10,12,14,16};
    int key=10;
    int index=linearsearch(number,key);

    if (index==-1) {
        System.out.println("not found");
    }
    else{
        System.out.println("key is at index " + index);
    }
    }
}