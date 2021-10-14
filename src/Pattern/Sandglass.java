package Pattern;

public class Sandglass {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <n ; i++)
        {
            for (int j =1; j <i ; j++)
            {
                System.out.print(" ");
            }
            for (int k =n; k >=i ; k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int l = n; l >=1 ; l--) {
            for (int m = l; m >1 ; m--)
            {
                System.out.print(" ");
            }
            for (int o = n; o>=l ; o--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
