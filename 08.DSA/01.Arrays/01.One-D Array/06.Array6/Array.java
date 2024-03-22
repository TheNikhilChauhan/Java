// Move all 0's at the end of array

public class Array {

    public static int[] moveZeros(int[] arr){
        int[] result = new int[arr.length];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0 ){
                result[index] = arr[i];
                index++;
            }
        }
        for(int i = index; i < arr.length; i++){
            result[i] = 0;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,4,12};
        int[] result = moveZeros(arr);
        for(int i : result){
            System.out.print(i + " ");
        }
        
    }
}
