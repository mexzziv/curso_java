public class Fibo{
  static int Fibonacci(int x){
    if(x==0){
      return 0;
    }
    if(x==1){
      return 1;
    }
    else{
      return Fibonacci(x-1) + Fibonacci(x-2);
    }
  }
  public static void main(String[] args) {
    System.out.println("Susecion de Fibonacci");
    for(int i=0;i<=5;i++){
      System.out.println(Fibonacci(i));
    }
  }
}
