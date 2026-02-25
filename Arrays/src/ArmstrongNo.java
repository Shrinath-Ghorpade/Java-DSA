public class ArmstrongNo {

    static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    static boolean isArmstrong(int n) {
        int originalNo = n;
        int sum = 0;
        int noOfdigits = countDigit(n);

        while (n != 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, noOfdigits);
            n /= 10;
        }

        return sum == originalNo;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println(isArmstrong(num));
    }
}