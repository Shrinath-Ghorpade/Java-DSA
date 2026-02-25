public class NumberPalindrome {
        
    public static int reverse(int n){
        int reversed=0;
        while (n>0) {
            int rem=n%10;
            reversed=reversed*10+rem;
            n=n/10;
         }
        return reversed;        
    }

     static boolean palindrome(int n){
        int reversed=reverse(n);
        return n==reversed;
     }
    public static void main(String[] args) {

        int num=12321;
        boolean result=palindrome(num);
        System.out.println("Is Palindrome:" + result);
        
    }
}
