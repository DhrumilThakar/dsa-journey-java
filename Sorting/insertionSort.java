public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};
        for(int i =0;i<arr.length;i++){
            int temp = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}