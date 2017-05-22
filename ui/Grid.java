import javax.swing.*;
import java.awt.GridLayout;

public class Grid{
  public static void main(String[] args) {
    JFrame ventana = new JFrame("GridLayout");
    ventana.setSize(400,400);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);
    //Container cp = getContentPane();
    GridLayout gl = new GridLayout(4,3);
    gl.setHgap(10); gl.setVgap(20);
    ventana.setLayout(gl);
    for(int i = 1; i<= 9;i++){
      ventana.add(new JButton(String.valueOf(i)));
    }
    ventana.add(new JButton("*"));
    ventana.add(new JButton("0"));
    ventana.add(new JButton("#"));
  }
}
