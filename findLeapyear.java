import java.util.*;

public class lecture4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");

        int year = sc.nextInt();

        if (year <= 0) {
            System.out.println("Invalid year entered.");
        } else {

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Leap Year.");
                    } else {
                        System.out.println("Not a leap Year.");
                    }
                } else {
                    System.out.println(" Leap Year.");  //here logic is same as year % 100 != 0
                }
            } else {
                System.out.println("Not a leap year.");
            }
        }

        sc.close();
    }
}
