import java.time.LocalDate;

public class Receita {
    Double valor;
    String desc;
    String categoria;
    LocalDate data;
public Receita(Double valor, String desc, String categoria, LocalDate data){
    this.valor= valor;
    this.desc=desc;
    this.categoria=categoria;
    this.data=data;
}
}
