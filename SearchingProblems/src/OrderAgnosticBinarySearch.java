public class OrderAgnosticBinarySearch {

    public static int search(int[] arr, int target){
        int low=0;
        int high=arr.length-1;

        boolean isasc=arr[low]<arr[high];
        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isasc){
                 if(target>arr[mid]){
                    low=mid+1;
                 }else{
                high=mid-1;
            }
        }
            else{
                if(target>arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            }
        
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        int target=8;

        System.out.println("The element is foound at index "+search(arr,target));
    }
}
