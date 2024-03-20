import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        int num = 1;

        while(num <=n){
            System.out.println(num);
            num++;
        }
    }
}
