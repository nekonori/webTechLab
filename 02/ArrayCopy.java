import java.util.*;


public class ArrayCopy {
public static void main(String[] args)    {
    Scanner sc = new Scanner(System.in);
    int[] arr1 = {1,2,3,4,5,6,7,8,9};
    int[] arr2 = {9,8,7,6,5,4,3,2,1};
    int srcPos, destPos, len;
    System.out.print("Enter src pos: ");
    srcPos = sc.nextInt();
    System.out.print("Enter dest pos: ");
    destPos = sc.nextInt();
    System.out.print("Enter len: ");
    len = sc.nextInt();
    System.arraycopy(arr1, srcPos, arr2, destPos, len);
    for(int i=0;i<arr1.length;i++)
        System.out.print(arr1[i] + " ");
    System.out.println();
    for(int i=0;i<arr2.length;i++)
        System.out.print(arr2[i] + " ");
}
}
