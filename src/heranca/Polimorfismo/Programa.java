package heranca.Polimorfismo;

import heranca.entidades.Funcionario;
import heranca.entidades.FuncionarioTercerizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Informe o numero de funcionarios: ");
        int numfunc = sc.nextInt();

    for (int i = 1; i <= numfunc; i++) {
        System.out.println("Dados do Funcionarios: "+i);
        System.out.print("Este funcionario e tercerizado(y/n): ");
        char ch = sc.next().charAt(0);
        System.out.print("Informe o nome do funcionario: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Informe a quantidade de horas: ");
        int horas = sc.nextInt();
        System.out.print("Informe o valor da hora: ");
        double valorHoras = sc.nextDouble();
        if (ch == 'y') {
            System.out.print("Adicional de gastos :");
            double gastos = sc.nextDouble();
            funcionarios.add(new FuncionarioTercerizado(nome, horas, valorHoras, gastos));
        }
        else  {
            Funcionario emp = new Funcionario(nome, horas, valorHoras);
            funcionarios.add(emp);
        }
    }
        System.out.println();
        System.out.println("Pagamentos");

        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + "- $"+f.pagamento());
        }
    sc.close();
    }
}
