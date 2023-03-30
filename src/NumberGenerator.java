public class NumberGenerator implements Runnable {
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public synchronized void run() {
        try {
            System.out.println("Priority of thread " + this.name + " is: " + Thread.currentThread().getPriority());
            for (int i = 0; i < 10; i++) {
                System.out.println(this.name + " at " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(this.name + " is interrupted");
            throw new RuntimeException(e);
        }
        System.out.println("Thread for " + this.name + " is ending");
    }
}
