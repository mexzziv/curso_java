public class Hilo{
  public static void main(String[] args) {
    Thread hilo = new Thread();
    int i=0;
    hilo.start();

    System.out.println("Nombre del Hilo: "+hilo.getName());
    System.out.println("Nombre del Hilo: "+hilo.getPriority());

    try {
      System.out.println(hilo.getName()+" => "+i);
      i++;
      //hilo.sleep(1000);
      //if(i==10) hilo.stop();
    }catch( InterruptedException e ){}
  }
}
