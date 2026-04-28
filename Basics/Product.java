public class Product {
    public static int Multiply(int a, int b) {
        int Prod = a*b;
        return Prod; 
    }
    public static void main(String[] args) {
        int Prod = Multiply(5,6);
        System.out.println(Prod);
    }
}
