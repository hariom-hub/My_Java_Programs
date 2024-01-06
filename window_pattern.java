//window

import java.util.*;

public class windwo_pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");

        int rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int cols = sc.nextInt();

        if(rows%2==0||cols%2==0){
            System.out.println("Please enter the odd number of rows and columns.");
        } else{
            for (int i = 1; i <= rows; i++) {

                for (int j = 1; j <= cols; j++) {

                    if (i == 1 || i == rows || j == 1 || j == cols ||i==(rows/2)+1||j==(cols/2)+1) {    //printing star line for the middle row and middle column
                        System.out.print(" " + '*'); // printing star for the first and last rows and column.
                    }
                    else {
                        System.out.print("  "); // printing space for the middle rows and columns of the rectangle
                    }
                }
                System.out.println();
            }

        }
        sc.close();
    }
}

