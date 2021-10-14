package Pattern;
import java.util.*;
public class Hackerearth_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int temp=2*number-1;
        for (int i = 1; i <number ; i++) {
            for (int j =1; j<=temp ; j++) {
                if((j==i)||(j==temp))
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            temp=temp-1;
            System.out.println();
        }
        for (int k = number; k>=1; k--) {
            for (int l = 1; l<=temp ; l++)
            {
                if((l==k)||(l==temp))
                {
                    System.out.print(k);
                }
                else {
                    System.out.print(" ");
                }
            }
            temp=temp+1;
            System.out.println();
        }
    }
}
