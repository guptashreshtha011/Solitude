public class three {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            public void run() {
                int s = 0;
                for (int i = 1; i <= 100; i++) {
                    s += i;
                }
                System.out.println("Sum is " + s);
            }
        });
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread finished after sum thread");
    }
}
