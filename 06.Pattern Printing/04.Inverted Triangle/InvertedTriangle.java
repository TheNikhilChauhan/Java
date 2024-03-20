import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int row = in.nextInt();
        

        for(int i = 0; i < row; i++){
            for(int j = i; j < row; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
