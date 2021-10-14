package Basic_oops_practice;

import java.util.Scanner;

public class perfect_palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int duplicate=num;
        int reverse=0;
        while(num>0)
        {
            int temp=num%10;
            reverse=reverse*10+temp;
            num=num/10;
        }
        int square_root=(int)Math.sqrt(duplicate);
        if((square_root*square_root==duplicate)&&(reverse==duplicate)){

            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }
}
