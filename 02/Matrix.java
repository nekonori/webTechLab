
import java.util.*;

public class Matrix {

    static void printMatrix(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void mulMatrix(int[][] a, int[][] b) {
        int c[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static void printTranspose(int[][] mat){
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for matrix size (nxn): ");
        int n = sc.nextInt();
        int a[][] = new int[n][n], b[][] = new int[n][n], c[][] = new int[n][n];
        System.out.println("Enter elements of matrix A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                c[i][j] = a[i][j];
            }
        }
        System.out.println("Enter elements of matrix B: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
                c[i][j] += b[i][j];
            }
        }
        System.out.println("A + B matrix: ");
        printMatrix(c);
        System.out.println("A * B matrix: ");
        mulMatrix(a, b);
        System.out.println("Transpose of matrix A: ");
        printTranspose(a);
    }
}
