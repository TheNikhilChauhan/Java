import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        int sum = 0;
        int num = 1;

        while (num <= n){
            sum += num;
            num++;
        }
        System.out.println(sum);

    }
}
