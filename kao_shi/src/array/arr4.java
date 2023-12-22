package array;

public class arr4 {
    public static void main(String[] args) {
        int[]arr1={-2,3,-4,5,-6,8,-9,-5,10};
        double sum_pos =0;
        double sum_neg =0;
        int cou_pos=0;
        int cou_neg=0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]>0){
                sum_pos+=arr1[i];
                cou_pos++;
            }
            else{
                sum_neg+=arr1[i];
                cou_neg++;
            }
        }
        double avg_pos=sum_pos/cou_pos;
        double avg_neg=sum_neg/cou_neg;
        System.out.println("the arithmetic mean of the positive elements of the array:"+avg_pos);
        System.out.println("the arithmetic mean of the negative elements of the array:"+avg_neg);
    }
}
