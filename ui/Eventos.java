import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Eventos{
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Eventos");
    ventana.setSize(300,150);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);

    FlowLayout esquema = new FlowLayout();
    ventana.setLayout(esquema);

    JButton boton1 = new JButton("Boton1");
    JButton boton2 = new JButton("Boton2");
    JButton boton3 = new JButton("Boton3");

    ventana.add(boton1);
    ventana.add(boton2);
    ventana.add(boton3);

    //Button btn = new Button("Boton");
      boton1.addActionListener(
       new ActionListener() {
       public void actionPerformed(ActionEvent e)
       {
         JOptionPane.showMessageDialog(null,"click","Mensaje",JOptionPane.WARNING_MESSAGE);
         System.out.print("Fui pulsado");
       }
     });

     boton2.addActionListener(
      new ActionListener() {
      public void actionPerformed(ActionEvent e)
      {
        JOptionPane.showConfirmDialog(null,"Opcion 1", "Opcion 2", JOptionPane.YES_NO_OPTION);
      }
    });

    boton3.addActionListener(
     new ActionListener() {
     public void actionPerformed(ActionEvent e)
     {
       JOptionPane.showMessageDialog(null,"click","Mensaje",JOptionPane.INFORMATION_MESSAGE);
       boton3.setText("Ya pulso el boton");
       boton3.setEnabled(false);
     }
   });
  }
}
