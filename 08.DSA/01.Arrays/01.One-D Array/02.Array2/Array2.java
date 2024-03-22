// Remove even integers from an array

public class Array2 {

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] removeEven(int[] arr){
        int n = arr.length;
        int oddCount = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 != 0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int index = 0;
        for(int i = 0; i< n; i++){
            if(arr[i] % 2 != 0){
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        printArray(removeEven(arr));
    }
}
