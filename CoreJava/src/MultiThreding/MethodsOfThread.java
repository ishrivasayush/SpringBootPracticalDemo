package MultiThreding;

public class MethodsOfThread {
    public static void main(String[] args){
        //Anonymous class
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <=10 ; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("i= "+i+Thread.currentThread().getName());
                }
            }
        },"Teri Thread");

        //Anonymous class
        Thread thread2=new Thread(new Runnable(){
            public void run()
            {
                for (int j = 1; j <=10 ; j++) {
                    /*if (j==5)
                    {
                        throw  new ArithmeticException("You hi");
                    }
                    */
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("j= "+j+Thread.currentThread().getName());
                }
            }
        },"Meri Thread");

        thread1.start();
        thread2.start();

        //Reference of main thread object
        System.out.println(Thread.currentThread());

        // main Thread
        System.out.println(Thread.currentThread().getName());


    }
}

