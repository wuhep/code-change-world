package threadtest;

public class Sync {

    public static void main(String[] args) {

        //synchronized只是对同一个对象有锁定作用
        Sync sync = new Sync();

        Thread thread1 = new Thread(() -> sync.method("线程1"));
        thread1.start();
        Thread thread2 = new Thread(() -> sync.method("线程2"));
        thread2.start();

        //新对象不会加入锁
        new Sync().method("Main");
    }

/*    private synchronized void method(String s) {
        System.out.println(s + " 正在调用method ...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

    private void method(String s) {
        synchronized (this) {
            System.out.println(s + " 正在调用method ...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
