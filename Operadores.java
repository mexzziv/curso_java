import java.util.Scanner;

public class Operadores{
  public static void main(String[] args) {
    String num,num2;
    int total,a,b;
    Scanner leer = new Scanner (System.in);

    System.out.print("Ingrese un numero =>");
    num = leer.nextLine();

    System.out.print("Ingrese un numero =>");
    num2 = leer.nextLine();

    a = Integer.parseInt(num);
    b = Integer.parseInt(num2);

    total = a * b;

    System.out.print("El total es : "+total);
  }
}


/*
pedir 2 numeros de los cuales el primer numero los
vamos a sumar con el segundo

restar el segundo numero menos el primero

multiplicacion multiplicar primer numero por si mismo
y el resultado multiplicar por el segundo numero

divicion dividir el multiplicacion entre el primer numero
*/
