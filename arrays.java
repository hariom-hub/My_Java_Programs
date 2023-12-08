import java.util.Scanner;
public class Array {
    public static void main(String[] args){

        int num = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int cols = sc.nextInt();

        int [][]Matrix = new int[rows][cols];

        //taking input
        System.out.println("Enter the matrix elements : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                Matrix[i][j] = sc.nextInt();

            }
        }

        //output
        System.out.println("Matrix entered is : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(Matrix[i][j] == num){
                    //printing index of i and j
                    System.out.print("Number is at position"+" "+i+" "+j);

                }
                else {
                  break;
                }
            }
        }
    }
}
