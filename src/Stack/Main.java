package Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operations operations = new Operations();

        while (true) {
            System.out.println("Press 1 to push a element in Stack");
            System.out.println("Press 2 to pop a element in Stack");
            System.out.println("Press 3 to peek a top element in Stack");
            System.out.println("Press 4 to check whether Stack is empty");

            int opt = scanner.nextInt();
            switch (opt) {
                case 1: {
                    System.out.println("enter a value/element");
                    int value = scanner.nextInt();
                    operations.push(value);
                }
                break;
                case 2: {
                    if (operations.pop() == -1)
                        System.out.println("Stack is empty");
                    else
                        System.out.println(operations.pop() + " is poped");
                }
                break;
                case 3: {
                    if (operations.peek() == -1) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println(operations.peek() + " is top element");
                    }
                }
                break;
                case 4: {
                    operations.isEmpty();
                }
                break;
                default: {
                    System.out.println("oops! Wrong option pressed");
                }
            }
        }


    }
}
