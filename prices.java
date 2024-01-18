public class prices {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){//prifit
                int profit=prices[i]-buyprice;//total profit
                maxprofit=Math.max(profit,maxprofit);

            }
            else{
                buyprice=prices[i];
            }
        }
        System.out.print("max mum profit is:"+maxprofit);


    }
    
}
