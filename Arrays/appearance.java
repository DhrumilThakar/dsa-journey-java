// Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

public class appearance {
    public static int getSingleElement(int[] arr){
    int xor = 0;
    for(int i = 0; i < arr.length; i++){
        xor ^= arr[i];
    }
    return xor;
}
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};

        System.out.print(getSingleElement(arr));
    }
}
//Used XOR approach
//Time Complexity = O(n)
//Space Complexity = O(1)