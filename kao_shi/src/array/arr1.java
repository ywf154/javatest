package array;

public class arr1 {

    public static void main(String[] args) {
        int[]arr1={23,-45,54,-98,-12,45};
        int[]arr2={-56,-25,79,23,-43,89};
        int k =10;
        System.out.println("before:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+"\t");
        }
        System.out.println();

        System.out.println("after:");
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]>0) {arr1[i]-=k;}
            System.out.print(arr1[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]>0) {arr2[i]+=k;}
            System.out.print(arr2[i]+"\t");
        }

    }
}
