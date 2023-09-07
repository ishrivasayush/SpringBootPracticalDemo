package MultiThreding;

public class MyThread {
    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        Thread2 thread2=new Thread2();
        Thread t1=new Thread(thread1);
        Thread t2=new Thread(thread2);
        t1.start();  // calls the run method of thread1
        t2.start();  // calls the run method of thread2

    }
}

class Thread1 implements Runnable{

    @Override
    public void run()
    {
        f1();
    }
    public void f1()
    {
        for (int i = 1; i <=100; i++) {
            System.out.println("i= "+i);
        }
    }
}
class Thread2 implements Runnable
{
    @Override
    public void run()
    {
        f2();
    }
    public void f2()
    {
        for (int j = 1; j <=100; j++) {
            System.out.println("j= "+j);
        }
    }
}
