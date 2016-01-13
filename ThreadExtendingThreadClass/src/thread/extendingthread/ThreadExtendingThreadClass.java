/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.extendingthread;

/**
 *
 * @author ajagurus
 */
public class ThreadExtendingThreadClass {

    public static void main(String[] args) {
        System.out.println("Starting Main Thread...");
        CustomThread threadObject = new CustomThread();
        threadObject.start();
        while (CustomThread.totalThreads <= 10) {
            try {
                System.out.println("Main Thread: " + (++CustomThread.totalThreads));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in main thread: " + iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }

}
