public class Palindrome {
    static boolean checkPalindrome(String str){
        char[] arr=str.toCharArray();

        int left=0;
        int right=arr.length-1;

        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            
            left++;
            right--;
        }
       
        String reverse=new String(arr);

        if(reverse.equals(str)){
            return true;
        }
        return false;        
    }

    public static void main(String[] args) {
        String str="madam";
        // System.out.println(checkPalindrome(str));
        int left=0;
        int right=str.length()-1;

        boolean isPalindrome=true;

        while (left<right) {
            if(str.charAt(left)!=str.charAt(right)){
                isPalindrome=false;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not palindrome");
        }
    }
}

