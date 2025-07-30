package ch03_array;

public class MyAttay02 {
    public static void main(String[] args) {
        int[] a=new int[3] ;
        a[0] = 10 ;
        a[1] = 20 ;
        a[2] = 30 ;
        for (int i = 0; i < a.length ; i++) {
            System.out.println("a["+i+"]="+a[i]+", ");
        }
        int[] b =new int[20];

        for (int i = 0; i < b.length; i++) {
            b[i] = 5 * i + 3;
            System.out.print(b[i] + " ");
        }

        int[] c = new int [10] ;

    }
}
