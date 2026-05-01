import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        for(int i=5;i>=1;i--){
            for(char c = 'A';c<'A'+i;c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
