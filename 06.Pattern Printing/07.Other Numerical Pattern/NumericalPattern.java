import java.util.Scanner;

public class NumericalPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row = in.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= 6; j++){
                if((i + j) % 2 == 0 ){
                    System.out.print(1);
                }else {
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }   
}
