public class SubArrayGivenSum {
    static void sum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==target){
                    System.out.println("SUB ARRAY OF GIVEN SUM "+target+":");
                  for(int k=i;k<=j;k++){
                    System.out.println(arr[k]+" ");
                  }
                }
            }
        }
      

    }
    public static void main(String[] args) {
       
        int[] arr= {2,4,6,1,9,4,3,1,4,7,3,9};
       
        int target=10;
        
       sum(arr, target);
        
    }
    
    
}
