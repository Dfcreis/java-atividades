package entidades;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    // CONSTRUTORES
    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }
    public Conta (int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        deposit(depositoInicial);
    }
    // ENVELOPAMENTO
    public int getNumero() {
        return numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
// METODOS
    public void deposit(double valor) {
        saldo += valor;
    }
    public void saque(double valor) {
        saldo -= valor + 5;
    }
    //TEXTO
    public String texto(){
        return "Account "
                + numero
                + ", titular:"
                + titular
                + ", saldo: $"
                + String.format("%.2f", saldo);
    }






}
