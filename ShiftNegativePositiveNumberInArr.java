
import java.util.Scanner;

public class ShiftNegativePositiveNumberInArr {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a size of arr=");
        int size=in.nextInt();
        int arr[]=new int[size];
        System.out.println("enter a element of arr=");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        
        int first=0,last=0,temp;
         for(first=0;first<arr.length;first++){
            if(arr[first]<0){
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            //s first++;
            last++;
            }
            
         } 
         
       
       
       System.out.println("rearrange arr=");
       
        for(int i=0;i<arr.length;i++){
            System.out.println(" " +arr[i]);
        }
        
       
       
    }
}
