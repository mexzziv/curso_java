public class Hilo{
  public static void main(String[] args) {
    Thread hilo = new Thread();
    Thread hilo2 = new Thread();
    Thread hilo3 = new Thread();

    hilo.start();
    hilo2.start();
    hilo3.start();

    System.out.println("Nomber de nuestro hilo: "+hilo.getName());
    for(int i=1;i<=10;i++){
      try{
        System.out.println(hilo.getName()+ " => "+i);
        hilo.sleep(1000);
        if(i==5){
          for(int j=1;j<=5;j++){
            System.out.println("\t"+hilo2.getName()+ " => "+j);
            hilo2.sleep(100);
            if(j==3){
              for(int k=1;k<=10;k++){
                System.out.println("\t\t"+hilo3.getName()+ " => "+k);
                hilo3.sleep(1000);
              }
            }
          }
        }
      }catch(InterruptedException e){
        System.out.println("El error es el siguiente => "+e);
      }
    }
  }
}
