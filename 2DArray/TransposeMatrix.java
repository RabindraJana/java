public class TransposeMatrix {
    public static void main(String[] args) {
        int [][] array= {
            {1,2,3},
            {4,5,6}
        };
        
        int [][] transpose= new int[array[0].length][array.length];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                transpose[j][i]=array[i][j];
            }
        }
        
        System.out.println("Original matrix:");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Transposed matrix:");
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
