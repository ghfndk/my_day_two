package ch03_array;

public class MyAttay02 {
    public static void main(String[] args) {
        int[] a=new int[3] ;
        a[0] = 10 ;
        a[1] = 20 ;
        a[2] = 30 ;
        for (int i = 0; i < a.length ; i++) {
            System.out.print("a["+i+"]="+a[i]+", ");
        }
    }
}
