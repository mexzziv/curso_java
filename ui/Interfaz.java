import javax.swing.*;

public class Interfaz{
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Ventana en Java");
    ventana.setSize(400,400);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);

    JLabel label = new JLabel("Hola Mundo",JLabel.CENTER);
    ventana.getContentPane().add(label);

    JButton boton = new JButton("Entrar");
    ventana.getContentPane().add(boton);
  }
}
