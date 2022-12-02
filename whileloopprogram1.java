import java.util.*;

public class whileloopprogram1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int counter=1;
        int sum=0;
        int num=sc.nextInt();
        while(counter<=num){
             sum = sum+counter;
             
             counter++;
        }
        System.out.println(sum);
        
           
    }
}
