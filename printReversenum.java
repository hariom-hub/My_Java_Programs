
import java.util.*;

public class lecture4 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long num = sc.nextInt();
        System.out.println(num);
        while(num>0){
            long lastDigit = num%10;         //finding the last digit
            System.out.print(lastDigit);
            num = num/10;                 //decreasing the last digit
        }
        sc.close();
    }
}  
//  #APNA COLLEGE ✌️✌️
