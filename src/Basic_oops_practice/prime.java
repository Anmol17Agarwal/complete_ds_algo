package Basic_oops_practice;

import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            if(primeNumber(arr[i]))
                System.out.println(arr[i]);
        }
    }
        public static boolean primeNumber(int N)
        {
            int flag=0;
            if(N==0 || N==1)
            {
                return false;
            }
            for (int i = 2; i <=N/2 ; i++) {
                if(N%i==0)
                {
                    flag+=1;
                    break;
                }
            }
            if(flag==0)
                return true;
            else
                return false;
        }
    }

