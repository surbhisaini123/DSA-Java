import java.util.Scanner;


public class duplicted_number {
    static void Duplicated_No_Array(){  
     Scanner in = new Scanner(System.in);
     System.out.println("enter a size of array=====");
    int size= in.nextInt();
     System.out.println("enter a  element of array=====");
     int [] arr=new int[size];
     for(int i=0;i<arr.length;i++){
        arr[i]=in.nextInt();
     }
     in.close();

     System.out.println(" ");
     System.out.println("duplicated element of array======>ko");
     for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println(arr[i]);
            }
        }
     }


}
    public static void main(String[] args){
         Duplicated_No_Array();
    }

    
    
}
