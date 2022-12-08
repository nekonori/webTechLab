import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of terms >> ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            switch (i) {
                case 0:
                    arr[i] = 0;
                    break;
                case 1:
                    arr[i] = 1;
                    break;
                default:
                    arr[i] = arr[i - 1] + arr[i - 2];
                    break;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
