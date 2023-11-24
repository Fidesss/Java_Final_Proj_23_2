////
//// Source code recreated from a .class file by IntelliJ IDEA
//// (powered by FernFlower decompiler)
////
//
//package Game_Class;
//
//import java.awt.Graphics;
//import java.awt.image.BufferedImage;
//import java.awt.image.ImageObserver;
//import java.io.File;
//import java.io.IOException;
//import javax.imageio.ImageIO;
//
//public class GraphicObject {
//    BufferedImage img = null;
//    int x = 0;
//    int y = 0;
//
//    public GraphicObject(String name) {
//        try {
//            this.img = ImageIO.read(new File(name));
//        } catch (IOException var3) {
//            System.out.println(var3.getMessage());
//            System.exit(0);
//        }
//
//    }
//
//    public void draw(Graphics g) {
//        g.drawImage(this.img, this.x, this.y, (ImageObserver)null);
//    }
//}
