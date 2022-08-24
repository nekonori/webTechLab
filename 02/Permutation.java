import java.util.*;

public class Permutation {
    static int fact(int x){
        if(x <= 1)
            return 1;
        return x * fact(x-1);
    }
    static int perm(int n, int r){
        return fact(n)/fact(n-r);
    }
    static int comb(int n, int r){
        return perm(n, r)/fact(r);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, r;
        System.out.print("n: ");
        n = sc.nextInt();
        System.out.print("r: ");
        r = sc.nextInt();
        System.out.println("nPr = " + perm(n, r));
        System.out.println("nCr = " + comb(n, r));
    }
}
