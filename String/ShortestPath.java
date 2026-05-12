public class ShortestPath {
    public static float getshpa( String path){
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            switch (direction) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
        }
        return (float) Math.sqrt(x * x + y * y);
    }
    public static void main(String[] args) {
        String path;
        path = "WNEENESENNN";
        System.out.println(getshpa(path));
    }
}