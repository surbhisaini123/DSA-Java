import java.util.Scanner;

public class max_produt_array {

     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a sze of array=");
        int size =in.nextInt();
        System.out.println("entre a element array=");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
         arr[i]=in.nextInt();
        }
        for(int i=0;i<arr.length;i++){
          int product=1;
          for(int j=i;j<arr.length;j++){
            product+=arr[j];
             int max=0;
            if(arr[i]>max){
               System.out.println(max);
               for(int k=i;k<=j;k++){
                  System.out.println(arr[k]);
               }
            }
          }
        }
     }
    
  
   

    
}
