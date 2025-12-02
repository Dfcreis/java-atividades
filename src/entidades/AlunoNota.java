package entidades;

public class AlunoNota {
    public String name;
    public double nota1, nota2, nota3;

    public double SomaNota(){
        return  nota1+nota2+nota3;


    }
    public double Reprovacao(){
        if (SomaNota() < 60.0){
            return 60 - SomaNota();
        }else {
            return 0.0;
        }
    }
}
