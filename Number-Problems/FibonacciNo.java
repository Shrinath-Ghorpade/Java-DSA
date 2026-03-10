
public class FibonacciNo {
    public static void main(String[] args) {
        int num=5;

        int a=0, b=1;

        for(int i=0; i<num; i++){
            System.out.print(a+" ");

            int next=a+b;
            a=b;
            b=next;
        }
    }
}
