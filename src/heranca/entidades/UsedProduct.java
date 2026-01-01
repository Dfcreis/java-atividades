package heranca.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Produto {

    private LocalDate date;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String nome, double preco, LocalDate data) {
        super(nome, preco);
        this.date = data;
    }

    public LocalDate getData() {
        return date;
    }

    public void setData(LocalDate data) {
        this.date = data;
    }

    @Override
    public final String precoetiqueta() {
            return getNome()
                    + " (used) $ "
                    + String.format("%.2f",getPreco())
                    + " (Manufacture date: "
                    + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                    + ")";
    }
}