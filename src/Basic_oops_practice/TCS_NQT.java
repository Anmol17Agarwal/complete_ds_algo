package Basic_oops_practice;

import java.util.Scanner;

public class TCS_NQT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<=1000000)
        {
            if(num%10>5) {
                System.out.println(num+(10-(num%10)));
            }
            else {
                System.out.println(num-(num%10));
            }
            }
        else {
            System.out.println("Wrong Input");;
        }

    }
}
