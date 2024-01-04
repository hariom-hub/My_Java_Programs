import java.util.Scanner;

public class question {

    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            System.out.println(num);

            if(num%10==0){
                System.out.println("You have entered the multiple of 10.");
                break;
            }
        }
        while(true);
        sc.close();
    }
}
