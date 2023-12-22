import java.util.Arrays;
import java.util.Scanner;

public class fuc_1 {
//1find the square of any number.
    public static double powr(double n){
        return Math.pow(n,2);
    }
//2swap two numbers.
    public static void swap(int n1,int n2){
        System.out.println("Before swapping: n1 = "+n1+", n2 = "+n2);
        int temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("After  swapping: n1 = "+n1+", n2 = "+n2);
    }
//3 check if a given number is even or odd.
    public static String even_odd(int n){
        return n%2==0?"The entered number is even. ":"The entered number is odd. ";
    }
//4find the sum of the series 1!/1+2!/2+3!/3+4!/4+5!/5
    public static long series(int n){
        long series=0;
        for (int i = 1; i <= n; i++) {
            long prd=1;
            for (int j = 1; j <= i; j++) {
                prd*=j;
            }
            series+=prd/i;
        }
        return series;
    }
//5check whether a number is a prime number or not
    public static String isPrime(int n){
        for (int i = 2; i < n; i++) {
            if (n%i==0) return "The number "+n+" is not a prime number.";
        }
        return "The number "+n+" is a prime number.";
    }
//6get the largest element of an array
    public static void Print_max_from_arr(int n){
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input "+n+" elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for (int i = 0; i < n; i++) {
            max=max>arr[i]?max:arr[i];
        }
        System.out.println("The largest element in the array is : "+max);
    }
//7check whether two given strings are an anagram
    public static String isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return string1+" and "+string2+" are not Anagram.";
        }
        char[] a1 = string1.toCharArray();
        char[] a2 = string2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1, a2)){
            return string1+" and "+string2+" are Anagram.";
        }
        else return string1+" and "+string2+" are not Anagram.";
    }
//8find the maximum and minimum of some values
    public static int[] scan_nums_toArray(int n){
        System.out.println("Input "+n+" values:");
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void print_Arr_max_min(int[] arr){
        System.out.println("Your values: ");
        int max=arr[0];int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            max=max>arr[i]?max:arr[i];
            min=min<arr[i]?min:arr[i];
            System.out.print(arr[i]);
            if(i!=arr.length-1) System.out.print(",");
        }
        System.out.println();
        System.out.println("Minimum value is: "+max);
        System.out.println("Minimum value is: "+min);
    }
    public static int product (int n,int m){
        return n*m;
    }

    //main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(isPrime(a));
        System.out.println(series(a));
        System.out.println(even_odd(a));
        Print_max_from_arr(a);
        print_Arr_max_min(scan_nums_toArray(a));
        String str1 = "cspea";
        String str2 = "scaep";
        System.out.println(isAnagram(str1,str2));

    }
}
