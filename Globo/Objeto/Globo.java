package objeto;
import java.awt.*;

public class Globo{
 private int diametro;
 private int xCoord, yCoord;
 public Globo (int diametroInicial, int xInicial, int
yInicial) {
 diametro = diametroInicial;
 xCoord = xInicial;
 yCoord = yInicial;
 }
 public void cambiarTamaño (int cambio) {
 diametro = diametro + cambio;
 }
 
 public void mostrar (Graphics g) {
 g.setcolor(colo.black)
 g.drawOval (xCoord, yCoord, diametro, diametro);
 }
 public void mostrar2 (Graphics g){
 g.setcolor(colo.white)
 g.drawOval (xCoord, yCoord, diametro, diametro);
 }
}