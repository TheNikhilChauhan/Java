import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a series");
        int n = in.nextInt();
        int result = 0;

        for(int i = 1; i <=n; i++){
            if (i % 2 == 0){
                result -= i;
            }else{
                result += i;
            }
        }
        System.out.println(result);
    }
}
