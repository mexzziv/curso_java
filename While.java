public class While{
  public static void main(String[] args) {
    /*
    while(condicion){
    instrucciones
  }
    do{

  }while(condicion);*/
  System.out.println("Tablas de Multiplicar");
  int n=5,i=0,r=0;
  while(i<=10){
    r = i * n;
    System.out.println(i+"*"+n+"="+r);
    i++;
  }
  i = 0;
  do{
    r = i * n;
    System.out.println(i+"*"+n+"="+r);
    i++;
  }while(i<=10);
  }
}
