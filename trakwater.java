public class trakwater {
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        // auxilary array for left 
        int left[]=new int[height.length];
        left[0]=height[0];
        for(int i=1;i<height.length;i++){
            left[i]=Math.max(height[i],left[i-1]);

        }
        // auxillary array for right
        int right[]=new int[height.length];
        right[height.length-1]=height[height.length-1];
        for(int j=height.length-2;j>=0;j--){
            right[j]=Math.max(height[j],right[j+1]);
        }
        int trapwater=0;
        for(int i=0;i<height.length;i++){
            int watermark=Math.min(left[i], right[i]);
            trapwater+=watermark-height[i];
        }
        
        System.out.print("Trapwater in between column is:"+trapwater);
    }
    
}
