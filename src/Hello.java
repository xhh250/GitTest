import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        int foot;
        int inch;
        Scanner in = new Scanner(System.in);
        foot = in.nextInt();
        inch = in.nextInt();
        System.out.println((foot+inch/12.0)*0.3048);

    }
}
