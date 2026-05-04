// Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array..

public class consecutiveOnes {

    public static int countingOnes(int[] arr){
        int count=0;
        int max =0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            max = Math.max(max,count);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1};
        System.out.print(countingOnes(arr));
    }
}