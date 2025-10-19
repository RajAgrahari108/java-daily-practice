public class sumOfDigit{
    public static void main(String[] args) {
        int n=1234;
        int rev=0;
        while (n > 0) {
            int digit = n % 10; // last digit
            rev = rev *10 + digit;  // add to sum
            n = n / 10;         // remove last digit
        }

        System.out.println("Reversed Number: " + rev);
    }
}