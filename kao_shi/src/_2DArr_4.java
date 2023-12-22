import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class _2DArr_4 {
    public static void main(String[] args) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n and m");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];
        System.out.println("Matrix A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j]= rnd.nextInt(100);
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The maximum of elements in each row of the matrix:");
        int[] max = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            max[i]= A[i][0];
            for (int j = 0; j < A[0].length; j++) {
                max[i] = Math.max(max[i], A[i][j]);
            }System.out.println(max[i]);
        }
    }
}
