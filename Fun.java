public class Fun{
  static String Primo_numero(int x){
    int a=0,i;
    for(i=1;i<=x;i++){
      if(x%i==0){
        a++;
        System.out.println(a);
      }
    }
    if(a!=2){
      return " no es un numero primo";
    }
    else{
      return " si es un numero primo";
    }
  }
  public static void main(String[] args) {
    int n=23;
    String primo;

    primo = Primo_numero(n);

    System.out.print("El numero "+n+primo);
  }
}
