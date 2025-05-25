import java.util.Scanner;
public class sort_arr_0s1s2s{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter a size of arr=");
        int size=in.nextInt();
        int [] arr=new int[size];
        System.out.println("enter a element of arr=");
        for(int i=0;i<arr.length;i++){
         arr[i]=in.nextInt();
        }
        // LOW denoted 0s
        // MID denoted 1s
        //HIGH denoted 2s
        int low=0,mid=0,high=arr.length-1;

        for(mid=0;mid<=arr.length-1;mid++){
           int temp;
         
            if(arr[mid]==0){
                 temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
                
            }
            else if(mid==1){
                mid++;
            }
            else if(mid==2){
                 temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
                
                
            }
          
       }
        
        System.out.println("  ");
     System.out.println("sorted arr=");
       for( int i=0;i<=arr.length-1;i++){
        System.out.println(arr[i]+" ");
       }
    }
}