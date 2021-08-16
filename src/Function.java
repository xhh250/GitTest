public class Function {
    public static void sum(int a,int b){
        int sum = 0;
        for(int i=a;i<=b;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        sum(1,10);
        sum(20,30);
        sum(35,45);
    }
}
