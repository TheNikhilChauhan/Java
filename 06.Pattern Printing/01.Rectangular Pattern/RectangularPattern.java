import java.util.Scanner;

public class RectangularPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int row = in.nextInt();
        System.out.println("Enter number of columns: ");
        int col = in.nextInt();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
