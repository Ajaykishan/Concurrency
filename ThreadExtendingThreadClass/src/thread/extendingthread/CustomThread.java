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
public class CustomThread extends Thread {

    public static int totalThreads = 0;

    public CustomThread() {
        super();
    }

    @Override
    public void run() {
        while (CustomThread.totalThreads <= 10) {
            try {
                Thread.sleep(100);
                System.out.println("Experiment Thread" + (++CustomThread.totalThreads));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
