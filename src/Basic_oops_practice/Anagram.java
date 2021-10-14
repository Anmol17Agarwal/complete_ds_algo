package Basic_oops_practice;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1=scanner.next().toLowerCase();
        String str2=scanner.next().toLowerCase();

        int[] arr = new int[128];

        for (int i = 0; i <str1.length() ; i++) {
            char ch=str1.charAt(i);
            arr[ch]++;
        }
        int flag=0;
        for (int i = 0; i <str2.length() ; i++) {
            char d=str2.charAt(i);
            arr[d]--;
            if (arr[d] < 0) {
                flag=flag+1;
                break;
            }
        }
        if(flag==0)
        System.out.println("anagram");
        else
            System.out.println("Not an anagram");
        //System.out.println(Arrays.toString(arr));
        //if(arr[]==0)
    }
}
