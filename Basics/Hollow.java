public class Hollow {
    public static void Hollows(int rows,int cols){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                if (i==1 || i==rows || j==1 || j==cols) {
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
            
    }
    public static void main(String[] args) {
        Hollows(10,7);
    }
}