/*There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.*/

import java.util.*;
public class rearrange {
     public static int[] rearrangeArray(int[] arr){
          List<Integer> pos = new ArrayList<>();
          List<Integer> neg = new ArrayList<>();

          for(int i =0;i<arr.length;i++){
               if(arr[i]>0){
                    pos.add(arr[i]);
               }
               else{
                    neg.add(arr[i]);
               }
          }

          for(int i =0;i<arr.length/2;i++){
               arr[2*i]=pos.get(i);
               arr[2*i+1] =neg.get(i);
          }
          return arr;
     }

     public static int[] rearrangeBySign(int[] arr){
          int n = arr.length;
          int posIndex = 0,negIndex =1;
          int[] ans = new int[n];

          for(int i =0;i<n;i++){
               if(arr[i]<0){
                    ans[negIndex] = arr[i];
                    negIndex+=2;
               }
               else{
                    ans[posIndex] = arr[i];
                    posIndex+=2;
               }
          }
          return ans;
     }
     public static void main(String[] args) {
          int[] arr = {1,2,-4,-5};
          int[] result = rearrangeArray(arr);
          for(int i : result){
               System.out.print(i+" ");
          }
          System.out.println();
          int[] result1 = rearrangeBySign(arr);
          for(int i : result1){
               System.out.print(i+" ");
          }
     }
}