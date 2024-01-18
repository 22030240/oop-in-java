public class removeduplicatewithoutrecursion {
    public static void removedup(String str,int ind,StringBuilder newsStr ,boolean map[]) {
     char curstr=str.charAt(ind);
       
            if(map[curstr-'a']==true){
                ind++;
            }
           else if(ind==str.length()){
                System.out.println(newsStr);
                return;
            }
            else{
                map[curstr-'a']=true;
                ind++;
                newsStr.append(curstr);
             }
             
             
        
        
    }
    public static void main(String[] args) {
        String str="aaaahhhaaahhhaaklkkhhvmbmbmnnjjnj";
        removedup(str, 0, new StringBuilder(""),new boolean[26]);
        
    }
    
}
