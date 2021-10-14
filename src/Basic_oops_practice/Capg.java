package Basic_oops_practice;

import java.util.Scanner;

public class Capg {
    public static void areaOfCircle(double radius)
    {
        if(radius>=2 && radius<=100)
        {
            System.out.println(3.14*radius*radius);
        }
        else{
            System.out.println("Invalid");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius =scanner.nextDouble();


        areaOfCircle(radius);
    }
}
