import java.sql.SQLOutput;
import java.util.Scanner;

public class RectangularClass {
    public static void main(String[] args) {
        System.out.println("Enter Width: ");
        double width = new Scanner(System.in).nextDouble();
        System.out.println("Enter height: ");
        double height = new Scanner(System.in).nextDouble();
        Rectangle rectangle = new Rectangle(width, height);

        System.out.println(rectangle.disPlay());
        System.out.println("Area Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter Rectangle: " + rectangle.getPerimeter());
    }
}

