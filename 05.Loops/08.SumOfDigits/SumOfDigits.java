// Find the sum of digits in a given number

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int sum = 0;

        while( num > 0){
            sum += num % 10;
            num = num / 10;
        }
        System.out.println(sum);

    }
}
