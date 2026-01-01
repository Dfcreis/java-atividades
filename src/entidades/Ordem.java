package entidades;


import entities.Enum.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Ordem {
    private LocalDateTime data;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();

    public Ordem() {}
    public Ordem(LocalDateTime data, OrderStatus status) {
    this.data = data;
    this.status = status;
}
public LocalDateTime getData() {
        return data;
}
public void setData(LocalDateTime data) {
        this.data = data;
}
public OrderStatus getStatus() {
        return status;
}
public void setStatus(OrderStatus status) {
        this.status = status;
}
public List<OrderItem> getItems() {
        return items;
}


public void addItem(OrderItem item) {
        items.add(item);
}
public void removeItem(OrderItem item) {
        items.remove(item);
}


public Double total() {
        double total = 0.0;
        for (OrderItem item : items) {

        }
        return total;
}






}
