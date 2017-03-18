import java.util.Scanner;

public class Operador{
  public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    String dato;

    int numero1,numero2,total;

    System.out.print("Ingrese un numero => ");
    dato = leer.nextLine();
    numero1 = Integer.parseInt(dato);

    System.out.print("Ingrese otro numero =>");
    dato = leer.nextLine();
    numero2 = Integer.parseInt(dato);

    total = numero1+numero2;
    System.out.println("La suma es "+total);

    total = numero2-numero1;
    System.out.println("La resta es "+total);

    total = numero1*numero1;
    total = total*numero2;
    System.out.println("La multiplicacion es "+total);

    total = numero1/numero2;
    System.out.println("La division es "+total);
  }
}
