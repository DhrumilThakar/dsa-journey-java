//Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.

public class nextPermutation {
     public static void permutation(int[] arr){
          int index=-1;

          for(int i =arr.length-2;i>=0;i--){
               if(arr[i]<arr[i+1]){
                    index =i;
                    break;
               }
          }

          if(index ==-1){
               reverse(arr,0,arr.length-1);
               return;
          }

          for(int i =arr.length-1;i>index;i--){
               if(arr[i]>arr[index]){
                    swap(arr,i,index);
                    break;
               }
          }

          reverse(arr,index+1,arr.length-1);
     }

     public static void reverse(int[] arr,int start, int end){
          while(start<end){
               swap(arr,start,end);
               start++;
               end--;
          }
     }
     public static void swap(int[] arr,int i,int j){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
     }
     public static void main(String[] args) {
      int[] nums = {1, 2, 3};
      permutation(nums);
       for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
     }
}
