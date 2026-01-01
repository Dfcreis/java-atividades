package abistrata.programa;

import abistrata.classabistrata.fisica;
import abistrata.classabistrata.juridica;
import abistrata.classabistrata.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CalcImposto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<pessoa> lista = new ArrayList<>();


        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + "data:");
            System.out.print("Individual or company (i/c)?");
            Character c = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Anual income: ");
            double anual = sc.nextDouble();
            if (c == 'i') {
                System.out.println("Health expenditures: ");
                double saude = sc.nextDouble();
                lista.add(new fisica(name, anual, saude));
            } else if (c == 'c') {
                System.out.println("Number of employees: ");
                Integer num = sc.nextInt();
                lista.add(new juridica(name, anual, num));
            } else {
                System.out.println("Invalid input");
            }

        }
        System.out.println();
        System.out.println("Tax payers:");
        for (pessoa p : lista) {
            System.out.printf(p.getNome() + " $ "+String.format("%.2f%n", p.tax()));
        }
        double taxa = 0.0;
        for (pessoa p : lista) {
            taxa += p.tax();
        }
        System.out.println("Taxa: " + String.format("%.2f%n", taxa));
    }

}
