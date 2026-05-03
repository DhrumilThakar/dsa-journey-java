//Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

public class checkArraySorted {

    public static boolean checkArraySorted(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,6,7,8};
        System.out.println(checkArraySorted(arr));
    }
}