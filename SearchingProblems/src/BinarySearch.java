
public class BinarySearch {
       public static int search(int[] arr, int target){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int target=5;

        System.out.println("The element is foound at index "+search(arr,target));
        
    }
}
