package Basic_oops_practice;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Solution2{
    static int first(int arr[], int low, int high, int x, int n)
    {
        if (high >= low) {

            int mid = low + (high - low) / 2;

            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x)
                return mid;
            if (x > arr[mid])
                return first(arr, (mid + 1), high,
                        x, n);
            return first(arr, low, (mid - 1), x, n);
        }
        return -1;
    }
    static void sortAccording(int A1[], int A2[], int m, int n)
    {
        int temp[] = new int[m], visited[] = new int[m];
        for (int i = 0; i < m; i++) {
            temp[i] = A1[i];
            visited[i] = 0;
        }
        Arrays.sort(temp);
        int ind = 0;
        for (int i = 0; i < n; i++) {
            int f = first(temp, 0, m - 1, A2[i], m);
            if (f == -1)
                continue;
            for (int j = f; (j < m && temp[j] == A2[i]);
                 j++) {
                A1[ind++] = temp[j];
                visited[j] = 1;
            }
        }
        for (int i = 0; i < m; i++)
            if (visited[i] == 0)
                A1[ind++] = temp[i];
    }
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int size1=scanner.nextInt();
        int size2=scanner.nextInt();

        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        for (int i = 0; i <size1 ; i++) {
            arr1[i]=scanner.nextInt();
        }
        for (int j = 0; j <size1 ; j++) {
            arr2[j]=scanner.nextInt();
        }
        int m = arr1.length;
        int n = arr2.length;
        System.out.println("Sorted array is ");
        sortAccording(arr1, arr2, m, n);
        printArray(arr1, m);
    }
}


