// Print first multiple of 5 which is also a multiple of 7. Also using "Break keyword"

public class PrintMultiple {
    public static void main(String[] args) {
        
        int num = 1;

        while(true){
            if((num % 5 == 0) && (num % 7 == 0)){
                System.out.println("Found ans: " +num);
                break;
            }
            num++;
        }
    }
}
