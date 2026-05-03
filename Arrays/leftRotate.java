// Given an integer array nums, rotate the array to the left by one.

public class leftRotate {

    public static void left(int[] arr){
        int temp = arr[0];
        for(int i =1;i<arr.length;i++){
            arr[i-1] = arr[i];

        }
        arr[arr.length-1] = temp;
    }
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5};
        left(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}