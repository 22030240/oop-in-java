public class removeduplicateusingrecursion {
    public static void removeduplicate(String str,int idx, StringBuilder newstr,boolean map[]) {
        //base case
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        //kaam
        char currencharecter=str.charAt(idx);
        if(map[currencharecter-'a']==true){
            //duplicate
            removeduplicate(str, idx+1, newstr, map);
        }
        else{
            map[currencharecter-'a']=true;
            removeduplicate(str, idx+1, newstr.append(currencharecter), map);
        }
    }
    public static void removedup(String str,int idx,StringBuilder newsStr,boolean map[]) {
        //base
        if(idx==str.length()){
            System.out.println(newsStr);
            return;
        }
        //kaam
        char curchar=str.charAt(idx);
        if(map[curchar-'a']==true){
            removedup(str, idx+1, newsStr, map);
        }
        else{
            map[curchar-'a']=true;
            removedup(str, idx+1, newsStr.append(curchar), map);
        }
        
    }
    public static void main(String[] args) {
       // String str="appnnacollage";
       // removeduplicate(str, 0, new StringBuilder(""), new boolean[26]);
String str="aaaaaaaabbbbbbccchccddddd";
removedup(str, 0, new StringBuilder(""), new boolean[26]);
        
    }
    
}
