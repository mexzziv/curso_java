import javax.swing.*;
import java.awt.*;

public class Elemento{
  public static void main(String[] args) {
    JFrame ventana = new JFrame("Elementos");
    ventana.setSize(600,300);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);
    FlowLayout esquema = new FlowLayout();
    ventana.setLayout(esquema);

    JLabel etiqueta = new JLabel("etiqueta");
    ventana.add(etiqueta);

    JButton boton = new JButton("boton");
    ventana.add(boton);

    JCheckBox cb = new JCheckBox("Seleccione");
    cb.setSelected(true);
    ventana.add(cb);

    JRadioButton rb1 = new JRadioButton("Radio 1");
    ventana.add(rb1);

    JRadioButton rb2 = new JRadioButton("Radio 2");
    ventana.add(rb2);

    ButtonGroup bg = new ButtonGroup();
    bg.add(rb1);
    bg.add(rb2);

    JTextArea ta = new JTextArea();
    ta.setText("Esta es uan area de texto");
    ventana.add(ta);

    JPasswordField pw = new JPasswordField();
    pw.setText("hola");
    ventana.add(pw);

    JProgressBar pb = new JProgressBar();
    pb.setValue(50);
    ventana.add(pb);

    JSlider s = new JSlider();
    s.setMinorTickSpacing(1);
    s.setMajorTickSpacing(10);
    s.setPaintTicks(true);
    ventana.add(s);
  }
}
