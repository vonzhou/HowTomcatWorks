package ex16.pyrmont.shutdownhook;

/**
 * Created by vonzhou on 2018/10/28.
 */
public class ShutdownHookDemo {
    public void start() {
        System.out.println("Demo");
        Runtime.getRuntime().addShutdownHook(new ShutdownHook());

    }

    public static void main(String[] args) {
        new ShutdownHookDemo().start();
        try {
            System.in.read();
        } catch (Exception e) {

        }
    }


    public static class ShutdownHook extends Thread {
        @Override
        public void run() {
            System.out.println("Shutting down");
        }
    }
}
