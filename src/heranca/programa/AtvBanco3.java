package heranca.programa;

import heranca.entidades.ContaPoupanca;
import heranca.entidades.conta;

public class AtvBanco3 {

    public static void main(String[] args) {
                           //Polimorfismo

        conta x = new conta(1020,"Alex",1000.00);
        conta y = new ContaPoupanca(1023,"maria",1000.0,0.01);

        x.saque(50.0);
        y.saque(50.0);

        System.out.println(x.getValor());
        System.out.println(y.getValor());


    }
}
