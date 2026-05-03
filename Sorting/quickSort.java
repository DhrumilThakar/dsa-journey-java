public class quickSort {

    public static int divide(int[] arr,int low,int high){
        int pivot = arr[high];
        int i =low-1;
        for(int j = low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void quick(int [] arr, int low,int high){
        if(low<high){
            int pivotIndex = divide(arr, low, high);

            quick(arr, low, pivotIndex - 1);

            quick(arr, pivotIndex + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quick(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}