public class findoutthesortestpath {
    public static int getsortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dirc=path.charAt(i);
            if(dirc=='W'){
                x--;
            }
            else if(dirc=='E'){
                x++;
            }
            else if(dirc=='S'){
                y--;

            }
            else {
                y++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        getsortestpath(path);
    }
    
}
