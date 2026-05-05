public class subArraySum {

    public static int burtForce(int[] arr, int num){
        int length =0;
        for(int i =0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                int sum =0;
                for(int k = i;k<j;k++){
                    sum+=arr[k];
                }
                if(sum==num){
                  length = Math.max(length,j-i);
                }
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int num = 15;
        System.out.println(burtForce(arr, num));
    }
}
