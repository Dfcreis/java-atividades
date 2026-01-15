package Interface.modelEntities;

import Interface.modelServices.Color;

public class Rectangle extends AbstractShape {
    Color color;
    private double width;
    private double height;

    public Rectangle (){
        super();
    }
    public Rectangle(double width, double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area()
    {
        return width * height;
    }
}
