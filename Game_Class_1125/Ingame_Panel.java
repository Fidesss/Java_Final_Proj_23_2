package Game_Class;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class Ingame_Panel extends JPanel implements KeyListener {
    Flight flight;

    Ingame_Panel() {
        super();
        this.addKeyListener(this);
        this.requestFocus();
        setFocusable(true);

        flight = new Flight();
    }


    public void keyPressed(KeyEvent event) {
        flight.keyPressed(event);
    }

    public void keyReleased(KeyEvent event) {
    }

    public void keyTyped(KeyEvent event) {
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(flight.img, flight.f_x, flight.f_y, null);
    }
}
