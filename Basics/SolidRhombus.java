public class SolidRhombus {
    public static void solid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solid(6);
    }
}
