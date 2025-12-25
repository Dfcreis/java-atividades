package entidades;

import java.util.Date;

public class ContratoHora {

    private Date data;
    private Double valorHora;
    private Integer hora;

    public ContratoHora() {}
    public ContratoHora(Date data, Double valorHora, Integer hora){
        this.data = data;
        this.valorHora = valorHora;
        this.hora = hora;
    }

    public Date getData(){
        return this.data;
    }
    public void setData(Date data){
        this.data = data;
    }

    public Double getValorHora(){
        return this.valorHora;
    }
    public void setValorHora(Double valorHora){
        this.valorHora = valorHora;
    }

    public Integer getHora(){
        return this.hora;
    }
    public void setHora(Integer hora){
        this.hora = hora;
    }

    public double totalValue(){
        return valorHora*hora;
    }




}
