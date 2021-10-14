package Basic_oops_practice;

import java.util.Scanner;
import java.util.regex.*;
public class String_word
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.endsWith(".") || str.endsWith(",") || str.endsWith("?") || str.endsWith("!"))
        {
            String[] words = str.split(" ");

            int count=0;
            String regex="\\d+";
            for (int i = 0; i < words.length; i++) {
                //words[i] = words[i].replaceAll("[^\\w]", "");
                if(!words[i].matches(regex)){
                    count++;

           }
            }
            System.out.println(count);
        }
        else{
            System.out.println(0);
        }
    }
}
