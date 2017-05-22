import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Evento{
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Eventos");
    ventana.setSize(300,150);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);

    FlowLayout esquema = new FlowLayout();
    ventana.setLayout(esquema);

    JButton boton1 = new JButton("Boton 1");
    JButton boton2 = new JButton("Boton 2");
    JButton boton3 = new JButton("Boton 3");

    ventana.add(boton1);
    ventana.add(boton2);
    ventana.add(boton3);

    boton1.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent e){
          JOptionPane.showMessageDialog(null,"click","Mesaje",JOptionPane.WARNING_MESSAGE);
          System.out.print("Fui pulsado");
        }
      }
    );

    boton2.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent e){
          JOptionPane.showConfirmDialog(null,"Opcion 1","Mensaje",JOptionPane.YES_NO_OPTION);
        }
      }
    );

    boton3.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent e){
          boton3.setText("Ya se pulso el boton");
          boton3.setEnabled(false);
        }
      }
    );
  }
}
