public class RotatedPiramid {
    public static void halfpiramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n - i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        halfpiramid(5);
    }
}