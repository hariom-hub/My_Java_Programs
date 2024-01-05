import java.util.*;

public class lecture5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");

        int num = sc.nextInt();
        boolean isPrime = true;

        if (num == 2) {
            System.out.println("The number entered is a Prime Number.");
        } else {
            for (int i = 2; i <= num - 1; i++) { // num-1 can be replaced by Math.sqrt(num);
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("The number entered is  a prime Number.");
            } else {
                System.out.println("The number entered is not a prime Number.");
            }
        }

        sc.close();
    }
}
