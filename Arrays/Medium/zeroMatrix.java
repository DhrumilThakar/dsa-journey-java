//Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix..

public class zeroMatrix {
     public static int[][] matrix(int[][] arr){
          int[] row = new int[arr.length];
        int[] col = new int[arr[0].length];
          for(int i =0;i<arr.length;i++){
               for(int j =0;j<arr[i].length;j++){
                    if(arr[i][j]==0){
                         row[i]=1;
                         col[j]=1;
                    }
               }
          }
          for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (row[i] == 1 || col[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
          return arr;
     }
     public static void main(String[] args) {
          int[][] arr ={{1,1,1},{1,0,1},{1,1,1}};
          int[][] result = matrix(arr);
          for (int[] row : result) {

            for (int val : row) {
                System.out.print(val + " ");
            }

            System.out.println();
        }
     }
}
