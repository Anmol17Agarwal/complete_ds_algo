package Basic_oops_practice;

import java.util.Scanner;

public class Solution_ACS1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arr[]=new int[128];
        String str1=scanner.next().toLowerCase();
        String str2=scanner.next().toLowerCase();
        for (int i = 0; i <str1.length() ; i++) {
            char ch1=str1.charAt(i);
            arr[ch1]++;
        }

        for (int i = 0; i <str2.length() ; i++) {
            char ch2=str2.charAt(i);
            arr[ch2]--;
            if(arr[ch2]<0)
            {
                System.out.println("Not An Anagram");
                break;
            }
        }
        System.out.println("Its an Anagram");
    }
}
