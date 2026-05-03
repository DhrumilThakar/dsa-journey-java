//Given an array of integers, rotating array of elements by k elements either left or right.
public class leftRotateKPlaces {
    public static void rotateByKPlaces(int[] arr,int k){
        int n = arr.length;
        if (n==0 || k == 0) return ;

        k = k%n;

        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    public static void reverseArray(int[] arr, int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5, 6, 7};
        int k=2;

        rotateByKPlaces(arr, k);

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
