/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadlockexample;

/**
 *
 * @author ajagurus
 */
public class DeadLockExample {

    public static void main(String[] args) {
        // To be used in synchronized method, a variable should be declared as
        // final
        final String Resource1 = "paper";
        final String Resource2 = "pen";

        Thread t1 = new Thread(new Runnable() {

            public void run() {
                synchronized (Resource1) {
                    System.out.println("Thread t1 locked " + Resource1);
                    try {
                        Thread.sleep(1000 * 10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (Resource2) {
                        System.out.println("Thread t1 locked " + Resource2);
                        System.out.println("Perform Writing");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                synchronized (Resource2) {
                    System.out.println("Thread t2 locked " + Resource2);
                    try {
                        Thread.sleep(1000 * 10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (Resource1) {
                        System.out.println("Thread t2 locked " + Resource1);
                        System.out.println("Perform Writing");
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }

}
