//Leader is that element which has all its right side lement less than that.

import java.util.ArrayList;

public class leaderInArray {

     public static int[] brutForce(int[] arr) {
    int[] temp = new int[arr.length];
    int index = 0;

    for (int i = 0; i < arr.length; i++) {

        boolean a = true;

        for (int j = i + 1; j < arr.length; j++) {

            if (arr[j] > arr[i]) {
                a = false;
                break;
            }
        }

        if (a == true) {
            temp[index] = arr[i];
            index++;
        }
    }

    return temp;
}

public static ArrayList<Integer> optimal(int[] arr){
     int max = Integer.MIN_VALUE;
     ArrayList <Integer> list = new ArrayList<>();
     for(int i =arr.length-1;i>=0;i--){
          if(arr[i]>max){
               list.add(arr[i]);
          }
          max = Math.max(max, arr[i]);
     }
     return list;
}
     public static void main(String[] args) {
          int[] arr = {10,22,12,3,0,6};
          int[] result = brutForce(arr);
          for(int i: result){
               System.out.print(i+" ");
          }
          System.out.println();
          ArrayList <Integer> final1 = optimal(arr);
          for(int i =0;i<final1.size();i++){
               System.out.print(final1.get(i)+" ");
          }
     }
}