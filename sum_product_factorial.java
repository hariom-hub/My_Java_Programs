import java.util.*;

public class Main {
    public static int printSum(int a, int b) {
        return a + b;
    }

    public static int printProduct(int A, int B) {
        return A * B;
    }

    public static double printFactorial(int n) {
        double factorial = 1;
        if(n==0||n==1){
            return 1;
        } else if (n<0) {
            System.out.println("factorial of a negative number doesn't exist");
            return 0;
        } else{
            for (int i = n; i >=1; i--) {
                factorial = factorial * i;
            }
            return factorial;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = printSum(num1, num2);
        System.out.println("Sum is : " + sum);
//        int sum2 = printSum(10,20);
//        System.out.println("Second sum is : "+sum2);
        int product = printProduct(num1, num2);
        System.out.println("Product of two numbers is : " + product);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        double factorial = printFactorial(n);
        System.out.println("Factorial is : " + factorial);


    }
}
