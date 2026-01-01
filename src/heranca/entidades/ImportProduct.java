package heranca.entidades;

public class ImportProduct extends Produto{
    private Double customfree;


    public ImportProduct(){
        super();
    }
    public ImportProduct(String nome,Double preco, Double customfree){
        super(nome,preco);
        this.customfree=customfree;
    }

    public Double getCustomfree() {
        return customfree;
    }

    public void setCustomfree(Double customfree) {
        this.customfree = customfree;
    }




    public Double totalPreco(){
        return getPreco()+customfree;
    }
    @Override
   public final String precoetiqueta(){
        return totalPreco()+" Custo do freete ( $ "+customfree+")";
    }







}
