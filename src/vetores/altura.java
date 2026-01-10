package vetores;

import vetores.entidades.Pessoas;


import java.util.Locale;
import java.util.Scanner;

public class altura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int p = sc.nextInt();

        Pessoas[] pessoas = new Pessoas[p];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados das Pessoas ");
            System.out.println("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Idade: ");
            int idad = sc.nextInt();


            System.out.println("Altura: ");
            double alt = sc.nextDouble();


            pessoas[i]= new Pessoas(name,idad,alt);

        }
        double media = 0.00;
        for (int i = 0; i<pessoas.length;i++){
            media = media + pessoas[i].getAltura();
        }
        double soma = media / pessoas.length;
        System.out.printf("A media da alturas informadas e %.2f%n",soma);



        for (int i = 0; i<pessoas.length;i++){
            if (pessoas[i].getIdade() < 16){
                System.out.println("Pessoas menores de 16 anos:");
                System.out.println(pessoas[i].getNome());
            }
        }
            int menor16 = 0;
        for (int i = 0; i<pessoas.length;i++){
            if (pessoas[i].getIdade() < 16){
                menor16 ++;
            }
        }
            double porcentagem = (menor16 * 100.0) / pessoas.length;
        System.out.printf("A porcentagem de menores de 16 anos: %.1f%%%n",porcentagem);
        sc.close();
    }
}
