import java.util.*;;
public class sum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter principle ");
        float p = sc.nextFloat();
        System.out.println("enter rate of intrest");
        float r =sc.nextFloat();
        System.out.println("enter time ");
        int t=sc.nextInt();
        float i =  ((p*r*t)/100);
        System.out.println("your intrest on Rs "+ p +"  at intrest of "+ r+ " for time "+t+ "is rs  " +i);
     }
 }