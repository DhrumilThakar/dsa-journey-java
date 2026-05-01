import java.util.*;

public class pattern22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i =0;i<(2*n-1);i++){
            for(int j =0;j<(2*n-1);j++){
                int top=i;
                int down=(2*n-2)-i;
                int left=j;
                int right=(2*n-2)-j;
                System.out.print(n-Math.min(Math.min(top,down),Math.min(left,right)));
            }
            System.out.println();
        }
    }
}