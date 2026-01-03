package abstrata.classabstrata;

public class fisica extends pessoa {
    private Double saude;

public fisica(){
    super();
}
    public fisica(String nome,Double rendaAnual,Double saude){
    super( nome,rendaAnual);
    this.saude = saude;
    }

    public Double getSaude() {
        return saude;
    }

    public void setSaude(Double saude) {
        this.saude = saude;
    }



    @Override
    public Double tax() {
        double imposto;

        if (rendaAnual < 20000.0) {
            imposto = rendaAnual * 0.15;
        } else {
            imposto = rendaAnual * 0.25;
        }

        imposto -= saude * 0.5;

        if (imposto < 0) {
            imposto = 0;
        }

        return imposto;

    }
}
