
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
        int first=0,last=arr.length-1,temp;
        //  for(first=0;first<last;first++){
        //     if(first<0||last>=0){
        //     temp=arr[first];
        //     arr[first]=arr[last];
        //     arr[last]=temp;
        //     first++;
        //     last--;
        //     }
            
        //  } 
         
       
       
        while(first<=last){
            if(first<0||last>=0){
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
            }
        }
        System.out.println("rearrange the arr=");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
       
       
    }
}
