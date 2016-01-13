/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.deamonthread;

/**
 *
 * The Java Virtual Machine exits when the only threads running are all daemon
 * threads. Cannot call setDaemon(true); method using Runnable interface.
 */
public class DeamonThread {

    public static void main(String[] args) {
        CustomThread obj = new CustomThread();
        obj.start();
    }

}
