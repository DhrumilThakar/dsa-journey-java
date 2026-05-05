//Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.

public class kadanesAlgo {
     public static int subArraySum(int[] arr) {
          int maxSum = 0;
          for (int i = 0; i < arr.length; i++) {
               for (int j = i + 1; j < arr.length; j++) {
                    int sum = 0;
                    for (int k = i; k < j; k++) {
                         sum += arr[k];
                    }
                    maxSum = Math.max(maxSum, sum);
               }
          }
          return maxSum;
     }

     public static int better(int[] arr) {
          int maxSum = 0;
          for (int i = 0; i < arr.length; i++) {
               int sum = 0;
               for (int j = i; j < arr.length; j++) {

                    sum += arr[j];
                    maxSum = Math.max(maxSum, sum);
               }
          }
          return maxSum;

     }

     public static int optimal(int[] arr){
          int maxSum = Integer.MIN_VALUE;
          int sum = 0;

          for(int i =0;i<arr.length;i++){
               sum+=arr[i];
               if(sum>maxSum){
                    maxSum = sum;
               }
               else if(sum<0){
                    sum=0;
               }
          }
          return maxSum;
     }

     public static void main(String[] args) {
          int[] arr = { 2, 3, 5, -2, 7, -4 };
          System.out.println(subArraySum(arr));
          System.out.println(better(arr));
          System.out.println(optimal(arr));

     }

}