package programa;

import entidades.SalarioPoo;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario {
    public static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SalarioPoo salario = new SalarioPoo();

        System.out.print("name: ");
        salario.name = sc.nextLine();

        System.out.print("Gross salary: ");
        salario.salario = sc.nextDouble();

        System.out.print("Tax:");
        salario.taxa = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n ",salario.name,salario.calcTaxa());

        System.out.println("which percentege to increase salary? ");
        salario.porcentagem = sc.nextDouble();
        System.out.printf("Updated data: %.2f%n",salario.calcPorcentagem());
    }
}
