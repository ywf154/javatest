import java.util.Scanner;
public class _2DArr_1 {
    public static void main(String[] args) {
        System.out.println("Input the grades of 10 students");
        Scanner sc = new Scanner(System.in);
        int[][] group = new int[2][5];
        for (int i = 0; i < 10; i++) {
            if(i<5) group[0][i]=sc.nextInt();
            else group[1][i-5]=sc.nextInt();
        }
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < 5; i++) {
            sum1+=group[0][i];
            sum2+=group[1][i];
        }
        double avg1=sum1/5;
        double avg2=sum2/5;
        System.out.println("Average for group 1 is "+avg1);
        System.out.println("Average for group 2 is "+avg2);
    }
}
