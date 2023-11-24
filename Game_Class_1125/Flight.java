//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Game_Class;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Flight extends JComponent {
    BufferedImage img = null;
    int f_x = 0;
    int f_y = 0;

    public Flight() {
        try {
            img = ImageIO.read(new File("dog.jpeg"));
        } catch (IOException var3) {
            System.out.println("no image");
            System.exit(0);
        }
    }

    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();
        switch (keycode) {
            case KeyEvent.VK_UP -> {
                f_y -= 10;
                repaint();
                break;
            }
            case KeyEvent.VK_DOWN -> {
                f_y += 10;
                repaint();
                break;
            }
            case KeyEvent.VK_LEFT -> {
                f_x -= 10;
                repaint();
                break;
            }
            case KeyEvent.VK_RIGHT -> {
                f_x += 10;
                repaint();
                break;
            }
        }
    }
    public void draw(Graphics g){
        g.drawImage(img, f_x,f_y,null);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, this.f_x, this.f_y, null);
    }
}
