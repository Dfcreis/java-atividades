package entidades;

public class FuncList {
    private Integer id;
    private String nome;
    private Double salario;


    public FuncList(Integer id ,String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {return id;}

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}

    public Double getSalario(){return salario;}


    public void calcularSalario(Double porcentagem){
        salario += salario * porcentagem / 100.0;
    }
    public String toString(){
        return "Id: "
                + id +
                " Nome: "
                + nome +
                " Salario: "
                + String.format("%.2f",salario);
    }
}