package Excecao.Atividades;

import Excecao.model.Account;
import Excecao.model.SaqueExeption;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informacao da conta");
        System.out.print("Numero da conta: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome do titular: ");
        String holder = sc.nextLine();
        System.out.print("Saldo da conta: ");
        Double balance = sc.nextDouble();
        System.out.print("Informe o limite do saque: ");
        Double withdrawLimit = sc.nextDouble();
        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.print("Valor a ser sacado: ");
        Double saque = sc.nextDouble();

        try {
            account.withdraw(saque);
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Valor em conta :"+String.format("%.2f%n",account.getBalance()));
        }
        catch (SaqueExeption r) {
            System.out.println(r.getMessage());
        }
        finally {
            sc.close();
            System.out.println("Scanner fechado");
        }

    }
}
