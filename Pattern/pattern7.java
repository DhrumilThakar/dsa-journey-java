import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i =0;i<n;i++){
            for(int j = 0;j<(n-i-1);j++){ //Space
                System.out.print(" ");
            }
            for(int k =0;k<(2*i+1);k++){ //Space
                System.out.print("*");
            }
            for(int j = 0;j<(n-i-1);j++){ //Space
                System.out.print(" ");
            }
            System.out.println();
        }
    }   
}