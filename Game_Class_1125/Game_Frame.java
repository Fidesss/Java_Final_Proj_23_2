//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Game_Class;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Game_Frame extends JFrame {
    private int width = 600;
    private int height = 800;

    Game_Frame() {
        this.setSize(this.width, this.height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("비행기 게임");
        Dimension now_display = Toolkit.getDefaultToolkit().getScreenSize();
        int x_display = (int)(now_display.getWidth() / 2 - (double)(this.width / 2));
        int y_display = (int)(now_display.getHeight() / 2 - (double)(this.height / 2));
        this.add(new Ingame_Panel());
        this.setLocation(x_display, y_display);
        this.setVisible(true);
    }
}
