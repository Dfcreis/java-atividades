package programa;

import programa.Entidades.retanguloPoo;

import java.util.Locale;
import java.util.Scanner;

public class retangulo {
    public static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        retanguloPoo retangulo = new retanguloPoo();
        System.out.println("Enter rectangle wildth and heigth:");
        retangulo.heigth = sc.nextDouble();
        retangulo.width = sc.nextDouble();
        System.out.printf("Area: %.2f%n",retangulo.area());
        System.out.printf("Perimetro: %.2f%n ",retangulo.perimetro());
        System.out.printf("Diagonal: %.2f%n",retangulo.diagonal());


        sc.close();
    }
}
