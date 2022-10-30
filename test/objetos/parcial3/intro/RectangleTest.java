package objetos.parcial3.intro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testArea(){

        Rectangle rectangle = new Rectangle(10, 5);

        double area = rectangle.getArea();

        Assertions.assertEquals(50, area);
    }

    @Test
    public void testPerimeter(){

        Rectangle rectangle = new Rectangle(10, 5);

        double perimeter = rectangle.getPerimeter();

        Assertions.assertEquals(30, perimeter);
    }

}
