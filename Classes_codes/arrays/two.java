public class two {
    public static void main(String[] args) {
    
        Thread t1 = new Thread(() -> {
            System.out.println("First thread started");
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("First thread finished");
        });


        Thread t2 = new Thread(() -> {
            System.out.println("Second thread started");
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Second thread finished");
        });


        t1.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
    

