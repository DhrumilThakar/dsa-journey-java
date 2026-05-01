import java.util.*;

public class pattern18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 0;i<n;i++){
            for(char c =(char) ('E'- i);c<='E';c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}