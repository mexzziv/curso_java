public class Switch{
  public static void main(String[] args) {
    /*
    switch(){
    case int char strint boolean:
      instrucciones;
      break;
    case int:
     instrucciones
     break;
    default:
     mensaje o instrucciones
  }*/
  int edad=50;
  switch(edad){
    case 18:
      System.out.print("Eres mayor de edad");
      break;
    case 30: case 40: case 50:
      System.out.print("Eres un adulto");
      break;
    case 60:
      System.out.print("Eres un viejo");
    default:
      System.out.print("No se ingreso la edad");
  }
  }
}
