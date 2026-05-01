import java.util.*;

public class pattern14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        for(int i=1;i<=n;i++){
            for(char c = 'A';c<'A'+i;c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}