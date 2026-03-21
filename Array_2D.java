package Java_apnaclg;

import java.util.Scanner;

public class Array_2D {
    public static  void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int row=sc.nextInt();
        // int col=sc.nextInt();
        // int[][] arr=new int[row][col];
        
        // //row
        // for(int i=0;i<row;i++){
        //     // coloumn
        //     for(int j=0;j<col;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // System.out.println(" ");

        // //output
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        // QUESTION 
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][] matrix=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int x=5;
        // System.out.println(" ");
        //  for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //            System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }
         System.out.println(" ");

         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                  if(matrix[i][j]==x){
                   System.out.println("("+i+","+j+")");
                  }
            }
            
        }
        
       
        sc.close();

    }
    
}
