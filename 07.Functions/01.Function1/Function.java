import java.util.Scanner;

class Algebra {
    int add (int a, int b){
        int ans = a + b;
        return ans;
    }
}

public class Function {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        System.out.println("Sum of input numbers is: ");
        int ans = obj.add(x,y);
        System.out.println(ans);
    }
}
