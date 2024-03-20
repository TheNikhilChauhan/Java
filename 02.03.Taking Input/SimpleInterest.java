import  java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Principle amount: ");
        float principle = in.nextFloat();

        System.out.println("Enter Rate Of Interest: ");
        float rate = in.nextFloat();

        System.out.println("Enter Time: ");
        float time = in.nextFloat();

        float si = (principle * rate * time) / 100;

        System.out.println("Principle is: " +principle);
        System.out.println("Rate Of Interest is: " +rate);
        System.out.println("Time is: " +time);

        System.out.println("Simple Interest is: " +si);
    }
}