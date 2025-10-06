import java.util.Scanner;

public class addTwoNum {
    static int calculateSum(int a, int b){

        int sum = a + b; 

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number = ");
        int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        System.out.println("The sum of "+ a  +" and " + b + " is : " +calculateSum(a, b));
    }
}
