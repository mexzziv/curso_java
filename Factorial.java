import java.util.Scanner;
public class Factorial{
  public static void main(String[] args) {
    String dato="";
    Scanner leer = new Scanner(System.in);
    int numero=0,factorial=0;

    System.out.print("Ingrese un numero =>");
    dato = leer.nextLine();

    numero = Integer.parseInt(dato);
    factorial = numero;

    for(int i= numero-1;i>=1;i--){
      factorial *= i;
    }

    System.out.print("El factorial de "+numero+" es "+factorial);
  }
}
