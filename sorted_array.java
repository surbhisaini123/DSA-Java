public class sorted_array { 
    public static void main(String[] args) {
       // int arr[]={25,1,9,4,6,8};
        int arr[]={1,2,3,4,5};
        int i=0;
        int j=i+1;
        int check=0;
        while(i<=j){
            if(arr[i]<arr[j]){
                System.out.println("sorted");
            }
            else{
                System.out.println("no");
            }
            i++;
            j--;
            check++;
        }
       
    
}
    
}
