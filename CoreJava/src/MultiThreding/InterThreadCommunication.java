package MultiThreding;

public class InterThreadCommunication {
    public static void main(String args[]) {
        Chicken chicken = new Chicken();      //Critical section common resource
        Producer p = new Producer(chicken);
        Consumer c = new Consumer(chicken);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
class Chicken
{
    private int eggNo;
    private boolean eggSetFalg=false;

    public synchronized void setEggNo(int eggNo) {
        while (eggSetFalg)
        {
            try {
                wait();
            }
            catch (Exception e)
            {

            }
        }
        this.eggNo = eggNo;
        eggSetFalg=true;
        notify();
        System.out.println("set egg No="+eggNo);
    }
    public synchronized int getEggNo()
    {
        while (!eggSetFalg)
        {
            try {
                wait();
            }
            catch (Exception e)
            {

            }
        }
        System.out.println("get egg no="+eggNo);
        eggSetFalg=false;
        notify();
        return eggNo;
    }
}
class Producer implements Runnable{
    Chicken chicken;
    @Override
    public void run() {
        int i=1;
        while (true)
        {
            chicken.setEggNo(i++);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {}
        }
    }

    public Producer(Chicken chicken) {
        this.chicken = chicken;
    }
}
class Consumer implements Runnable{
    Chicken chicken;
    @Override
    public void run() {
        int i;
        while(true) {
            i = chicken.getEggNo();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }

    public Consumer(Chicken chicken) {
        this.chicken = chicken;
    }
}
