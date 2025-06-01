import java.util.Scanner;
public class reverse_in_place{
    static void ReverseInPlace(){
        Scanner in = new Scanner(System.in);
        System.out.println("size of array =====>");
        int size=in.nextInt();
        int[] arr=new int[size];
        System.out.println("element of array =======>");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        in.close();

        //Swap the first element to last ------> 
        int first=0,last=0;
        while(first<last){
            arr[first]=arr[last];
            arr[last]=arr[first];
            first++;
            last--;
            
        }

        //To print reveresd array in place ------->
        System.out.println("reversed an array in place =====>");
       for(int j=arr.length-1;j>=0;j--){
        System.out.println(arr[j]);
       }
    }
 
    public static void main(String[] args) {
        //Calling the function ------>
        ReverseInPlace();
        
    }
}