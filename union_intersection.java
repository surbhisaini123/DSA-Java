public class union_intersection {
    public static void main(String[]args){
        int [] arr1=new int[]{2,5,4};
        int[] arr2=new int[]{2,4,9};
        
        
        //TO FIND A INTERSECTION......
        System.out.println("intersection of two arr= ");
        for(int i=0;i<arr1.length;i++){
            for(int  j=0;j<arr2.length;j++){
               if(arr1[i]==arr2[j]){
                 System.out.println(arr1[i]);
                 break;
               }  
            }
        }
        System.out.println(" ");
        //TO FIND UNION
        System.out.println("union of two arr= ");
     for(int i=0;i<arr1.length;i++){
        System.out.println(arr1[i]+" ");
     }
     for(int j=0;j<arr2.length;j++){
        boolean isduplicate=false;
      for(int i=0;i<arr1.length;i++){
        if(arr1[i]==arr2[j]){
          isduplicate=true;
          break;
        }
      }
      if(!isduplicate){
        System.out.println(arr2[j]+" ");
      }
     }
      
      
       
       
        
       
    }
    
}
