public class Condicion{
  public static void main(String[] args) {
    /*if
    if(Condicion){
    instrucciones
  }
else{
instrucciones o bloque de instrucciones
}
    */
    int var1=10,var2=10;
    if(var1<var2){
      System.out.print("La variable 1 es menor que la variable 2");
    }
    if(var1>var2){
      System.out.print("La variable 1 es mayor que la variable 2");
    }
    else{
      System.out.print("No entre a ninguna de las condiciones anteriores");
      if(var1==var2){
        System.out.print("Las variables son iguales");
      }
    }
  }
}
