import javax.swing.*;
import java.awt.*;

public class Elementos{
  public static void main(String[] args) {

    String[] dato = {"ene","feb","mar"};

    JFrame ventana = new JFrame("Elementos");
    ventana.setSize(600,300);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setVisible(true);
    FlowLayout esquema = new FlowLayout();
    ventana.setLayout(esquema);

    JLabel lblEtiqueta = new JLabel("Etiqueta");
    ventana.add(lblEtiqueta);

    JTextField txtCajaDeTexto = new JTextField();
    txtCajaDeTexto.setText("Caja de texto");
    ventana.add(txtCajaDeTexto);
    txtCajaDeTexto.setColumns(10);

    JButton btnBotn = new JButton("Boton");
    btnBotn.addActionListener(this);
    ventana.add(btnBotn);

    JCheckBox chckbx = new JCheckBox("Seleccione");
    chckbx.setSelected(true);
    ventana.add(chckbx);

    JRadioButton rdbtn1 = new JRadioButton("RadioButton 1");
    ventana.add(rdbtn1);

    JRadioButton rdbtn2 = new JRadioButton("RadioButton 2");
    ventana.add(rdbtn2);

    ButtonGroup radioGroup = new ButtonGroup();
    radioGroup.add(rdbtn1);
    radioGroup.add(rdbtn2);

    JCheckBox chckbx1 = new JCheckBox("CheckBox 1 agrupado");
    ventana.add(chckbx1);

    JCheckBox chckbx2 = new JCheckBox("CheckBox 2 agrupado");
    ventana.add(chckbx2);

    ButtonGroup chkGroup = new ButtonGroup();
    chkGroup.add(chckbx1);
    chkGroup.add(chckbx2);

    JTextArea txtrAreaDeTexto = new JTextArea();
    txtrAreaDeTexto.setText("Area de texto, puedes ingresar todo lo que quieres");
    ventana.add(txtrAreaDeTexto);

    JPasswordField passwordField = new JPasswordField();
    passwordField.setText("password");
    ventana.add(passwordField);

    JProgressBar progressBar = new JProgressBar();
    progressBar.setValue(50);
    ventana.add(progressBar);

    JSlider slider = new JSlider();
    slider.setMinorTickSpacing(1);
    slider.setMajorTickSpacing(10);
    slider.setToolTipText("");
    slider.setPaintTicks(true);
    slider.setPaintLabels(true);
    ventana.add(slider);
  }

  public void actionPerformed(ActionEvent e)
	{
    System.out.print("Hacer click");
  }
}
