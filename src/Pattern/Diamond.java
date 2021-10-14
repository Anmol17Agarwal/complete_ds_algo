package Pattern;

import java.awt.image.Kernel;

public class Diamond {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <=n ; i++)
        {
            for (int j =n; j >i; j--)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print("* ");
            }
            for (int l = 1; l <i ; l++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int m = 1; m <n ; m++)
        {
            for (int z =1; z <=m ; z++)
            {
                System.out.print("  ");
            }
            for (int o =m; o<n ; o++)
            {
                System.out.print("* ");
            }
            for (int p = m; p <n-1 ; p++)
            {
                System.out.print("* ");
            }
            System.out.println();

            }
        }

        }
