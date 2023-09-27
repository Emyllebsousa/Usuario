import java.time.LocalDate;

public class Despesa {
    Double valor;
    String desc;
    String categoria;
    LocalDate data;
public Despesa(Double valor, String desc, String categoria, LocalDate data){
   this.valor=valor;
   this.desc=desc;
   this.categoria=categoria;
   this.data=data;
    }
}
