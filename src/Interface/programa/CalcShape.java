package Interface.programa;

import Interface.modelEntities.AbstractShape;
import Interface.modelEntities.Circle;
import Interface.modelEntities.Rectangle;
import Interface.modelServices.Color;

public class CalcShape {
    public static  void main (String [] args){

        AbstractShape circle = new Circle(2.0,Color.BLACK);
        AbstractShape rectangle = new Rectangle(3.0,4.0,Color.WHITE);

        System.out.println("Circle color: "+circle.getColor());
        System.out.println("Cricle area: "+circle.area());
        System.out.println("Rectangle color: "+rectangle.getColor());
        System.out.println("Rectangle area: "+rectangle.area());


    }
}
