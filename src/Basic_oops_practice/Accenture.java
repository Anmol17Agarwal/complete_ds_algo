package Basic_oops_practice;

import java.util.Scanner;

public class Accenture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scanner.nextInt();
        }


        int high=0;int low=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<low)
            {
                low=arr[i];
            }
            if(high<arr[i])
            {
                high=arr[i];
            }
        }
        int gcd=1;
        for (int j = 1; j <=high && j<=low ; j++) {
            if(high%j==0 && low%j==0)
            {
                gcd=j ;
            }
        }
        System.out.println(gcd);
    }
}
