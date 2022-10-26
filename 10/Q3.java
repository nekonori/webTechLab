class First implements Runnable {
    public void run() {
        while (true) {
            try {
                int rand = (int) Math.round(Math.random() * (100 - 1));
                System.out.println("Random int: " + rand);
                new Thread(new Second(rand)).start();
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class Second implements Runnable {
    int num;

    Second(int n) {
        num = n;
    }

    public void run() {
        if (num % 2 == 0)
            System.out.println("Even, square of " + num + " = " + num * num);
        else
            new Thread(new Third(num)).start();
    }
}

class Third implements Runnable {
    int num;

    Third(int n) {
        num = n;
    }

    public void run() {
        System.out.println("Odd, " + num);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new First());
        t1.start();
    }
}
