package Basic_oops_practice;

import java.util.Scanner;

public class Solution_ACS {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scanner.nextInt();
        }
        int temp=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            }
        System.out.println(arr[size-2]);
        }
    }

