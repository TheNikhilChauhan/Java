// Using continue keyword

public class ContinueKeyword {
    public static void main(String[] args) {
        for(int num = 1; num <= 50; num++){
            if(num % 3 == 0){
                continue;
            }
            System.out.println(num);
        }

        // levels
        // outer: for(int i = 0; i < 10; i++){
        //     inner: for(int j = 0; j < 5; j++){
        //         break outer;
        //     }
        // }
    }    
}
