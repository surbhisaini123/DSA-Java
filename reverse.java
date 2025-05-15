import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("enter a size of arr=");
        int size=in.nextInt();
        int[] arr=new int[size];
        System.out.println("enter a element of arr=");
       
        int i,left=0,right=arr.length-1,temp;
        for( i=0;i<arr.length;i++){
            arr[i]=in.nextInt();   
        }
        System.out.println("array="+arr[i]);
        for(i=0;i<=arr.length-1;i++){
            if(left<right){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            }
            left++;
            right--;
           
            
        }
        for(i=0;i<arr.length;i++){
            //System.out.println("reverse array="+arr[i]);
            System.out.println(arr[i]);
        }
        
      
       
    }
}