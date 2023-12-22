package array;

public class arr7 {
    public static void main(String[] args) {
        int[]arr1={-2,3,-4,5,-6,8,-9,5,10};
        int cou_pos=0;
        int cou_neg=0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]>0){
                cou_pos++;
            }
            else{
                cou_neg++;
            }
        }
        System.out.println("the arithmetic mean of the positive elements of the array:"+cou_pos);
        System.out.println("the arithmetic mean of the negative elements of the array:"+cou_neg);
    }
}
