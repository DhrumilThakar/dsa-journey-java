import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i =n;i>=1;i--){
            for(int j = 1;j<=(n-i+1);j++){ //Space
                System.out.print(" ");
            }
            for(int k =1;k<=(2*i-1);k++){ //Space
                System.out.print("*");
            }
            for(int j = 1;j<=(n-i+1);j++){ //Space
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
