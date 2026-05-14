public class AtoZUpperToLower {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            char lowerCase = (char)(ch | ' ');
            System.out.print(lowerCase);
        }
    }
}
