package array;

public class arr2 {
    public static void main(String[] args) {
        int G=40;
        int E=60;
        int[]arr1={23,45,54,98,12,45,78};
        int sum=0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]<=E && arr1[i]>=G){
                sum+=arr1[i];
            }
        }
        System.out.println(sum);
    }


}
