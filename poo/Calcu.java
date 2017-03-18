import java.util.Scanner;

public class Calcu{
  static int Convertir(String dato){
    return (Integer.parseInt(dato));
  }
  public static void main(String[] args) {
    boolean menu=false;
    int x,y,opc;
    Scanner leer = new Scanner (System.in);
    String dato;
    Calculadora obj = new Calculadora();

    System.out.println("Calculadora");
    do{
      System.out.println("Opcion 1 => Sumar");
      System.out.println("Opcion 5 => Salir");
      dato = leer.nextLine();
      opc = Convertir(dato);
      switch(opc){
        case 1:
          System.out.println("Ingrese numero: ");
          dato = leer.nextLine();
          x = Convertir(dato);
          System.out.println("Ingrese numero: ");
          dato = leer.nextLine();
          y = Convertir(dato);
          System.out.println("La Suma es: "+obj.Sumar(x,y));
          break;
        case 5:
          menu = true;
          break;
        default:
          System.out.println("No existe esa opcion");
      }
    }while(menu==false);
    System.out.println("Gracias por utilizar la Calculadora");
  }
}
