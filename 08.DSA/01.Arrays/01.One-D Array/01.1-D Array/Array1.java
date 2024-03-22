// Declaration and Initialization

// Syntax: int[] myArray = new int[5];
// int myArray[] = new int[5];
// int[] myArray = {1,2,3,4,5}

public class Array1{

    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int[] myArray = new int[5];

        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 8;
        myArray[3] = 2;
        myArray[4] = 10;
        myArray[2] = 3; // updated array
        // myArray[5] = 9;  index out of bounds
        printArray(myArray);

        int[] array2 = {1,2,3,4,5};
        printArray(array2);
    }
    public static void main(String[] args) {
        Array1 arr = new Array1();
        arr.arrayDemo();

    }
}