import java.util.Random;

public class _2DArr_2 {
    public static void main(String[] args) {
        int[][] arr1 = {{10,20,30},{40,50,60}};
        int[][] arr2 = new int[arr1[0].length][arr1.length];
        System.out.println("Original Array:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("After changing the rows and columns of the said array:");
        for (int i = 0; i < arr1[0].length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr2[i][j]=arr1[j][i];
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
