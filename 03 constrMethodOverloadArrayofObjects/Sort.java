import java.util.*;

class Nums{
    int[] arr;
    Nums(){
        arr = new int[5];
    }
    Nums(int a, int b){
        this();
        arr[0] = a;
        arr[1] = b;
    }
    Nums(int n1, int n2, int n3, int n4, int n5){
        this();
        arr[0] = n1;
        arr[1] = n2;
        arr[2] = n3;
        arr[3] = n4;
        arr[4] = n5;
    }
    void sort(){
        for(int i=1;i<5;i++){
            int key = arr[i];
            int j = i - 1;
            while(j>=0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}

public class Sort {
    static void printNums(Nums n){
        System.out.println(Arrays.toString(n.arr));
    }
    public static void main(String[] args){
        Nums n1 = new Nums();
        Nums n2 = new Nums(53, 4);
        Nums n3 = new Nums(12, 21, 56, 54, 90);
        printNums(n1);
        printNums(n2);
        System.out.println("Before and after sort: ");
        printNums(n3);
        n3.sort();
        printNums(n3);
    }
    
}
