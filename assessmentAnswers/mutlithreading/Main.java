class Storage implements Runnable {

    int[] nums;
    int size;
    boolean valueSet = false;

    public void run() {
        nums = new int[1000];
        size = 0;
        Counter c = new Counter(this);
        Printer p = new Printer(this);
        new Thread(c).start();
        new Thread(p).start();
    }

    void add(int n) {
        nums[size++] = n;
        valueSet = true;
    }

    int get() {
        valueSet = false;
        return nums[size - 1];
    }
}

class Counter implements Runnable {
    Storage storage;
    int counter;

    Counter(Storage s) {
        counter = 0;
        storage = s;
    }

    public void run() {
        while (true) {
            try {
                synchronized (storage) {
                    if (storage.valueSet) {
                        storage.wait();
                    }
                    storage.add(counter++);
                    storage.notify();
                }
                Thread.sleep(250);
            } catch (Exception e) {

            }
        }
    }
}

class Printer implements Runnable {
    Storage storage;

    Printer(Storage s) {
        storage = s;
    }

    public void run() {
        while (true) {
            try {
                synchronized (storage) {
                    if (!storage.valueSet) {
                        storage.wait();
                    }
                    System.out.print(storage.get() + " ");
                    storage.notify();
                }
                Thread.sleep(250);
            } catch (Exception e) {
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        new Thread(new Storage()).start();
    }
}