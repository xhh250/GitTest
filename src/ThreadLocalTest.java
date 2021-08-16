/**
 * @description:
 * @author: chenHui
 * @time: 2021/8/3 12:09
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        MyThread threadA = new MyThread();
        MyThread threadB = new MyThread();

        threadA.setName("A线程");
        threadB.setName("B线程");

        threadA.start();
//        threadB.start();
    }
}

class MyThread extends Thread {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            threadLocal.set(i);
            System.out.println(getName() + " threadLocal.get() = " + threadLocal.get());
        }
    }
}