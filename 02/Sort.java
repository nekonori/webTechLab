// print the 5th largest and 3rd smallest element in array
import java.util.*;

public class Sort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter no. " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("5th largest element: " + arr[arr.length - 5]);
        System.out.println("3rd smallest element: " + arr[2]);
    }
}
