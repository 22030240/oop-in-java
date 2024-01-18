public class subset {
    public static void print_subset(String str , String ans , int i) {
      //base
      if(i==str.length()){
        if(ans.length() == 0){
            System.out.println("@");
        }
        else{
            System.out.print(ans+" ");
        }
        return;
    } 
    //recursion
    //yes change
    print_subset(str, ans+str.charAt(i), i+1);
    //No change
    print_subset(str, ans, i+1); 
    }
    public static void main(String[] args) {
        String str="abcd";
        print_subset(str,"",0);
    }
    
}
