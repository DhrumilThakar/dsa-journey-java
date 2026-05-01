import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        for(int i=0;i<n;i++){
            char ch = (char) ('A'+ i);
            for(int j =0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}