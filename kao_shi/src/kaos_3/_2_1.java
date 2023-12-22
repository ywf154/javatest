package kaos_3;

public class _2_1 {
    public static void swap(int n1,int n2){
        int temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("After  swapping: n1 = "+n1+", n2 = "+n2);
    }
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 4;
        System.out.println("Before swapping: n1 = "+n1+", n2 = "+n2);
        swap(n1,n2);
    }
}
