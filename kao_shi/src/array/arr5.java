package array;

public class arr5 {
    public static void main(String[] args) {
        int[]arr1={-2,3,-4,5,-6,8,-9,-5,8};
        int sum_pos =0;
        int sum_neg =0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]>0){
                sum_pos+=arr1[i];
            }
            else{
                sum_neg+=arr1[i];
            }
        }
        System.out.println("the sum of the positive elements of the array:"+sum_pos);
        System.out.println("the sum of the negative elements of the array:"+sum_neg);
    }
}
