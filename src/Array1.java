public class Array1 {
    public static void main(String[] args){
        int[] a = new int[10];
        a[0] = 5;
        int[] b = a;
        b[0] = 16;
        System.out.println(a[0]);
        System.out.println(a==b);

        int i = 5;
        int j = i;
        System.out.println(i==j);
        j = 6;
        System.out.println(i);
        System.out.println(j);
    }

}
