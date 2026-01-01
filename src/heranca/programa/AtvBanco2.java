package heranca.programa;





import heranca.entidades.ContaBanco;
import heranca.entidades.ContaPoupanca;
import heranca.entidades.conta;

public class AtvBanco2 {
    public static void main(String[] args) {
        conta acc1 = new conta(1001,"Alex",1000.0);
        acc1.saque(200.0);
        System.out.println("Saque realizado com sucesso: "+ acc1.getValor());


        conta acc2 = new ContaPoupanca(1002,"Maria",1000.0,0.01);
        acc2.saque(200.0);
        System.out.println("Saque conta poupanca: " + acc2.getValor());

        conta acc3 = new ContaBanco(1003,"Joao",1000.0,500.0);
        acc3.saque(200.0);
        System.out.println("Saque conta banco: " + acc3.getValor());





    }
}
