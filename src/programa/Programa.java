package programa;


import entidades.ContratoHora;
import entidades.Departamento;
import programa.Entidades.Trabalho;
import entities.Enum.NivelTrabalho;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);


    System.out.print("Enter departament's name: ");
    String departamentName = sc.nextLine();
    System.out.print("Enter work date: ");
    System.out.println("Name: ");
    String workName = sc.nextLine();
    System.out.print("Lavel: ");
    String workLavel = sc.nextLine();
    System.out.print("Base salary: ");
    double workBaseSalary = sc.nextDouble();
    Trabalho trabalho = new Trabalho(workName, NivelTrabalho.valueOf(workLavel),workBaseSalary,new Departamento(departamentName));

    System.out.println();
    System.out.println("How many contracts to this worker? ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
        System.out.println("Enter contract number: "+i+" Date");
        System.out.print("Date (dd/MM/yyyy): ");
        Date dontractDate = sdf.parse(sc.next());
        System.out.print("Value per hour: ");
        double valorHour = sc.nextDouble();
        System.out.print("Duration hours: ");
        int durationHours = sc.nextInt();
        ContratoHora contrato = new ContratoHora(dontractDate,valorHour,durationHours);
        trabalho.addContrat(contrato);
    }
    System.out.println();
    System.out.println("Enter month and year to calculate income(MM/yyyy): ");
    String monthAndYears = sc.next();
    int month =Integer.parseInt(monthAndYears.substring(0,2));
    int year =Integer.parseInt(monthAndYears.substring(3));
    System.out.println("Name: "+ trabalho.getNome());
    System.out.println("Departamento: "+ trabalho.getDepartamento().getNome());
    System.out.println("Income for"+ monthAndYears +":"+String.format("%.2f%n",trabalho.income(month,year)));



    sc.close();
}
}
