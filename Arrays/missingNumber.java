//Given an array arr[] of size n-1 with distinct integers in the range of [1, n]. This array represents a permutation of the integers from 1 to n with one element missing. Find the missing element in the array.

public class missingNumber {

    public static int isPresent(int[] arr){
        int[] temp = new int[arr.length+2];

        for(int i =0;i<arr.length;i++){
            temp[arr[i]]++;
        }

        for(int i =1;i<=arr.length+1;i++){
            if(temp[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};

        System.out.print(isPresent(arr));

    }
}

//Used Approach is counting Frequencies
//Time Complexity = O(n)
//Space Complexity = O(n)