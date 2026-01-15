package Interface.programa;

import Interface.modelEntities.Contract;
import Interface.modelEntities.Installment;
import Interface.modelServices.ContractServices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero do contrato: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(),dtf);
        System.out.print("Valor do contrato: ");
        double valueContrato = sc.nextDouble();

        Contract obj = new Contract(number,date,valueContrato);

        System.out.print("Entre com numeros de parcelas");
        int numParcelas = sc.nextInt();

        ContractServices cs = new ContractServices(null);

        cs.processContract(obj,numParcelas);

        System.out.println("PARCELAS: ");
        for (Installment i : obj.getList()) {
            System.out.println(i);
        }






    }
}
