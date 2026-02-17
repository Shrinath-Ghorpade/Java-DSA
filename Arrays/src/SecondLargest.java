
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={2,5,3,7,8,9,10,1};
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
            }
            else if(arr[i]>second && second<largest){
                second=arr[i];
            }


        }
        System.out.println("Second largest elemnet is "+ second);

    }
}
