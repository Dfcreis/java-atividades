package programa;


import entidades.Ordem;
import entidades.OrderItem;
import entidades.Product;
import entities.Enum.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);


    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Informe dos dados do cliente :");
        System.out.print("Nome :");
        String nome = sc.nextLine();
        System.out.print("Email :");
        String email = sc.next();
        System.out.print("Data de nascimento :");
        LocalDate nascimento = LocalDate.parse(sc.next(), dtf);
        System.out.println();;
        System.out.println("Informe dos dados do pedido :");
        System.out.print("Status :");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.print("Quantos pedidos seram feitos ?");
        Integer pedidos = sc.nextInt();


        Ordem ordem = new Ordem(LocalDateTime.now(), status);

        for (int i = 0; i < pedidos; i++) {
            System.out.print("Nome do produto :");
            sc.nextLine();
            String produto = sc.nextLine();
            System.out.print("Preco do produto :");
            Double preco = sc.nextDouble();
            System.out.print("Quantidade do produto :");
            Integer quantidade = sc.nextInt();
            Product product = new Product(produto,preco);
            OrderItem itemorder = new OrderItem(quantidade,preco,product);
            ordem.addItem(itemorder);
        }
        System.out.println();
        System.out.println("Ordem Summary");
        System.out.println("momento do pedido: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println("Status do pedido:"+status);
        System.out.println("Cliente :"+ nome+" "+nascimento.format(dtf)+" "+email);
        System.out.println("Itens do pedido:");

        for (OrderItem item : ordem.getItems()) {

            System.out.println(
                    item.getProduct().getNome()
                            + ", R$ " + item.getPrice()
                            + ", Quantidade: " + item.getQuantity()
                            + " SubTotal: " + item.subTotal()
            );
        }
        double soma = 0.0;
        for (OrderItem item : ordem.getItems()) {
            soma += item.subTotal();
        }
        System.out.println("Total price "+soma);

    sc.close();
    }
}
