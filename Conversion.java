import java.util.Scanner;

public class Conversion{
  public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    String dato;
    int total,numero;

    System.out.print("Ingrese un numero =>");
    dato = leer.nextLine();

    numero = Integer.parseInt(dato);

    total = numero + numero;

    System.out.print("la suma es = "+total);
  }
}
