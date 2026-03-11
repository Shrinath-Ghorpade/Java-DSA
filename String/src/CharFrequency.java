import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {
        String str="anaghbh";

        HashMap<Character, Integer> map=new HashMap<>();

        for(char i:str.toCharArray()){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
