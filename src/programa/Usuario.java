package programa;

import entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;


        System.out.print("Informe o numero da conta :");
        int numero = sc.nextInt();
        System.out.print("Informe o titular da conta :");
        sc.nextLine();
        String titular = sc.next();
        System.out.print("Ira fazer um deposito inicial s/n ?:");
        char resposta = sc.next().charAt(0);
        if  (resposta == 's') {
            System.out.print("Qual valor do deposito inicial ?");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero,titular,depositoInicial);
        }
        else{
            conta = new Conta(numero,titular);
        }
        System.out.println();
        System.out.println("Conta criada com sucesso");
        System.out.print(conta.texto());

        System.out.println();
        System.out.print("Informe o valor de deposito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposit(valorDeposito);
        System.out.println("Atualização da conta ");
        System.out.println(conta.texto());

        System.out.println();
        System.out.print("Informe o valor do saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Atualização da conta: ");
        System.out.println(conta.texto());

        sc.close();


    }
}
