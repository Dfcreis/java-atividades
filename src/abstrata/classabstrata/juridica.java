package abstrata.classabstrata;

public class juridica extends pessoa{

    private Integer numClt;


    public juridica() {
        super();
    }
    public juridica(String nome, Double rendaAnual,Integer numClt) {
        super(nome, rendaAnual);
        this.numClt = numClt;
    }

    public Integer getNumClt() {
        return numClt;
    }

    public void setNumClt(Integer numClt) {
        this.numClt = numClt;
    }

    @Override
    public Double tax(){
        double imposto;
        if (numClt > 10){
            imposto = rendaAnual * 0.14;
        } else {
            imposto = rendaAnual * 0.16;
        }
        return imposto;
    }
}
