package heranca.entidades;

public class FuncionarioTercerizado extends Funcionario {
    private Double addgastos;


   public FuncionarioTercerizado() {
       super();
   }
    public FuncionarioTercerizado(String nome, Integer horas,Double valorhoras,Double interestRate) {
        super(nome,horas,valorhoras);
        this.addgastos = interestRate;
    }

    public Double getAddgastos() {
        return addgastos;
    }

    public void setAddgastos(Double addgastos) {
        this.addgastos = addgastos;
    }
    @Override
    public double pagamento() {
        return super.pagamento() + addgastos * 1.1;
    }
}
