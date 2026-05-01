import java.util.*;

public class pattern17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();

        for(int i =0;i<n;i++){
            for(int j =0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char c = 'A';
            int breakPoint = (2*i+1)/2;

            for(int j=1;j<=(2*i+1);j++){
                System.out.print(c);

                if(j<=breakPoint){
                    c++;
                }
                else{
                    c--;
                }
            }

            for(int j =1;j<n-i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}