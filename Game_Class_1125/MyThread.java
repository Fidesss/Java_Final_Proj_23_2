package Game_Class;

import java.awt.event.KeyListener;

public class MyThread extends Thread {
    Flight flight;
    public void run() {
        while (true) {
            flight.repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
    }

}
