import java.util.*;

public class sum_of_digits {
    public static int getSum(int num){
        int sum = 0;
        while (num != 0){                         
            sum = sum + (num%10);       
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();                                      //taking input
         System.out.println("sum of digits is : "+getSum(num));    //printing sum through function call
      sc.close();
    }
}
