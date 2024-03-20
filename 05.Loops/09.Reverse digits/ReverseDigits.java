import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = in.nextInt();
        int reverseDigits = 0;

        while(num > 0){
            int last = num % 10;
            reverseDigits = reverseDigits * 10 + last;
            num /= 10;
        }
        System.out.println(reverseDigits);
    }
}
