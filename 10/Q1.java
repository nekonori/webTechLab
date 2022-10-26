class Log {
    public static void log(Object o) {
        System.out.println(o);
    }
}

class Hello implements Runnable {
    public void run() {
        while (true) {
            try {
                Log.log("Hello!");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Mask implements Runnable {
    public void run() {
        while (true) {
            try {
                Log.log("Wear Mask!");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Sanitizer implements Runnable {
    public void run() {
        while (true) {
            try {
                Log.log("Use Sanitizer!");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class Q1 {
    public static void main(String[] args) throws Exception {
        new Thread(new Hello()).start();
        new Thread(new Mask()).start();
        new Thread(new Sanitizer()).start();
    }
}
