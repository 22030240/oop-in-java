public class maxsubarray {
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14,16,18};
        int countsum=0;
        int maxsubarry=Integer.MIN_VALUE;//-infinity
        //outer 
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;i++){
                int end=j;
                countsum=0;
                for(int k=start;k<=end;k++){
                    countsum+=num[k];
                }
                System.out.println(countsum);
                if(maxsubarry<countsum){
                    maxsubarry=countsum;
                }
            }
        }
        System.out.print("Max sub array is:"+maxsubarry);
        
        }
        
    }

    

