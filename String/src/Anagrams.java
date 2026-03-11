import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1="Listen";
        String str2="Silent";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()!=str2.length()){
            System.out.println("Not anagram");
            return;
        }
        
        int[] freq=new int[26];

        for(char ch:str1.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:str2.toCharArray()){
            freq[ch-'a']--;
        }

        for(int f: freq){
            if(f!=0){
                System.out.println("Not anagram");
                return;
            }
        }
        System.out.println("ANagram ");


        // if(str1.length()==str2.length()){
        //     char[] arr1=str1.toCharArray();
        //     char[] arr2=str2.toCharArray();

        //     Arrays.sort(arr1);
        //     Arrays.sort(arr2);

        //     boolean result=Arrays.equals(arr1,arr2);

        //     if(result){
        //       System.out.println("The strings are anagrams");
        //     }else{
        //         System.out.println("The strings are not anagrams");
        //     }
        // }
    }
}
