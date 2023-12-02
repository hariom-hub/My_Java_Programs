import java.util.Scanner;

public class patterns {

    public static int printAverageofthree(int num1, int num2, int num3) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        int average = (num1 + num2 + num3) / 3;
        return average;
    }

    public static void main(String[] args) {

        int y = printAverageofthree(10, 20, 30);
        System.out.println("Average of three numbers is : " + y);

    }
}
