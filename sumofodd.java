import java.util.Scanner;

public class patterns {

    public static void printSumofOdd(int n) {
        int i;
        int sum = 0;

        if (n == 0 || n % 2 == 0) {
            System.out.println("Even number entered!!! Please enter an odd number");
        } else {
            System.out.print("Odd numbers between 1 to " + n + " are: ");
            for (i = 1; i <= n; i = i + 2) {
                System.out.print(" " + i);
                sum = sum + i;
            }
            System.out.println("\nSum of odd numbers between 1 to " + n + " is : " + sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the odd number up to which you want to print the numbers: ");
        int inputNumber = sc.nextInt();
        printSumofOdd(inputNumber);
    }
}
