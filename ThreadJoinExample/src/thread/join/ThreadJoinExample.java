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
public class ThreadJoinExample {

    public static void main(String[] args) throws InterruptedException {
        CustomThread t1 = new CustomThread("LongExecutingThread");
        CustomThread t2 = new CustomThread("Shorter Thread");
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread1.join();
        thread2.start();
    }

}
