import java.util.Scanner;

class Algebra {

    int a; int b;

    Algebra(int x, int y){
        System.out.println("This is a constructor");
        a = x;
        b = y;
    }
    int add (){
        int ans = a + b;
        return ans;
    }
    int sub(){
        return a - b;
    }
    int multiply(){
        return a * b;
    }
}

public class Constructor {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        // Creating object
        Algebra obj = new Algebra(x,y);

        System.out.println("Sum of input numbers is: ");
        int add = obj.add();
        System.out.println(add);

        System.out.println("Subtraction of input numbers is: ");
        int sub = obj.sub();
        System.out.println(sub);

        System.out.println("Multiplication of input numbers is: ");
        int multiply = obj.multiply();
        System.out.println(multiply);

        // Object 2
        Algebra obj2 = new Algebra(x, y);
        System.out.println("Multiplication of input numbers is: ");
        int mult = obj2.multiply();
        System.out.println(mult);

    }
}
