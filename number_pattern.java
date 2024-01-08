import java.util.*;
public class number_pattern {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int line = 1;
        int space = n-1;
        int star = 1;
        int num = 1;
        while (line<=n) {

            for(int i=0;i<space;i++){
                System.out.print(" ");
            }
            for(int j=0;j<star;j++){
                System.out.print(num+" ");
            }
            System.out.println();
            star++;
            space--;
            line++;
            num++;
        }
        sc.close();
    }
}
