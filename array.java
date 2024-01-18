public class array {
    public static void update(int mark[]){
        for(int i=0;i<mark.length;i++){
            mark[i]=mark[i]+1;
        }

    }
    public static void main(String[] args) {
        int mark[]={12,34,56};
        update(mark);
        // printing value
        for(int i=0;i<mark.length;i++){
            System.out.println(mark[i]+" ");
        }
        System.out.println();
    }
    
}
