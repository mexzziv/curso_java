import javax.swing.*;

public class Ventana{
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Ventana en Java");
    ventana.setSize(400,400);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);

    JLabel label = new JLabel("Hola mundo",JLabel.CENTER);
    ventana.getContentPane().add(label);

  }
}
