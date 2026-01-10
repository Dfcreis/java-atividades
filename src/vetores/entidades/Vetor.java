package vetores.entidades;

public class Vetor {
    private String nome;
    private double preco;

    public Vetor(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double  preco){
        this.preco = preco;
    }



}
