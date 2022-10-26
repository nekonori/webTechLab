class MyThread implements Runnable {
    Thread t;
    int count = 0;

    MyThread(String name, int priority) {
        t = new Thread(this, name);
        if (priority > 5)
            t.setPriority(Thread.MAX_PRIORITY);
        else
            t.setPriority(priority);
        System.out.println(t.getName() + " started");
        t.start();
    }

    public void run() {
        try {
            if (t.getPriority() > 7)
                Thread.sleep(1000);
            System.out.println(t.getName() + " is alive?: " + t.isAlive());
            while (t.isAlive() && count != 5) {
                System.out.println(t.getName() + " counted to " + count);
                count++;
            }
        } catch (Exception e) {
        }
    }
}

public class Q2 {
    static void log(Object o) {
        System.out.print(o);
    }

    public static void main(String[] args) {
        new MyThread("Thread 5", 9);
        new MyThread("Thread 4", 8);
        new MyThread("Thread 3", 4);
        new MyThread("Thread 2", 3);
        new MyThread("Thread 1", 2);
    }
}
