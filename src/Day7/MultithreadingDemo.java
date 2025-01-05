package Day7;

import static java.lang.Thread.sleep;

class A extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();
        ob1.start();
        ob2.start();
    }
}
