import java.util.Scanner;

public class NumericalRectangle{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = in.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = i; j <= row; j++){
                System.out.print(j + " ");
            }
            if(i >= 2){
                for(int k = 1; k < i; k++){
                    System.out.print(k + " ");
                }

            }
            System.out.println();
        }
    }
}