package kaos_3;
import java.util.concurrent.ThreadLocalRandom;

import java.util.Scanner;

public class _1 {
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
                A[i][j] = tLRandom.nextInt(-30, 30);
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        long[] prd = new long[m];
        int cout = 0;
        System.out.println("the product of positive elements in each column of the matrix:");
        for (int i = 0; i < m; i++) {
            prd[i] = 1;
            for (int j = 0; j < n; j++) {
                if (A[j][i] > 0){
                    prd[i] *= A[j][i];
                    cout++;}
            }
            System.out.print(prd[i]+"\t\t");
        }
    }
}
