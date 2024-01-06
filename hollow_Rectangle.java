//hollow rectangle

import java.util.*;

public class hollow_Rectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");

        int rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int cols = sc.nextInt();

        if (rows == cols) {
            System.out.println("Sorry it would be a square if rows equals columns");
        } else {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    if (i == 1 || i == rows || j == 1 || j == cols) {
                        System.out.print(" " + '*'); // printing star for the first and last rows and column.
                    } else {
                        System.out.print("  "); // printing space for the middle rows and columns of the rectangle
                    }
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
