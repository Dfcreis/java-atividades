package Lista;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CaldartroAluno {
     public static void main(String[]args) {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);
         System.out.println("Quantos alunos serao cadastrados ?");
         int qtdAlunos = sc.nextInt();
         sc.nextLine();
         List<String> nomes = new ArrayList<>();


        for (int i = 0; i < qtdAlunos; i++) {

            System.out.println("Digite o nome do aluno: ");
            nomes.add(sc.nextLine());
            double[] notas = new double[3];



            for (int j = 0; j < notas.length; j++) {
                System.out.println("Digite a nota do aluno: ");
                notas[j] = sc.nextDouble();
            }

           double soma = 0.0;
            for (int j = 0; j < notas.length; j++) {
                soma += notas[j];
            }
            double media  = soma / notas.length;


            System.out.printf("Nome %s Media %.1f%n", nomes.get(i), media);
            System.out.println();
            if (media >= 6.0){
                System.out.println("Aluno aprovado");
            }
            else{
                System.out.println("Aluno reprovado");
            }

        }


         sc.close();
     }
}
