/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.*/

import java.util.*;

public class majorityElement {
     public static int brutForce(int[] arr){
          int n = arr.length;
          int result = n/2;
          for(int i=0;i<arr.length;i++){
               int count =0;
               for(int j =0;j<arr.length;j++){
                    if(arr[j]==arr[i]){
                         count++;
                    }
               }
               if(count>result){
                    return arr[i];
               }
          }
          return -1;
     }

     public static int better(int[] arr){
          int n = arr.length;
          HashMap<Integer,Integer> map = new HashMap<>();
          for(int i:arr){
           map.put(i, map.getOrDefault(i, 0) + 1);
          }
          for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return -1;
     }

     public static int optimal(int[] arr){
          int count =0;
          int element=0;
          for(int i =0;i<arr.length;i++){
               if(count==0){
                    count=1;
                    element = arr[i];
               }
               else if(arr[i] == element){
                    count++;
               }
               else{
                    count--;
               }
          }
          for(int i =0;i<arr.length;i++){
               if(arr[i]==element){
                    count++;
               }
          }
          if(count>(arr.length)/2){
               return element;
          }
          return -1;
     }
     public static void main(String[] args) {
          int[] arr ={3,2,3};
          System.out.println(brutForce(arr));
          System.out.println(better(arr));
          System.out.println(optimal(arr));
     }
}