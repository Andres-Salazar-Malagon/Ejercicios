import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Circulo1 extends JApplet {
  
  public void paint (Graphics g) {
    int x;
    int y;
    for(x=50; x<=100; x++){
      g.drawString (".", x, 50);
    }
    
  }

  public static void main (String[] args){
    JFrame frame = new JFrame ("Cargando JApplet");
    Circulo1 circulo1Applet = new Circulo1();
    circulo1Applet.init();
    frame.getContentPane().add(circulo1Applet);
    frame.setSize(200,200);
    frame.setVisible(true);
  }
}