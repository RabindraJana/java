public class LinnearSearch {
    public static int lin(String menu[] , String ket ){
        for(int i=0;i<menu.length;i++){
        if(menu[i].equals(ket)){
            return i;
        }
    }
        return -1;
    }
    public static void main(String[] args) {
        String menu[]={"dosa","alu-parata","chole-bhatura","kachuri","edli","bara"};
        String ket="kachuri";
        int index=lin(menu,ket);

        if (index==-1) {
            System.out.println("not found");
        }
        else{
            System.out.println(index);
        }
    }
}
