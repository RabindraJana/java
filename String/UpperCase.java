public class UpperCase {
    // Method to convert the entire string to uppercase @GPT
    public static void fulltouppercase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char)(ch - ('a' - 'A')));
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
    // Method to convert the first letter of the string to uppercase @GPT
    public static void firstlettertouppercase(String str) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (capitalizeNext && ch >= 'a' && ch <= 'z') {
                sb.append((char)(ch - ('a' - 'A')));
                capitalizeNext = false;
            } else {
                sb.append(ch);
                if (ch == ' ') {
                    capitalizeNext = true;
                }
            }
        }
        System.out.println(sb.toString());
    }
    // Method to convert the first letter of each word to uppercase @Me
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)==' '&& i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }else{
            sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main (String[] args){
        String str = "hello, i am a java developer";
        fulltouppercase(str);
        firstlettertouppercase(str);
        System.out.println(toUpperCase(str));
    }
}
