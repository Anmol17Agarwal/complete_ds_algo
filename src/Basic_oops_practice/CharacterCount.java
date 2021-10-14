package Basic_oops_practice;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        String d=sc.next();
        int count=0;
        char x=d.charAt(0);
        for (int i = 0; i < input.length() ; i++) {
            char c=input.charAt(i);
            if (c == x) {
                count++;
            }
        }
        System.out.println(count);
    }
}
