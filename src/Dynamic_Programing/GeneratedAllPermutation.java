package Dynamic_Programing;

/*
* input ="abc"
* output="abc","acb","bac","bca","cab","cba"
*
* Explanation:
* length of given string is 3,so output combination will be of 3!.
* Now, keeping each word fixed and calling recusion again
* ("abc","") -> ("bc","a") -> ("c","ab") -> ("","abc") || REACHED AT BASE CONDITION
*               ("bc","a") -> ("b","ac") -> ("","acb") || REACHED AT BASE CONDITION
* ("abc","") -> ("ac","b") -> ("c","ba") -> ("","bac") || REACHED AT BASE CONDITION
*               ("ac","b") -> ("a","bc") -> ("","bca") || REACHED AT BASE CONDITION
* ("abc","") -> ("ab","c") -> ("b","ca") -> ("","cab") || REACHED AT BASE CONDITION
*               ("ab","c") -> ("a","cb") -> ("","cba") || REACHED AT BASE CONDITION
*/



public class GeneratedAllPermutation {
    public static void gen(String inp, String out) {
        if (inp.length() == 0) {
            System.out.println(out);
            return;
        }
        for (int i = 0; i < inp.length(); i++) {
            char cc=inp.charAt(i);
            gen(inp.substring(0,i)+inp.substring(i+1), out+cc);
        }
    }

    public static void main(String[] args) {
        gen("abc","");
    }
}

