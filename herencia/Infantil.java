public class Infantil extends Libro{
  public String genero;
  public int edad;

  public Infantil(String titulo,int pag,String autor,String genero,int edad){
    super(titulo,pag,autor);
    this.genero = genero;
    this.edad = edad;
  }

  public String getGenero(){
    return ("Genero: "+genero);
  }
  public int getEdad(){
    return edad;
  }
}
