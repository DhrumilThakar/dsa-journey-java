/*Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.

The union of two arrays can be defined as the common and distinct elements in the two arrays.

NOTE: Elements in the union should be in ascending order.*/

import java.util.*;
public class unionOfArrays {
    public static List<Integer> findUnion(int[] arr1,int[] arr2){
        List<Integer> list = new ArrayList<>();
        int n1= arr1.length;
        int n2 = arr2.length;

        int i=0,j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                if(list.isEmpty() || list.get(list.size()-1) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }
            else if(arr1[i]>arr2[j]){
                if(list.isEmpty() || list.get(list.size()-1) != arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
            else{
                if(list.isEmpty() || list.get(list.size()-1) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;j++;
                
            }
        }

        while(i<n1){
            if(list.isEmpty() || list.get(list.size()-1) != arr1[i]){
                    list.add(arr1[i]);
                    
                }
                i++;
        }

        while(j<n2){
            if(list.isEmpty() || list.get(list.size()-1) != arr2[j]){
                    list.add(arr2[j]);
                    
                }
                j++;
        }

        return list;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5}, arr2 = {2,3,4,4,5};
        List<Integer> result = findUnion(arr1, arr2);

        for(int i: result){
            System.out.print(i+" ");
        }
    }
}