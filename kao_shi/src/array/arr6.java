package array;

public class arr6 {
    public static void main(String[] args) {
        int[]arr1= {23,-45,54,-98,-12,45};
        int[]arr2={-56,-25,79,23,-43,89};
        int sum =0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]<0){
                sum+=arr1[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]<0){
                sum+=arr2[i];
            }
        }
        System.out.println("The sum of the negative elements of array A and B:"+sum);
    }
}
