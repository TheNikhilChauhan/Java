
// Return second maximum value in array

public class Array {

    public static int maxValue(int[] arr){
        int max = arr[0];
        int secondMax = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {4,6,7,4,34,4,43,43,41};
        System.out.println(maxValue(arr));
    }    
}
