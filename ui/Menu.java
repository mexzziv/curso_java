import javax.swing.*;
import java.awt.*;

public class Menu{
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Menu");
    ventana.setSize(600,300);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);

    JMenuBar barra = new JMenuBar();
    ventana.setJMenuBar(barra);

    JMenu menu = new JMenu();
    menu.setText("Archivo");
    menu.addSeparator();

    JMenu menu2 = new JMenu();
    menu2.setText("Edicion");
    menu2.addSeparator();

    JMenuItem item = new JMenuItem();
    item.setText("Nuevo");

    JMenuItem item2 = new JMenuItem();
    item2.setText("Eliminar");

    barra.add(menu);
    barra.add(menu2);

    menu.add(item);
    menu.add(item2);

    menu2.add("Copiar");
    menu2.add("Pegar");
  }
}
