// Find minimum value in array

public class Array {
    
    public static int minValue(int[] arr){
        int index = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < index){
                index = arr[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {11,22,13,4,5,6};
        System.out.println(minValue(arr));
    }
}
