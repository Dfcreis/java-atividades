package heranca.programa;


import heranca.entidades.ContaBanco;

import heranca.entidades.ContaPoupanca;
import heranca.entidades.conta;

public class AtvBanco {

public static void main(String[] args) {

    conta conta = new conta(1001,"Alex",0.0);
    ContaBanco cb = new ContaBanco(1002, "Maria",0.0,500.0);
                            //upercasting
    conta acc1 = cb;
    conta acc2 = new ContaBanco(1003,"Bob",0.0,200.0);
    conta acc3 = new ContaPoupanca(1004,"Ana",0.0,0.01);
                            //Dowcasting
    ContaBanco acc4 = (ContaBanco) acc2;
    acc4.emprestimo(100.0);
    //ContaBanco acc5 = (ContaBanco) acc3;
    if (acc3 instanceof ContaBanco) {
        ContaBanco acc5 = (ContaBanco) acc3;
        acc5.emprestimo(100.0);
        System.out.println("Emprestimo");
    }
    if (acc3 instanceof ContaPoupanca) {
        ContaPoupanca acc5 = (ContaPoupanca) acc3;
        acc5.updateBalance();
        System.out.println("Updated");
    }















}
}
