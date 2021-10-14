package Basic_oops_practice;

import java.util.Scanner;
class SAP
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M= sc.nextInt();
        int N=sc.nextInt();
        int[][]arr =new int[M][N];
        int max=0;
        for (int i = 0; i <M ; i++)
        {
            for (int j = 0; j < N; j++)
            {
                arr[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i <M ; i++) {
            for (int j = 0; j < N; j++) {

                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }

            System.out.print(max + " ");
            max = 0;
        }
    }
}