public class subarray {
    public static void main(String[] args) {
        int ts=0;
        int num[]={2,4,6,8,10,12,14};
int countsum=0;
int max=Integer.MIN_VALUE;
        //outer loop for travelling
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                countsum=0;

            
            for(int k=start;k<=end;k++){
                countsum+=num[k];
            }
            System.out.println(countsum);
            if(max<countsum){
                max=countsum;
            }
           ts++;
            

        }
        
        }
        System.out.println("max is"+max);
        System.out.print("Total subarray is:"+ts);
    }
    
}
