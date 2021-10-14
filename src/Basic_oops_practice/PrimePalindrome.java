package Basic_oops_practice;

import java.util.Scanner;

public class PrimePalindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int startIndex=scanner.nextInt();
        int endIndex=scanner.nextInt();

        for (int i = startIndex; i <endIndex ; i++) {
            if(primeNumber(i)&&palindrome(i))
            {
                System.out.print(i+",");
            }
        }

    }
    public static boolean primeNumber(int N)
    {
        int flag=0;
        if(N==0 || N==1)
        {
            return false;
        }
        for (int i = 2; i <N/2 ; i++) {
            if(N%i==0)
            {
                flag+=1;
                break;
            }
        }
        if(flag==0)
        return true;
        else
            return false;
    }

    public static boolean palindrome(int N)
    {
        int temp=N;
        int sum=0;
        while(N>0)
        {
           sum=sum*10+N%10;
           N=N/10;
        }
        if(sum==temp)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
