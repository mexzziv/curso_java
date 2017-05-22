import javax.swing.*;
import java.awt.*;

public class Layout{
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Paneles y Layout");
    ventana.setSize(500,500);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);

    GridLayout gl = new GridLayout(1,2);
    ventana.setLayout(gl);

    JPanel panel1 = new JPanel();
    GridLayout pg = new GridLayout(3,3);
    panel1.setLayout(pg);

    JPanel panel2 = new JPanel();
    BorderLayout pb = new BorderLayout();
    panel2.setLayout(pb);

    for(int i=0;i<9;i++){
      panel1.add(new JButton(String.valueOf(i)));
    }

    JButton norte = new JButton("Norte");
    JButton sur = new JButton("Sur");
    JButton este = new JButton("Este");
    JButton oeste = new JButton("Oeste");
    JButton centro = new JButton("Centro");

    panel2.add(norte, BorderLayout.NORTH);
    panel2.add(sur, BorderLayout.SOUTH);
    panel2.add(este, BorderLayout.EAST);
    panel2.add(oeste, BorderLayout.WEST);
    panel2.add(centro, BorderLayout.CENTER);

    ventana.add(panel1);
    ventana.add(panel2);
  }
}
