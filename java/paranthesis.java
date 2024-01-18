import java.util.Stack;

public class paranthesis {

    public static boolean checkparanthesis(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch =='('|| ch =='{' || ch =='['){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && ch==')') || (s.peek()=='{' && ch=='}') || (s.peek()=='[' && ch==']')){
                    s.pop();
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }


    }
    public static void main(String[]arg){
        String str="[{({})}]";
        System.out.println(s.checkparanthesis(str));
    }
}
