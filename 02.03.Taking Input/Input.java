import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Number
//        System.out.println("Enter your lucky number: ");
//        int num1 = sc.nextInt();
//
//        System.out.println("Lucky number is: " + num1);

//        String
        System.out.println("Enter your name: ");
//        String name = sc.next();  //won't take input if there is a space
        String name = sc.nextLine();
        System.out.println("Name is: " + name);
    }
}
