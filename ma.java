public class ma {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,10,11};
        int tp=0;
        //outer loop
        for(int i=0;i<num.length;i++){
            int curr=num[i];
            for(int j=1+i;j<num.length;j++){
                System.out.print("("+curr+","+j+")");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total pear is:"+tp);
    }
    
}
