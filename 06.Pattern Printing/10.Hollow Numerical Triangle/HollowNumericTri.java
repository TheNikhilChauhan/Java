import java.util.Scanner;

public class HollowNumericTri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = in.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row - i; j++){
                System.out.print(" ");
                
            }
            System.out.print(i);
            
            if(i == row){
                for(int l = 0; l <= row + 2; l++){
                    System.out.print(i);
                }
            }

            for(int k = 1; k <= 2*i - 3; k++){
                System.out.print(" ");
            }
            if (i > 1 && i < row) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
