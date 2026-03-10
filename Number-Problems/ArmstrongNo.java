import java.util.*;
public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int num=sc.nextInt();
        int num=153;
        int originalNo=num;
        int sum=0;

        while (num>0) {
            int digit=num%10;
            sum+=digit*digit*digit;
            num/=10;
        }
        if(sum==originalNo){
            System.out.println("The no is armstrong");

        }else{
            System.out.println("Not armstrong");
        }
    }
}