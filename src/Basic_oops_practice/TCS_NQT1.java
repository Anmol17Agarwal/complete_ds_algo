package Basic_oops_practice;

import java.util.Scanner;

public class TCS_NQT1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char current = 'N';
        String str = scanner.next();
        int len = str.length();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            current=direction(ch,current);

        }
        System.out.println(current);
    }
    public static char direction(char ch,char current){
        if(ch=='L' && current=='N')
            return 'W';
        else if(ch=='R' && current=='N')
            return 'E';
        else if(ch=='L' && current=='S')
            return 'E';
        else if(ch=='R' && current=='S')
            return 'W';
        else if(ch=='L' && current=='E')
            return 'N';
        else if(ch=='R' && current=='E')
            return 'S';
        else if(ch=='L' && current=='W')
            return 'S';
        else
            return 'N';
    }
}