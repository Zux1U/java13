package homework;

public class homework2_8 {
    public static void main(String[] args) {
        String tmp;
        String[] arr = {"A","B","C","D","E","F"};
        for(int i = 0; i < arr.length/2; i++){
            tmp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i];
            arr[i] = tmp;
        }
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
