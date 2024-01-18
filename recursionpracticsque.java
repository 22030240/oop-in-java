public class recursionpracticsque {
    //find out the index of given element of kye.
    //sample input arr[5]={1,2,3,2,2}u have to find out 2 
    // then the required result is 1,3,4
    public static void alloccurances(int arr[],int key,int idx) {
       //base condition
       if(idx==arr.length){
        return;
       } 
       //kam
       if(arr[idx]==key){
        System.out.println(idx+" ");
       }
       alloccurances(arr, key, idx+1);      
       //main function code for this function.
    //    int arr[]={1,2,3,4,1,5,17,4,3,5,1,1,2,1,8,1};
    //    int key=2;
    //    System.out.println("following position key are present :");
    //    alloccurances(arr, key, 0); 
     }
   // q.2 convert the number into string word like 2019->two zero one nine //
   public static void convertnumtostring(int num) {
     String digit[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    //base
    if(num==0){
        return;
    }
    int lastdigit=num%10;
    convertnumtostring(num/10);//pahilyanda stack tayar hote natar string print hot aste.
    System.out.print("("+(digit[lastdigit]+" ")+")");
    
    // main funtion code
   // convertnumtostring(1232778);
   }
   //q3.calculate length of the string.
   public static int lengthofstr(String str) {
    //base
    if(str.length()==0){
        return 0;
    }
    return lengthofstr(str.substring(1))+1;
    //main function code is.
    // String str="ahjhjjgchgx";
    //   System.out.println(lengthofstr(str));
   }

   //q4.towerofhonio problem (important)
   public static void towerofhonio(int n, String src, String helper, String dest) {
    if(n == 1){
System.out.println("transfer disk form "+ n +" from "+ src +"to "+ dest);
return;
    }
towerofhonio(n-1, src, helper, dest);
System.out.println("transfer disk form "+ n +" from "+ src +"to "+ helper);
towerofhonio(n-1, src, helper, dest);
   }
     public static void main(String[] args) {
    //  int n=4;
    //  towerofhonio(n, "A", "B", "C");
    }
    
}
