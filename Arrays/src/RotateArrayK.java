import java.util.*;
public class RotateArrayK {
    
    static int[] reverse(int[] arr,int start,int end){
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] arr2={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=10;
         k=k%n;

         reverse(arr, 0, n-1);
         reverse(arr, 0, k-1);
         reverse(arr, k, n-1);
        System.out.println("Rotate in right side");
        for(int x:arr){
            System.out.print(x+" ");

        }
        System.out.println();
        System.out.println("Rotate in left side");
        reverse(arr2, 0, k-1);
        reverse(arr2, k, n-1);
        reverse(arr2, 0, n-1);

        for(int i: arr2){
            System.out.print(i+" ");
        }

    }
}
