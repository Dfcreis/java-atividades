package Lista;

import entidades.FuncList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FuncionarioLista {
    public static void main(String[]agrs){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<FuncList> funci = new ArrayList<>();

        System.out.println("Ho many emplyees will be registered: ");
        int num = sc.nextInt();
        System.out.println();

        for (int i = 0 ; i < num ; i++){
            System.out.println();
            System.out.print("Funcionario " + (i+1) + ": ");
            System.out.println("Digite o Id do funcionario: ");
            Integer id = sc.nextInt();
            System.out.println("Digite o nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite o salario: ");
            Double salario = sc.nextDouble();

            FuncList func = new FuncList(id, nome, salario);

            funci.add(func);
        }
        System.out.println("Digite o id do funcionario que tera o salario almentado ");
        Integer idSalary = sc.nextInt();
        Integer posi = posicao(funci,idSalary);
        if (posi == null){
            System.out.println("Nenhum funcionario encontrado");
        } else {
            System.out.println("Informe a porcentagem de almento de salario:");
            Double aumento = sc.nextDouble();
            funci.get(posi).calcularSalario(aumento);

        }
        System.out.println();
        System.out.println("Lista de funcionarios: ");
        for (FuncList f : funci){
            System.out.println(f);
        }
        sc.close();
    }

     static Integer posicao (List<FuncList> funci, Integer id){
        for (int i = 0; i< funci.size(); i++ ){
            if (funci.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

}
