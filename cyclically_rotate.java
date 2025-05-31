import java.util.Scanner;
public class cyclically_rotate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a size of arr=");
        int size=in.nextInt();
        int[] arr=new int[size];
        System.out.println(" ");
        System.out.println("original arr=");
        for(int i=0;i<arr.length;i++){
              arr[i]=in.nextInt();
        }
        System.out.println(" ");
        int start,end=arr[arr.length-1];

        //Cyclically rotated array by one ----->
        //Shift element right by one ----->

        for(start=arr.length-1;start>0;start--){
            arr[start]=arr[start-1];
        }

         //Put last element to the front ------>

        arr[0]=end;
        System.out.println("cyclically rotated arr=");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
       
       
    }
    
}
