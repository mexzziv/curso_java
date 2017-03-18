public class Libro{
  //Atributos
  public String titulo;
  public int pag;
  public String autor;

  //Constructor
  public Libro(String titulo,int pag,String autor){
    this.titulo=titulo;
    this.pag=pag;
    this.autor=autor;
  }

  //Metodos
  public String getTitulo(){
    return ("Titulo: "+titulo);
  }
  public int getPag(){
    return pag;
  }
  public String getAutor(){
    return ("Autor: "+autor);
  }
}
