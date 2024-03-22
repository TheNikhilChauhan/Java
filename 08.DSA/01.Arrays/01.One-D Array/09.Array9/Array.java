// Check if a String is a Palindrome or not

public class Array {

    public static Boolean Palindrome(String a){
        char[] charArray = a.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while(start < end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "that";
        // String a = "level";

        System.out.println(Palindrome(a));
    }    
}
