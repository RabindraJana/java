public class Pairs {
    public static void pai(int number[]){
        int tp=0;
        
        for(int i=0; i<number.length; i++){
            
            int cur= number[i];

            
            for(int j=i+1; j< number.length; j++){
                

                System.out.print("("+cur+","+number[j]+")");
                tp++;
            }
            System.out.println(); 
        }
        System.out.println(tp);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        pai(number);
    }
}