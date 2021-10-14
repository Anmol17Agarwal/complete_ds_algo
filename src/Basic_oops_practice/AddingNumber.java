package Basic_oops_practice;



import java.util.Scanner;

class AddingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        int k = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

    }

    public void addingNumber(int size, int arr[], int k) {

        int num1=arr[0];
        int num2=arr[1];
        int sum=num1+num2;
        int value=sum*k;
        int j=2;
        while (k>0)
        {
            int next=findMinimumTwo(sum,arr[j],arr[j++]);
            sum+=next;
            value+=next*k;
            k--;
        }
        value+=sum*k;
    }

    public int findMinimumTwo(int sum, int num1, int num2) {
        if (sum > num1)
            return num1 + num2;
        else
            return sum + num1;
    }
}