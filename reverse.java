public class reverse {
    public static void reversearray(int array2[]){
        int first=0;
        int last=array2.length-1;

        while(first<last){
            int temp=array2[last];
            array2[last]=array2[first];
            array2[first]=temp;
            first++;
            last--;
        }
        
    }
    //pair of array
    public static void pair(int array2[]){
        int total_pair=0;
        for(int i=0;i<array2.length;i++){
            int current=array2[i];
            for(int j=i+1;j<array2.length;j++){
                System.out.print("("+current+","+array2[j]+")");
                total_pair++;
            }
            System.out.println();
        }
        System.out.println("Total pairs is"+total_pair);
    }

    public static void main(String[] args) {
        int array2[]={2,4,6,8,10,12,14};
        //reversearray(array2);
        //for(int i=0;i<array2.length;i++){
        //    System.out.print(array2[i]+" ");
       // }
       pair(array2);
        
    }
    
}
