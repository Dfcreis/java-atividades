package heranca.entidades;

public class ContaBanco extends conta{

    private Double loanLimit;


    public ContaBanco(){
        super();
    }
    public ContaBanco(Integer numero, String titular,Double valor,Double loanLimit){
        super(numero,titular,valor);
        this.loanLimit = loanLimit;
    }


    public Double getLoanLimit() {
        return loanLimit;
    }
    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void emprestimo(Double amount){
        if (amount <= loanLimit){
        valor += amount - 10.0;
        }
    }
@Override
public void saque(Double amount){
        super.saque(amount);
        valor -= 2.0;
}




}
