/*
 * This program demonstrates creation of threads by implementing Runnable
 * 
 */
package thread.implementingrunnable;

/**
 *
 * @author ajagurus
 */
public class ThreadImplementingRunnable {

    public static void main(String[] args) {
        System.out.println("Starting Main Thread...");
        CustomThread threadObject = new CustomThread();
        Thread t = new Thread(threadObject);
        t.start();
        while (CustomThread.totalThreads <= 10) {
            try {
                System.out.println("Main Thread: " + (++CustomThread.totalThreads));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Exception in main thread" + e.getMessage());
            }
        }
        System.out.println("End of Main Thread");
    }

}
