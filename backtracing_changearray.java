public class backtracing_changearray {
    public static void change_array(int arr[] , int ind , int value) {// ind for incresing the index value
                                                                      // value assign
    //base
if(ind==arr.length){
    print_arr(arr);
    return;
}
//recursion(kaam)
arr[ind]=value;
change_array(arr, ind+1, value+1);
arr[ind]=arr[ind]-2;
        
    }
    public static void print_arr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[10];
        change_array(arr, 0, 1);
        System.out.println("After substracting by 2.");
        print_arr(arr);

    }
    
}
