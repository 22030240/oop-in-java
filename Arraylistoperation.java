import java.util.*;

public class Arraylistoperation {
    public static void main(String[] args) {
//syntax of arraylist.
       ArrayList <Integer> list = new ArrayList<>();
       //operation of arraylist.
       // 1.add
       list.add(1);  // o(1)
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       System.out.println("Element in arraylist are:->"+list);
     //add operation (index , value )
       list.add(5, 6);
       System.out.println(" after adding the Element in arraylist are:->"+list);

       // get operation
       int element=list.get(1);  // o(1)
       System.out.println("get the elment at index:->"+element);
       
       // remove the element.
       list.remove(1);        // o(n)
       list.remove(3);
       System.out.println("After deleting the index:->"+list);

       // set element at index.

       list.set(0, 11);         // o(n)
       list.set(3, 0);

       System.out.println("After set the element:->"+list);

       // contains operation.-> it give true or false value. // o(n)

       
       System.out.println(list.contains(11));
       System.out.println(list.contains(5));
       System.out.println(list.contains(0));
       System.out.println(list.contains(44));

       // size()  ->is a method in arraylist
       System.out.println("Size of arraylist is:->"+list.size());

       // iterating the element.
       for(int i=0; i<list.size();i++){
        System.out.println("Element are:"+list.get(i)+" ");
        
     }
     // reversing the element
       System.out.println("after reversing element are:->");
       for(int i=list.size()-1;i>=0;i--){
        System.out.print(list.get(i)+" ");

       }
       System.out.println();
   // find max element
   int max=Integer.MIN_VALUE;
   for(int i=0;i<list.size();i++){
    if(max < list.get(i)){
    max=list.get(i);
    }
   }
   System.out.print("Max element in this arraylist is:->"+max);
   System.out.println();

   // find out the minimum element 
   int min=Integer.MAX_VALUE;
   for(int i=0;i<list.size();i++){
    if(min > list.get(i)){
        min= list.get(i);
    }
   }
   System.out.print("Minimum element in this arraylist is:->"+min);

   //swap the two element;
   System.out.println("before swaping element is:->"+list);
   int idx1=1 , idx2=3;
   int temp=list.get(idx1);
   list.set(idx1, list.get(idx2));
   list.set(idx2, temp);

   System.out.println("After swaping out array is:->"+list);

   //sort the aaaylist.
   System.out.println("after sorting the element in arraylist:->");
   Collections.sort(list);
   System.out.println(list);

   //desesending order sort.
   Collections.sort(list, Collections. reverseOrder());
   System.out.println(list);

   //multidimension arraylist
   ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
   ArrayList<Integer> l=new ArrayList<>();
   l.add(32);
   l.add(44);
   l.add(56);
   l.add(57);
   mainlist.add(l);
   System.out.println("mainlist is after adding l1:->"+mainlist);
   ArrayList<Integer> l2=new ArrayList<>();
   l2.add(43);
   l2.add(38);
mainlist.add(l2);
System.out.println("mainlist is after adding l2:->"+mainlist);
for(int i=0;i<mainlist.size();i++){
    ArrayList<Integer>current=mainlist.get(i);
    for(int j=0;j<current.size();j++){
        System.out.print(current.get(j)+" ");
    } 
    System.out.println();
}

       
}
}
