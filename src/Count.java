import java.util.Scanner;

public class Count {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("请输入：");
        int number = in.nextInt();
        int count = 0;
        do {
            number = number/10;
            count++;
        }while (number>0);
        System.out.println("number的个数是："+count+"位");
    }
}
