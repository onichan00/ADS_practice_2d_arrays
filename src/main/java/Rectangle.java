import java.awt.*;
import java.util.Objects;

public class Rectangle extends Shape{

    double width, length;
    public Rectangle(Color color) {
        super(color);
    }

    public Rectangle(Color color, double width, double length) {
        super(color);

        this.width = width;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && length == rectangle.length && getColor() == rectangle.getColor();
    }

    @Override
    public double getArea() {
        return width * length;
    }
}
