public class Main {
    public static void main(String[] args) {
        NumberGenerator number1 = new NumberGenerator("Number Generator 01");
        NumberGenerator number2 = new NumberGenerator("Number Generator 02");
        Thread th1 = new Thread(number1);
        Thread th2 = new Thread(number2);
        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Hash code for Number 01 " + th1.hashCode());
        ;
        System.out.println("Hash code for Number 02 " + th2.hashCode());
        ;
        th1.start();
        th2.hashCode();
        th2.start();
    }
}
