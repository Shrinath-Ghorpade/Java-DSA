package SearchingProblems;

public class LinearSearch {
    
    static int search(int[] arr, int element){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={4,5,8,2,1,9};
        int element=1;
        System.out.println("Element is found at "+ search(arr, element));
    }
}
