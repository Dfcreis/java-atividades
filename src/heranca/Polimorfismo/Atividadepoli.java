package heranca.Polimorfismo;

import heranca.entidades.ImportProduct;
import heranca.entidades.Produto;
import heranca.entidades.UsedProduct;

import java.text.ParseException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Atividadepoli {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Produto> lista = new ArrayList<>();

        System.out.println("Informe a quantidade de produtos: ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Dados do produto: "+ i);
            System.out.print("comum, usado ou importado (c/u/i):");
            char tipo = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preco: ");
            double preco = sc.nextDouble();
            if (tipo == 'u') {
                System.out.print("Data de fabricacao (dd/MM/yyyy): ");
                LocalDate date = LocalDate.parse(sc.next(), fmt);
                lista.add(new UsedProduct(nome, preco, date));

            }else if (tipo == 'i'){
                System.out.println("Custo de freet");
                Double custo = sc.nextDouble();
                lista.add(new ImportProduct(nome, preco, custo));
            }
            else {
                lista.add(new Produto(nome, preco));
            }
        }
        System.out.println("Dados dos produtos: ");
        for (Produto produto : lista) {
            System.out.println(produto.precoetiqueta());
        }




        sc.close();
    }
}
