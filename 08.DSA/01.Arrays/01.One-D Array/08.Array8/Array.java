// Find the missing number in an array from a range of 1 to n

public class Array {

    public int missingNum(int[] arr){
         int n = arr.length + 1;
         int sum = n * (n+1)/2;
         for(int i = 0; i < arr.length; i++){
            sum = sum - arr[i];
         }
         return sum;
    }
    public static void main(String[] args) {
        Array a = new Array();
        int[] arr = {1,2,3,5};
        System.out.println(a.missingNum(arr));
    }
}
