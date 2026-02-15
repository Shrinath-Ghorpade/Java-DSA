public class Fibonacci {

    static void series(int num){
          int a=0, b=1;
        System.out.println("Fibonacci series of no "+num+ " is ");
        for(int i=1; i<=num;i++){
            System.out.print(a +" ");
            int n=a+b;
            a=b;
            b=n;
        }
    }
       
        static int recursionSeries(int num){
            if(num<=1){
                return num;
            }
            return recursionSeries(num-1) + recursionSeries(num-2);
            
        }
    public static void main(String[] args) {
        int num=5;
        series(num);
        System.out.println();
        System.out.println("Recursive Fibonacci series of " + num + " numbers:");
        for(int i = 0; i < num; i++){
            System.out.print(recursionSeries(i) + " ");
        }
    }
}
