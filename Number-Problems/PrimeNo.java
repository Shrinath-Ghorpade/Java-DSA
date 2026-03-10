
import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();

        if(num<=1){
            System.out.println("The no is not prime");
        }

        boolean isPrime=true;
        for(int i=2; i<Math.sqrt(num); i++){
            if(num%i==0){
                isPrime=false;
            }
        }

        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
