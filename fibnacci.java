//fibonacci series

import java.util.Scanner;

public class file {

    public static int printFibonacci(int n){
        int term1 = 0;
        int term2 = 1;
        int nextTerm;
        if(n==0){
            System.out.println("invalid number of terms entered");
        }
        else if(n==1){
            System.out.print(term1+" "+term2);

        }
        else{
            System.out.println("Fibonacci series is : ");
            System.out.print(term1+" "+term2);
            for(int i=1;i<n;i++){
                nextTerm = term1+term2;
                System.out.print(" "+nextTerm);
                term1 = term2;
                term2 = nextTerm;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms of fibonacci series : ");
        int n = sc.nextInt();

        int fibSeries = printFibonacci(n);
    }
}
