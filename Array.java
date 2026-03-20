package Java_apnaclg;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        // ARRAY DECLARATION---------->>>>>>>>

        // String [] stu=new String[3];
        // String stu []=new String[3];
        // stu[0]="xyz";
        // stu[1]="abc";
        // stu[2]="pqr";
        // // System.out.print(stu[0]+" ");
        // // System.out.print(stu[1]+" ");
        // // System.out.print(stu[2]+" ");
        // for(int i=0;i<stu.length;i++){
        //     System.out.print(stu[i]+' ');
        // }
        // int [] num={1,2,3,4};

        // USER INPUT----------->>>>>>>.

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter your size0");
    //     int size=sc.nextInt();
    //    int arr[]=new int[size];
    //    System.out.print("enter your arr=");
    //    for(int i=0;i<size;i++){
    //     arr[i]=sc.nextInt();
    //    }

    //     //output
    //     for(int i=0;i<size;i++){
    //         System.out.print(arr[i]+" ");
    //     }

    // QUESTION-------->>>>>
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int [] arr=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    int target=5;
    for(int i=0;i<size;i++){
        System.out.println(arr[i]);
    }
    System.out.println(" ");
    for(int i=0;i<size;i++){
          if(arr[i]==target){
            System.out.println(i);
        }

    }
     sc.close();
    // hjg
   


    }
} 
