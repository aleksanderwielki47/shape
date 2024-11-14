import java.util.Scanner;

abstract class Shape{
    abstract void calculateArea();
    abstract void calculatePerimeter();
}


class Circle extends Shape{

    @Override
    void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("The area is " + area);
    }

    @Override
    void calculatePerimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter is " + perimeter);
    }
}
class Triangle extends Shape{

    @Override
    void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter podstawe: ");
        double podstawa = sc.nextDouble();
        System.out.println("Enter wysokosc: ");
        double wysokosc = sc.nextDouble();
        double area = podstawa * wysokosc / 2;
        System.out.println("The area is " + area);
    }

    @Override
    void calculatePerimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bok a: ");
        double a = sc.nextDouble();
        System.out.println("Enter bok b: ");
        double b = sc.nextDouble();
        System.out.println("Enter bok c: ");
        double c = sc.nextDouble();
        double perimeter = a + b + c;
        System.out.println("The perimeter is " + perimeter);
    }
}









public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea();
        circle.calculatePerimeter();
        Triangle triangle = new Triangle();
        triangle.calculateArea();
        triangle.calculatePerimeter();

    }
}