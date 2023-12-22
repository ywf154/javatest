package kaos_3;

public class _1_1 {
    public static void main(String[] args) {
        int[][]arr={  {10,-30,20},
                      {10,50,-40},  };
        int[] product  = new int[arr[0].length];
        for (int i = 0; i < arr[0].length; i++) {
            product[i]=1;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j][i]>0){
                    product[i]*=arr[j][i];
                }
            }
        }
        for(int v:product){
            System.out.println(v);
        }
    }
}
