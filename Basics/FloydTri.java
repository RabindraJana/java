public class FloydTri {
    public static void flowtri(int n){
        int con=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(con+" ");
                con++;
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        flowtri(6);
    }
}
