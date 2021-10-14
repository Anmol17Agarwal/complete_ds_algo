package Basic_oops_practice;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int duplicate=num;
        int result=0;
        int power=0;
        while(num>0)
        {
            power++;
            num=num/10;
        }
        num=duplicate;
        while(num>0)
        {
            int temp=num%10;
            result+=Math.pow(temp,power);
            num=num/10;
        }
        if(duplicate==result)
        {
            System.out.println(1);
        }
        else {
            System.out.println(result);
        }
    }
}
