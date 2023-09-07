package MultiThreding;

public class MyThread2 {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.start();
        b.start();
    }
}

class A extends Thread{
    @Override
    public void run() {
        f1();
    }
    public void f1()
    {
        for (int i = 1; i <=100; i++) {
            System.out.println("i= "+i);
        }
    }
}
class B extends Thread {
    @Override
    public void run() {
        f2();
    }

    public void f2() {
        for (int j = 1; j <= 100; j++) {
            System.out.println("j= " + j);
        }
    }
}