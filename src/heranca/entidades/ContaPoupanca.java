package heranca.entidades;

public final class ContaPoupanca extends conta {

    private Double interestRate;


    public ContaPoupanca(){
        super();
    }
    public ContaPoupanca(Integer numero, String titular,Double valor, Double interestRate){
        super(numero,titular,valor);
        this.interestRate=interestRate;

    }
    public Double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        valor += valor * interestRate;
    }
    @Override
    public final void saque(Double amount){
        valor -= amount ;
    }
}
