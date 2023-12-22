package array;

public class arr8 {
    public static void main(String[] args) {
        int[]arr1={2,3,4,5,6,8,9,5,11,13,16};
        int cout = 0;

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]%2!=0) cout++;
        }

        int[] odds=new int[cout];
        int cout1=0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]%2!=0) {
                odds[cout1]=arr1[i];
                System.out.print(odds[cout1]+"\t");
                cout1++;
            }
        }
    }

}
