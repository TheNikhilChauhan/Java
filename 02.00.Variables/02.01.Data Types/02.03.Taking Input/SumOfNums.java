import java.util.Scanner;

public class SumOfNums{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " +(num1+num2));

    }
}