import java.util.*;

public class rhombus_pattern{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int line = 1;
        int backspace = n-1;
        int forwardspace = 0;
        int stars = n;

        while (line<=n) {
            
            for(int i=0;i<backspace;i++){
                System.out.print(" ");
            }
            for(int j=0;j<stars;j++){
                System.out.print("* ");
            }
            for(int k=0;k<forwardspace;k++){
                System.out.print(" ");
            }
            System.out.println();
            line++;
            backspace--;
            forwardspace++;
        }
        sc.close();
    }
}
