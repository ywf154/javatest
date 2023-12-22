package array;

public class arr3 {
    public static void main(String[] args) {
        int[]arr1={-2,3,-4,5,-6,8,-9,-5,10};
        int prd=1;
        int cout =0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]>0){
                prd*=arr1[i];
                cout++;
            }
        }
        System.out.println("The product of the positive elements of the array:"+prd);
        System.out.println("count :"+cout);
    }
}
