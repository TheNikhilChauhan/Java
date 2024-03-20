import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = in.nextInt();

        /* if(num % 2 == 0){
            System.out.println(num + " is an Even number");

        }else{
            System.out.println(num + " is an odd number");
        } */

        //terniary 
        String ans;
        ans = (num % 2 == 0) ? "even" : "odd";
        System.out.println(ans);
    }
}
