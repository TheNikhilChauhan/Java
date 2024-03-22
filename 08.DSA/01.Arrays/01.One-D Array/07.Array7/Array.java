// Resize an Array

public class Array {

    public void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] resizeArray(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        Array a = new Array();
        int[] arr = {5,1,6,8,4};
        a.printArray(resizeArray(arr, 9));
    }
}
