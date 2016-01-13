/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.deamonthread;

/**
 *
 * @author ajagurus
 */
public class CustomThread extends Thread {

    public CustomThread() {
        setDaemon(true);
    }

    @Override
    public void run() {
        System.out.println("Is this thread Daemon? - " + isDaemon());

    }

}
