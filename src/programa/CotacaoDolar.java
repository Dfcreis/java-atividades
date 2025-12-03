package programa;

import entidades.Dolar;

import java.util.Locale;
import java.util.Scanner;

public class CotacaoDolar {
     static void main() {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);
         System.out.print("What is the dollar price? ");
         double dolar = sc.nextDouble();
         System.out.print("How many dollars will be bougth? ");
         double real = sc.nextDouble();
         System.out.printf("Amount to be paid in reais = %.2f%n", Dolar.CurrencyConverter(dolar,real));

        sc.close();
    }
}
