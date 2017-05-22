import javax.swing.*;
import java.awt.BorderLayout;

public class Border{
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Borderlayout");
    ventana.setSize(400,400);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);

    BorderLayout bl = new BorderLayout(5,10);

    JButton norte = new JButton("Norte");
    JButton sur = new JButton("Sur");
    JButton este = new JButton("Este");
    JButton oeste = new JButton("Oeste");
    JButton centro = new JButton("Centro");

    ventana.add(norte, BorderLayout.NORTH);
    ventana.add(sur, BorderLayout.SOUTH);
    ventana.add(este, BorderLayout.EAST);
    ventana.add(oeste, BorderLayout.WEST);
    ventana.add(centro, BorderLayout.CENTER);
  }
}
