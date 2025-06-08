public class RearangePositiveNegative{
    public static void main(String[] args) {
        int arr[]={1,3,-2,-6,3,-2};

        int check=0;
    for(int i=0;i<arr.length;i++){

        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>0){
                System.out.println(arr[i]);
            }
            else{
                System.out.println(arr[j]);
            }
        }
    }
       
    }
}