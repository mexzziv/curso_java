import javax.swing.*;
import java.awt.*;

public class Me{
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Menu");
    ventana.setSize(600,300);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);

    JMenuBar barraMenu = new JMenuBar();
    ventana.setJMenuBar(barraMenu);

    JMenu menuArchivo = new JMenu();
    menuArchivo.setText("Archivo");
    menuArchivo.addSeparator();

    JMenu menuEdicion = new JMenu();
    menuEdicion.setText("Edicion");
    menuEdicion.addSeparator();

    JMenuItem menuItemNuevo = new JMenuItem();
    menuItemNuevo.setText("Nuevo");

  /*  JPopupMenu menuEmergente = new JPopupMenu();
    JMenuItem itemEmergente1 = new JMenuItem();
    itemEmergente1.setText("Opcion Emergente 1");
    menuEmergente.add(itemEmergente1);*/

    barraMenu.add(menuArchivo);
    barraMenu.add(menuEdicion);

    menuArchivo.add(menuItemNuevo);

    /*menuArchivo.add(menuItemNuevo);
    menuArchivo.add(itemEmergente1);*/

    menuEdicion.add("Pegar");
    menuEdicion.add("Copiar");

  }
}
