/* Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements. */

public class secondLargestElement {

    public static int findSecondLargestElement(int[] arr){
        int max = arr[0];
        int secondmax = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                secondmax = max;
                max = arr[i];
            }
        }
        return secondmax;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 8, 5};
        System.out.print(findSecondLargestElement(arr));
    }
}