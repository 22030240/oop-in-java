public class calculatormanegment {
    final static char[][] L={{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r'},{'s','t','u'},{'w','x','y','z'}};

public static void lettercombination(String D) {
    int len = D.length();
    if(len == 0){
        System.out.println("");
        return;
    }
    bps(0,len,new StringBuilder(),D);
    
}
public static void bps(int pos , int len, StringBuilder sb,String D) {
    if(pos == len){
        System.out.println(sb.toString());
    }
    else{
        char[] letters=L[Character.getNumericValue(D.charAt(pos))];
        for(int i=0;i < letters.length;i++){
            bps( pos+1, len,new StringBuilder(sb).append(letters[i]), D);
        }

    }
}


    public static void main(String[] args) {
        lettercombination("23");
    }
    
}
