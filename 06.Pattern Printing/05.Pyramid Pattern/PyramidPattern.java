import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int row = in.nextInt();

        for(int i = 1; i <= row; i++){

            for(int j = 1; j <= row - i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= 2 * i -1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
