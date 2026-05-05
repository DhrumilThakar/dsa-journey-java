public class extendKadanesAlgo {

     public static void kadanesAlgorithm(int[] arr){
          int maxSum = Integer.MIN_VALUE;
          int sum = 0;
          int start =0;
          int subStart =-1;
          int subEnd = -1;

          for(int i =0;i<arr.length;i++){
               if(sum==0){
                    start=i;
               }
               sum+=arr[i];
               if(sum>maxSum){
                    maxSum = sum;
                    subStart=start;
                    subEnd = i;
               }
               else if(sum<0){
                    sum =0;
               }
          }
          System.out.println(maxSum);
          for(int i =subStart;i<=subEnd;i++){
               System.out.print(i+" ");
          }
     }
     public static void main(String[] args) {
          int[] arr = {2, 3, 5, -2, 7, -4};
          kadanesAlgorithm(arr);
     }
}
