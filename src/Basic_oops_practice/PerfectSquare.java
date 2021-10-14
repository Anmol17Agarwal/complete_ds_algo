package Basic_oops_practice;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for (int i: arr) {
            if (i >= 0) {
                int sr=(int)Math.sqrt(i);
                if((sr*sr)==i){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
