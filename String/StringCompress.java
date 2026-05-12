public class StringCompress {
    public static void main(String[] args) {
        String str = "aaabbcccdde";
        System.out.println(compress(str));
        System.out.println(compressString(str));
    }

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        char currentChar = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                sb.append(currentChar);
                sb.append(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }

        sb.append(currentChar);
        sb.append(count);

        return sb.toString();
    }

    public static String compressString(String str) {
        String newStr = "";
        
        for(int i=0;i<str.length();i++){
            int count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count;
            }
        }
        return newStr;
    }
}


