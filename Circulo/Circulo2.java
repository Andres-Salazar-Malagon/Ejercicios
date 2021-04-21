import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Circulo2 extends JApplet {
  
  public void paint (Graphics g) {
    int i;
    int j;
    for(i=50; i<=i-1; i++){
      g.drawString (".", i, i);
    };
    
  }

  public static void main (String[] args){
    JFrame frame = new JFrame ("Cargando JApplet");
    Circulo2 circulo2Applet = new Circulo2();
    circulo2Applet.init();
    frame.getContentPane().add(circulo2Applet);
    frame.setSize(200,200);
    frame.setVisible(true);
  }
}