public class secondLargestElement {

    public static int findSecondLargestElement(int[] arr){
        int max = arr[0];
        int secondmax = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                secondmax = max;
                max = arr[i];
            }
        }
        return secondmax;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 8, 5};
        System.out.print(findSecondLargestElement(arr));
    }
}