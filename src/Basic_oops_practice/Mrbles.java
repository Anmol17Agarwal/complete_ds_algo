package Basic_oops_practice;

import java.util.Scanner;

public class Mrbles {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println(findMarbleEffect(size,arr));
    }
    public static int findMarbleEffect(int size,int arr[]) {
        if (size == 0) {
            return 0;
        }
        int value = arr[size - 1] + 1;
        if (value > 9) {
            return findMarbleEffect(size-1, arr);
        } else {
            return size;
        }

    }
}
