import java.util.ArrayList;
import java.util.Collections;



public class merge_array { 
    static void MergeTwoArray(){
    
    ArrayList <Integer>arr1=new ArrayList<>();
       arr1.add(5);
       arr1.add(9);
       arr1.add(3);
       arr1.add(1);
       arr1.add(2);
       Collections.sort(arr1);
       System.out.println("Element of array 1----->");
       System.out.println(arr1); 
       System.out.println(" ");

    ArrayList <Integer>arr2=new ArrayList<>();
       arr2.add(8);
       arr2.add(11);
       arr2.add(55);
       arr2.add(87);
       arr2.add(9);
       Collections.sort(arr2);
       System.out.println("Element of array 2----->");
       System.out.println(arr2);
       System.out.println(" ");

      // To Print Merge Two Array======>
       arr1.addAll(arr2);
       System.out.println("MERGE TWO SORTED ARRAY===: "+arr1);
        System.out.println(" ");

    
      //To Print The Sorted Form Of Merge Array=======>
       Collections.sort(arr1);
       System.out.println("SORTED FORM OF MERGE ARRAY===: " +arr1);


    }
    public static void main(String[] args) {
        MergeTwoArray();


    }
}
