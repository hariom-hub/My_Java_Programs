import java.util.*;
public class lecture7 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
//using while loop
// import java.util.*;

// public class lecture7 {

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int star = 1;
//         int sp = n-1;     //vimp question
//         int num_line = 1;

//         while (num_line<=n) {

//             for(int i=0;i<sp;i++){
//                 System.out.print("  ");
//             }
//             for(int j=0;j<star;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//             star++;
//             sp--;
//             num_line++;
//         }

//         sc.close();
//     }
// }

// import java.util.*;

// public class lecture7 {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows : ");
//         int rows = sc.nextInt();
//         System.out.println("Enter the number of columns : ");
//         int cols = sc.nextInt();

//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= cols; j++) {
//                 if (i == 1 || i == rows || j == 1 || j == cols) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//         sc.close();

//     }
// }

import java.util.*;

public class lecture7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num_line = 1;
        int star = 1;
        int sp = n- 1;
        for (int k = 0; k < 2; k++) {
            while (num_line <= n) {

                for (int i = 0; i < sp; i++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < star; j++) {
                    System.out.print(" *");
                }
                System.out.println();
                num_line++;
                star++;
                sp--;
            }
        }

        sc.close();
    }
}
