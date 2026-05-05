//Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order. The sorting must be done in-place, without making a copy of the original array.


public class sortAnArray {
     public static void optimal(int[] arr){
          int low =0;
          int mid =0;
          int high = arr.length-1;
          while(mid<=high){
               if(arr[mid]==0){
                    int temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    low++;
                    mid++;
               }
               else if(arr[mid]==2){
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
               }
               else{
                    mid++;
               }
          }
     }
     public static void main(String[] args) {
          int[] arr = {1, 0, 2, 1, 0};
          optimal(arr);
          for(int i: arr){
               System.out.print(i+" ");
          }
     }     
}