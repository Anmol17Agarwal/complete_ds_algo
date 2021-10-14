package Recursion;



public class Fibonacci {

    /*
    * fibonacci series -> 1 1 2 3 5 8 13 21 ..... so on
    * basically its adding first number to second number and appending to next of second number.
    * for this base case will be n==1 or n==0
    * for first number we recursively call fun for n-1 where it will stop at 1
    * for second number we recursively call fun for n-2 where it will stop at 0
    * */
    public static int fibonacciPrint1(int number)//for main to base case method
    {
        if(number==1||number==0)
        {
            return number;
        }
        return fibonacciPrint1(number-1)+fibonacciPrint1(number-2);
    }
    public static int fibonacciPrint2(int number)//for main to base case and return base to main
    {
        if(number==1||number==0)
        {
            return number;
        }
        int first_number=fibonacciPrint2(number-1);
        int second_number=fibonacciPrint2(number-2);
        return first_number+second_number;
    }
    public static void main(String[] args) {
        System.out.println(fibonacciPrint1(5));
        System.out.println(fibonacciPrint2(7));
    }
}
