package Basic_oops_practice;

import java.util.Scanner;

public class Secret_code {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S= scanner.nextInt();
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        //BigInteger X=new BigInteger("1000000007");
        int X=1000000007;
        int ans1= (int) Math.pow(S,N)%10;
        int ans2=(int)(Math.pow(ans1, M));
        int ans3=ans2%X;
        System.out.println(ans3);
    }
}
