package Interface.modelEntities;

import Interface.modelServices.Color;

public class Circle extends AbstractShape{
    private double radius;

   public Circle (){
       super();
   }
    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }


    @Override
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }


}
