package programa.Entidades;

import entidades.ContratoHora;
import entidades.Departamento;
import entities.Enum.NivelTrabalho;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalho {
    private String nome;
    private NivelTrabalho nivelTrabalho;
    private Double baseSalary;

    private Departamento departamento;
    private List<ContratoHora> contratoHoras = new ArrayList<>();

    public Trabalho() {
    }

    public Trabalho(String nome, NivelTrabalho nivelTrabalho, Double basesalary, Departamento departamento) {
        this.nome = nome;
        this.nivelTrabalho = nivelTrabalho;
        this.baseSalary = basesalary;
        this.departamento = departamento;
    }


    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<ContratoHora> getContratoHoras() {
        return contratoHoras;
    }


    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public NivelTrabalho getNivelTrabalho() {
        return nivelTrabalho;
    }

    public void setNivelTrabalho(NivelTrabalho nivelTrabalho) {
        this.nivelTrabalho = nivelTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void addContrat(ContratoHora contratoHora) {
        this.contratoHoras.add(contratoHora);
    }

    public void removeContrat(ContratoHora contratoHora) {
        this.contratoHoras.remove(contratoHora);
    }

    public double income(int year, int month) {
        double soma = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (ContratoHora c : contratoHoras) {
            cal.setTime(c.getData());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                soma += c.totalValue();
            }
        }
        return soma;
    }











}
