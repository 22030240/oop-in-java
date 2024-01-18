public class trapwater {
    public static void main(String[] args) {
        int height[]={4,2,6,0,3,4};
        int n=height.length;
        // auxillary array for left
        int left[]=new int[n];
        left[0]=height[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }
        // auxillary array for right
        int right[]=new int[n];
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(height[i],right[i+1]);
        }
        // calculate watermark
        int trapwater=0;
        for(int i=0;i<n;i++){
            int watermark=Math.min(left[i], right[i]);
            trapwater+=watermark-height[i];

        }
        System.out.println("Trapwater between column is:"+trapwater);
        

    }
    
}
