public class maxsub {
    public static void main(String[] args) {
        int numb[]={2,4,5,6,7,8};
        int prefix[]=new int[numb.length];
        prefix[0]=numb[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numb[i];
        }
        int counsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<numb.length;i++){
            int start=i;
            for(int j=i;j<numb.length;j++){
                int end=j;
                
                counsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(max<counsum){
                    max=counsum;
                }
                
            }
        }
        System.out.println("Max is:"+max);
    }
    
}
