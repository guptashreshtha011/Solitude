class ABC extends Thread {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("R");
            i++;
        }
    }
}

class EF extends Thread {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("S");
            i++;
        }
    }
}

public class one {
    public static void main(String[] args) {
        ABC a1 = new ABC();
        EF a2 = new EF();
        a1.start();  
        a2.start();  
    }
}