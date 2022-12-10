// Question is make a program to find first repeating number in array 

import java .util.Scanner;

public class repeatNumberInArray{

    static int RepeatingNumber(int []arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    return arr[i];
                }

            }
        }
        return -99;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println( "Enter size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter "+ n+ " elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("First repeating number is : "+RepeatingNumber(arr));

        

           
    }
}