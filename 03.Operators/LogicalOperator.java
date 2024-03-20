public class LogicalOperator {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 5;

        // && Operator
        System.out.println((a > b) && (a > c));
        System.out.println((a > b) && (a < c));

        //  || operator
        System.out.println((c < b) && (a < b));
        System.out.println((a > b) && (b > c));
        System.out.println((a < b) && (b < c));

        //  ! operator
        System.out.println(! (a == b));
        System.out.println(! (a > b));
    }
}
