import java.util.Scanner;

public class quadratic_equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        System.out.println(positivePart(num1,num2,num3));
        System.out.println(negativePart(num1,num2,num3));
    }
    public static double positivePart(int num1,int num2,int num3)
    {
        double positive = (-num2+(Math.sqrt(num2*num2)-(4*num1*num3)))/(2*num1);
        return positive;
    }
    public static double negativePart(int num1,int num2,int num3)
    {
        double negative = (-num2-(Math.sqrt(num2*num2)-(4*num1*num3)))/(2*num1);
        return negative;
    }
}
