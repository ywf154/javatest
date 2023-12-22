import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class _2DArr_5 {
    public static void main(String[] args) {
        ThreadLocalRandom tLRandom = ThreadLocalRandom.current();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n and m");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];
        System.out.println("Matrix A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = tLRandom.nextInt(-30, 31);
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        long[] prd = new long[A.length];
        System.out.println("the product of positive elements in each column of the matrix:");
        for (int i = 0; i < A.length; i++) {
            prd[i] = 1;
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] > 0){ prd[i] *= A[i][j];}
            }
            System.out.println(prd[i]);
        }
    }
}
