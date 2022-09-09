import java.awt.*;
import java.util.Objects;

public class Circle extends Shape {

    private double radius;


    public Circle(Color color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius && getColor() == circle.getColor();
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
