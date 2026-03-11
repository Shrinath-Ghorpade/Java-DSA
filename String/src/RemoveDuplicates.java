import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="programming";

        HashSet<Character> set=new HashSet<>();

        StringBuilder result=new StringBuilder();

        for(char ch: str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}
