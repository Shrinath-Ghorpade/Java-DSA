import java.util.*;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,5,4};

        HashMap<Integer,Integer> map=new HashMap<>();

       for(int i: arr){
        map.put(i, map.getOrDefault(i,0)+1);
       }
       for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
       }    
    }
}
