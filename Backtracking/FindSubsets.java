//find & print all the subsets of a given string using backtracking
public class FindSubsets {
    public static void main(String[] args) {
        String str="abc";
        findSubsets(str,"",0);
    }
    public static void findSubsets(String str,String curr,int i){
        if(i==str.length()){
            System.out.println(curr);
            return;
        }
        findSubsets(str,curr,i+1);
        findSubsets(str,curr+str.charAt(i),i+1);
    }
}
