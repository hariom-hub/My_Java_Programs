
import java.util.*;

public class lecture1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int line = 1;
        int star = n;
        int outersp = n-1;
        int innersp = n-2;

        while (line<=n) {
            
            for(int i=0;i<outersp;i++){
                System.out.print(" ");            //printing outer space
            }
            if(line == 1||line == n){
                for(int j=0;j<star;j++){
                    System.out.print("* ");   // for first and nth line the no. of stars to be printed = n
                }
            }else{
                System.out.print("* ");      //printing single star at the beginning of line
                for(int k=0;k<innersp;k++){
                    System.out.print("  ");     //printing inner space which is constant (inner space = n-2)
                }
                System.out.print("* ");     //printing single star at the end of the line
            }
            System.out.println();
            outersp--;                          //decreasing outer space
            line++;                            //increasing the no. of lines
        }
        sc.close();
    }
}
