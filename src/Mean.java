import java.util.Scanner;

public class Mean {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        number = in.nextInt();
        while (number!=-1){
            sum = sum+number;
            count++;
            number = in.nextInt();
        }
        if(count>0){
            System.out.println("平均数="+((double )sum/count));
        }
    }
}
