public class convertuppertolower {
    public static void main(String[] args) {
        System.out.println("Conver big alphabet to small alphabet:");
        for(char i='A';i<='Z';i++){
            System.out.print((char)(i | ' '));
        }
    }
    
}
