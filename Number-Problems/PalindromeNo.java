import java.util.Scanner;

public class PalindromeNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int rev=0;

        while (num>0) {
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        if(rev==original){
            System.out.println("Palidrome number");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
