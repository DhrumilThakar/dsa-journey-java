//Given an array, we have to find the largest element in the array.

public class largestElement {

    public static int findLargestElement(int[] arr) {
        int max = arr[0];  // Initialize max with the first element in the array

        // Iterate through the array to find the maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {  // If the current element is greater than max, update max
                max = arr[i];
            }
        }

        return max;  // Return the largest element found
    }
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 0 };


        System.out.println(findLargestElement(arr));
    }

}