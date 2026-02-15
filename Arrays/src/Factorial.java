public class Factorial {
    static int findFactorial(int num){
        int ans=1;
        for(int i=1;i<=5;i++){
             ans=ans*i;
        }
        return ans;
    }

    static int recursionFactorial(int n){
        if(n<=1){
            return n;
        }
        else {
            return n*recursionFactorial(n-1);
        }
        
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println("Factorial of "+num+ " is "+findFactorial(num));

        System.out.println("Factorial of " +num+ " using recursion is "+recursionFactorial(num));
    }
}
