import java.util.Date;
import java.text.*;

public class Fecha{
  public static void main(String[] args) {
    DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
    Date date = new Date();
    String fec = fecha.format(date);
    System.out.println(fecha.format(date)); //2016/11/16 12:08:43
    System.out.println(fec);
  }
}
