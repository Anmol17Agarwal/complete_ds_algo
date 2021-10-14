package String;

public class repeated {
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
