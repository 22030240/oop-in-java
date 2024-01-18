import java.util.Scanner;

public class linearsearch {
    public static int search(int marks[],int key){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int marks[]={10,23,34,45,78,27,36,28,17};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter key we want to search:");
        int key=sc.nextInt();
        int index=search(marks, key);
        if(index==-1){
            System.out.println("Element is Not Found");
        }
        else{
            System.out.println("Element is fount at index:"+index);
        }

    }
    
}
