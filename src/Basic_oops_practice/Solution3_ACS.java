package Basic_oops_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution3_ACS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3="";
        int index=0;
        while(str1.length()>0)
        {
            str3+=str1.charAt(index)+str2.charAt(index);

        }
        modified(str1);
    }

    public static void modified(String str)
    {
        String finalString="";
        for (int i = 0; i < str.length(); i++) {
            int flag=0;
            for (int j=0;j<str.length();j++) {
                if ((str.charAt(i) == str.charAt(j)) && (i != j)) {
                    flag = 1;
                    break;
                }
            }
                if(flag==0)
                {
                    finalString+=str.charAt(i);
                }

        }
        System.out.println(finalString);
    }
}
