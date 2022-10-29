class PC {
    int stocks = 0;

    static void log(Object o) {
        System.out.println(o);
    }

    synchronized void addStock(int s) {
        log(s + " stocks added, notifying...");
        stocks += s;
        notify();
    }

    synchronized void getStock(int s) {
        while (stocks < s) {
            log("Stocks available less than " + s + ", waiting...");
            try {
                wait();
            } catch (Exception e) {
            }
        }
        log("Stocks arrived, resuming execution");
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        PC pc = new PC();
        new Thread() {
            public void run() {
                pc.getStock(10);
            }
        }.start();
        new Thread() {
            public void run() {
                pc.addStock(12);
            }
        }.start();
    }
}