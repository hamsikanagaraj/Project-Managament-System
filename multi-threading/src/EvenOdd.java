class Even extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

class Odd extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

public class EvenOdd
{
    public static void main(String[] args) {

        Even e = new Even();
        Odd o = new Odd();

        e.setName("Even");
        o.setName("Odd");

        e.start();
        o.start();
    }
}
