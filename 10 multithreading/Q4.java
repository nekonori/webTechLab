class Alpha implements Runnable {
    public synchronized void run() {
        for (char a = 'a'; a <= 'z'; a++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.print(a + " ");
        }
        System.out.println();
    }
}

class AlphaRev implements Runnable {
    Alpha al;

    AlphaRev(Alpha al) {
        this.al = al;
    }

    public void run() {
        synchronized (al) {
            for (char a = 'z'; a >= 'a'; a--) {
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
                System.out.print(a + " ");
            }
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        Alpha alpha = new Alpha();
        new Thread(alpha).start();
        new Thread(new AlphaRev(alpha)).start();
    }
}
