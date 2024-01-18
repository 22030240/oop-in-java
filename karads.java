public class karads {
    public static void main(String[] args) {//-1  0+(-1)=-1  
        int num[]={-1,-3,4,5,-2,9,8,6};    //
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<num.length;i++){
            cs=cs+num[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.print("The max sum is:"+ms);

    }

    
}
