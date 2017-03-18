import java.util.Scanner;

public class Sumar{
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String dato;
    int numero,veces,i=0,suma=0;

    System.out.println("Sumatoria de Numeros");
    System.out.print("Numero a sumar: ");
    dato = leer.nextLine();
    numero = Integer.parseInt(dato);

    System.out.print("Cuantas veces sumar el numero: ");
    dato = leer.nextLine();
    veces = Integer.parseInt(dato);

    while(++i<=veces){
      suma+=numero;
    }
    System.out.print("La suma es "+suma);
  }
}
