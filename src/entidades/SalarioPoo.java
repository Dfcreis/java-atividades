package entidades;

public class SalarioPoo {
    public String name;
    public double salario, taxa, porcentagem;

    public double calcTaxa(){
    return salario - taxa;
    }
    public double calcPorcentagem(){
        return this.calcTaxa() *(1+porcentagem/100);
    }
}
