//Given an N * N 2D integer matrix, rotate the matrix by 90 degrees clockwise. The rotation must be done in place, meaning the input 2D matrix must be modified directly..
public class rotateMatrix{

     public static void rotateMatrixBy90(int[][]arr){
          int n = arr.length;
          for(int i =0;i<n;i++){
               for(int j =i;j<arr[i].length;j++){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] =temp;
               }
          }

          for(int i =0;i<n;i++){
               int start = 0;
               int end = n-1;
               while(start<=end){
                    int temp = arr[i][start];
                    arr[i][start]=arr[i][end];
                    arr[i][end] = temp;
                    start++;
                    end--;
               }
          }
     }
     public static void main(String[] args) {
          int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
          rotateMatrixBy90(arr);
          System.out.print("[");
          for(int [] i :arr){
               System.out.print("[");
               for(int j:i){
                    System.out.print(j+" ");
               }
               System.out.print("]");
          }
          System.out.print("]");
     }
}
