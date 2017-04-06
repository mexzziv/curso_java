public class Vector{
  public static void main(String[] args) {
    int n = 10,mat=3;
    float prom_grup=0f,prom_alu=0f;
    String Alumnos[] = new String[n];
    float calificacion[][] = new float[n][mat];

    for(int i=0;i<Alumnos.length;i++){
      Alumnos[i]="ABC"+(int)(Math.random()*100);
      calificacion[i][0]=(int)(Math.random()*10);
      calificacion[i][1]=(int)(Math.random()*10);
      calificacion[i][2]=(calificacion[i][0]+calificacion[i][1])/2;
      prom_grup+=calificacion[i][2];
    }
    for(int i=0;i<Alumnos.length;i++){
      System.out.println("Codigo: "+Alumnos[i]);
        System.out.println("\tEsp: "+calificacion[i][0]+" | Mat: "+calificacion[i][1]+" | Promedio: "+calificacion[i][2]+"\n");
    }
    System.out.print("Promedio grupal: "+prom_grup/n);
  }
}
