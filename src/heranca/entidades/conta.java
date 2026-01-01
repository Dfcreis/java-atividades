package heranca.entidades;

public class conta {
    private Integer numero;
    private String titular;
    protected Double valor;

    public conta (){}
    public conta (Integer numero, String titular, Double valor){
    this.numero = numero;
    this.titular = titular;
    this.valor = valor;
}

public Integer getNumero(){
        return this.numero;
}
public void setNumero(Integer numero){
        this.numero = numero;
}

public String getTitular(){
        return this.titular;
}
public void setTitular(String titular){
        this.titular = titular;
}

public Double getValor(){
        return this.valor;
}


public void saque(Double amount){
        valor -= amount + 5.0;
}
public void deposito(Double amount){
        valor += amount;
}

}
