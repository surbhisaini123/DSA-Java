public class RearangePositiveNegative{
    public static void main(String[] args) {
        int arr[]={1,3,-2,-6,3,-2};
       for(int i=0;i<arr.length;i++){
          if(arr[i]>0){
            System.out.println(arr[i]);
          }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]<0){
                System.out.println(arr[j]);
            }
        }
       
    }
}