// Count the number of digits for a given number

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int count = 0;

        while( num > 0){
            num = num / 10;
            count++;
        }
        System.out.println("Number of digits: " +count);
    }    
}
