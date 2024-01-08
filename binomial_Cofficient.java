import java.util.*;

public class binomial_Cofficient {

    public static int fact_diff_n_r(int n, int r) {     //function which finds the factorial of difference of n and r
        int diff_fact = 1;
        int fact_diff = n - r;
        for (int i = 1; i <= fact_diff; i++) {
            diff_fact = diff_fact * i;
        }
        return diff_fact;
    }

    public static int printFact_n(int n) {         //function which finds the factorial of n
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int printFact_r(int r) {            //function which finds the factorial of r
        int fact = 1;
        for (int j = 1; j <= r; j++) {
            fact = fact * j;
        }
        return fact;
    }

    public static int printBinomialCoff(int n, int r) {      //function to find the binomial cofficient of n and r

        int binCoff = (printFact_n(n) / (printFact_r(r) * (fact_diff_n_r(n, r))));  // combining all other function to perform their operations
        return binCoff;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter r : ");
        int r = sc.nextInt();

        System.out.println("Binomial cofficient of " + n + "C" + r + " " + "is : " + printBinomialCoff(n, r)); //calling the binomial cofficeint function
        sc.close();
    }
}
