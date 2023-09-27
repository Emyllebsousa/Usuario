import java.time.LocalDate;

public class Orcamento {
    String desc;
    Double valor;
    LocalDate data;
    public Orcamento(String desc, Double valor, LocalDate data){
     this.desc=desc;
     this.valor=valor;
     this.data=data;
    }
}
