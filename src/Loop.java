import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        int balance = 0;
        int amount;

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("请投币：");
            amount = in.nextInt();
            balance = balance + amount;

            if (balance >= 10) {
                System.out.println("*************");
                System.out.println("找零：" + (balance - 10));
                balance = 0;
            }

        }
    }
}

