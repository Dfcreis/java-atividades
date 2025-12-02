package entidades;

public class retanguloPoo {

    public double width, heigth;

    public double area(){
        return width * heigth;
    }
    public double perimetro(){
        return 2*(width+heigth);

    }
    public double diagonal(){
        return Math.sqrt(width * width + heigth * heigth);

    }
}
