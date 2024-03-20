// give 2 numbers a and b and find a raise to power b.

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the numbers:");
        System.out.println("Enter the number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the power: ");
        int num2 = in.nextInt();
        int result = 1;

        for(int i = 1; i <= num2; i++){
            result = result * num1;
        }
        System.out.println(result);
    }    
}
