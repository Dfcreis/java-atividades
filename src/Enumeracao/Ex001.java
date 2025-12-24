package Enumeracao;

import entidades.Order;
import entities.Enum.OrderStatus;

import java.util.Date;

public class Ex001 {
    public static void main(String[] args) {
    // https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
    Order order = new Order(1080,new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
    System.out.println(order);

    OrderStatus os1 = OrderStatus.ENTREGUE;
    OrderStatus os2 =OrderStatus.valueOf("ENTREGUE");
    System.out.println(os1);
    System.out.println(os2);



    }
}
