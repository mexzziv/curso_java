import java.util.ArrayList;

public class Listas{
  public static void main(String[] args) {
    ArrayList<String> paises = new ArrayList<String>();

    paises.add("Alemania");
    paises.add("Irlanda");
    paises.add("Peru");
    paises.add("Turquia");
    paises.add("Zambia");

    System.out.println("La lsiat tiene "+paises.size()+" elementos");

    System.out.println("La lista es "+paises);

    paises.remove(2);
    paises.add("Puerto Rico");

    for(int i=0;i<paises.size();i++){
      System.out.println("Pais: "+paises.get(i));
    }

    paises.clear();

    if (paises.isEmpty()) System.out.println("La lista esta vacia");
  }
}
