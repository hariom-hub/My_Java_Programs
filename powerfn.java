import java.util.Scanner;

public class Main {
    public static double printpowNum(double n , int x){
        double ans = Math.pow(n,x);
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double num = sc.nextDouble();
        System.out.println("Enter the power over the number : ");
        int power = sc.nextInt();

        double ans = printpowNum(num,power);
        System.out.println("power of "+num+" to the power "+power+" is: "+ans);
    }
}
