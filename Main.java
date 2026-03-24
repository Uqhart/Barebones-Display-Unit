public class Main {
    public static void main(String[] args) throws InterruptedException {
        Boot boot = new Boot();
        Thread.sleep(7000);
        new Desktop();
        boot.dispose();
    }
}