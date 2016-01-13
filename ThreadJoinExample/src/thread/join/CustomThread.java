/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.join;

/**
 *
 * @author ajagurus
 */
public class CustomThread extends Thread {

    String threadName;

    CustomThread(String threadName) {
        super();
        this.threadName = threadName;
    }

    @Override
    public void run() {
        String threadName = this.threadName;
        System.out.println("Name of the Thread is " + threadName);
        try {
            if (threadName.equals("LongExecutingThread")) {
                Thread.sleep(1000 * 10);
            }
        } catch (InterruptedException e) {
            System.out.println("The Thread throwed the exception" + e);
            e.printStackTrace();
        }
        
    }

}
