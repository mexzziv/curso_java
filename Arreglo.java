public class Arreglo{
  public static void main(String[] args) {
    int a=5,mat=3;
    float prom_gen= 0f;
    String Alumnos[] = new String[a];
    float calificaciones[][] = new float[a][mat];

    for(int i=0;i<Alumnos.length;i++){
      Alumnos[i] = "ABC"+(int)(Math.random()*100);
      calificaciones[i][0] = (int)(Math.random()*10);
      calificaciones[i][1] = (int)(Math.random()*10);
      calificaciones[i][2] = (calificaciones[i][0]+calificaciones[i][1])/2;
      prom_gen+=calificaciones[i][2];
    }

    for(int i=0;i<Alumnos.length;i++){
      System.out.println("Codigo: "+Alumnos[i]);
      System.out.println("\tEsp: "+calificaciones[i][0]+" |Mat: "+calificaciones[i][1]+" |Promedio: "+calificaciones[i][2]);
    }
    System.out.println("Promedio Grupal: "+prom_gen/a);
  }
}
