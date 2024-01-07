import java.util.*;

public class Diamond_pattern{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n = sc.nextInt();
        int line = 1;
        int star = 1;
        int space = n - 1;

        while (line <= n) {

            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            for (int k = 0; k < space; k++) {
                System.out.print(" ");
            }
            System.out.println();
            star++;
            space = space - 1;
            line++;
        }
        int line_ = 1;
        int space_ = 1;
        int star_ = n - 1;
        while (line_ <= n) {

            for (int i = space_; i > 0; i--) {
                System.out.print(" ");
            }
            for (int j = star_; j > 0; j--) {
                System.out.print("* ");
            }
            for (int k = space_; k > 0; k--) {
                System.out.print(" ");
            }
            System.out.println();
            star_ = star_ - 1;
            space_++;
            line_++;
        }
        sc.close();
    }
}
