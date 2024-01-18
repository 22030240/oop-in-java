public class maxee {
    public static void main(String[] args) {
        int numt[]={2,4,6,8,10,12,14,16,18};
      //  int countsum=0;
        int tp=0;
      //  int maxsubarry=Integer.MIN_VALUE;//-infinity
        //outer 
        for(int i=0;i<numt.length;i++){
            int start=i;
            for(int j=i;j<numt.length;i++){
                int end=j;
                countsum=0;
                for(int k=start;k<=end;k++){
                    //countsum+=numt[k];
                    System.out.print(k);
                }
                tp++;
               // System.out.println(countsum);
               System.out.println();
                //if(maxsubarry<countsum){
                    //maxsubarry=countsum;
               // }
            }
        }
        System.out.print("Max sub:"+tp);
        
        }
        
    
}
