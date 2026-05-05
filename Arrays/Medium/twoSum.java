/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/

import java.util.*;
public class twoSum {
     public static int[] two(int[] arr,int n){
          int[] result = new int[2];
          for(int i =0;i<arr.length;i++){
               for(int j =i+1;j<=arr.length-1;j++){
                    if(arr[i]+arr[j]==n){
                         result[0]=i;
                         result[1]=j;
                    }
               }
          }
          return result;
     }

     public static int[] better(int[] arr,int n){
          HashMap <Integer, Integer> map = new HashMap<>();
          for(int i = 0;i<arr.length;i++){
               int remainder = n - arr[i];
               if(map.containsKey(remainder)){
                    return new int[] {map.get(remainder),1};
               }
               map.put(arr[i], i);
          }
          return new int[] {-1,1};
     }

     public static int[] optimal(int[] arr,int n){
          int[] result= new int[2];

        for(int left =0,right=1;right<arr.length-1;++right){
            if(arr[left]+arr[right]==n){
                result[0]=left;
                result[1]=right;
                break;
            }
            left++;
        }
        return result;
     }
     public static void main(String[] args) {
          int[] arr = {2,7,11,15};
          int target = 9;
          int[] result = optimal(arr, target);
          for (int i : result) {
               System.out.print(i+" ");
          }
     }
}
//Time Complexity = O(n);
//Space Complexity  = O(1);