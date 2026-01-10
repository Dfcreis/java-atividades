package programa;

import programa.Entidades.AlunoNota;

import java.util.Locale;
import java.util.Scanner;

public class Aluno {
    public static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        AlunoNota aluno = new AlunoNota();
        //informa o nome do aluno
        System.out.println("name");
        aluno.name = sc.nextLine();
        //informa a primeira nota do aluno
        System.out.println("Digite a primeira nota: ");
        aluno.nota1 = sc.nextDouble();
        // informa a segunda nota do aluno
        System.out.println("Digite a segunda nota: ");
        aluno.nota2 = sc.nextDouble();
        // informa a terceita nota do aluno
        System.out.println("Digite a terceira nota: ");
        aluno.nota3 = sc.nextDouble();
        //verifica a condição da nota do aluno
        if (aluno.SomaNota() >= 60){
            System.out.println("FINAL GRADE = "+aluno.SomaNota());
            System.out.println("PASS");
        } else {
            System.out.println("REPROVADO");
            System.out.println("FINAL GRADE = "+aluno.SomaNota());
            System.out.printf("Missing %.2f POINTS ",aluno.Reprovacao());
        }


    }
}
