import java.util.Scanner;

public class Aprobado{
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String dato = "";

    System.out.println("Aprobado");
    System.out.print("Ingrese la calificacion: ");
    dato = leer.nextLine();

    switch(dato){
      case "0": case "1": case "2": case "3": case "4": case "5":
        System.out.println("Reprobado");
        break;
      case "6":
        System.out.println("Alcanzas pasar ");
        break;
      case "10":
        System.out.println("Excelente");
        break;
      default:
        System.out.print("No hay datos a mostrar");
    }
  }
}
