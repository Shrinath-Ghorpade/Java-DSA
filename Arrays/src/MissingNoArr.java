import java.util.Scanner;

public class MissingNoArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int sum= n*(n+1)/2;

        int actualSum=0;
        for(int i=0; i<n-1;i++){
            actualSum=actualSum+sc.nextInt();
        }

        System.out.println(sum-actualSum);
    }
}
