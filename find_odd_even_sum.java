
import java.util.*;

public class lecture5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int number;
        int oddSum = 0;
        int evenSum = 0;

        do {
            System.out.println("Enter a number : ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum = evenSum + number;          
            } else {
                oddSum = oddSum + number;
            }
            System.out.println("press 1 to add another number or press 0 to display the sum : ");          //asking for choice of user
            choice = sc.nextInt();                             //entering the choice
        } while (choice == 1);                          

        System.out.println("Sum of even numbers is : " + evenSum);        //printing the even sum
        System.out.println("Sum of odd numbers is : " + oddSum);          //printing the odd sum

        sc.close();
    }
}
