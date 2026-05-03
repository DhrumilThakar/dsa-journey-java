//You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order

public class moveZero {

    public static void moveZeroToEnd(int[] arr){
        int j =-1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] ==0){
                j=i;
                break;
            }
        }

        if(j==-1){
            return;
        }

        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        moveZeroToEnd(arr);
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}