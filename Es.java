
import java.util.Scanner;

public class Es {
  public static void main(String[] args) {

    String dato,dato2;
    Scanner leer = new Scanner (System.in);

    System.out.print("Ingrese un dato => ");
    dato = leer.nextLine ();

    System.out.print("Ingrese otro dato => ");
    dato2 = leer.nextLine();

    System.out.println("El dato es = "+dato);
    System.out.println("El otro dato es ="+dato2);
  }
}
