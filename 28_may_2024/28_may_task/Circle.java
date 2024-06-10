import java.util.Scanner;

class Circle {
     double radius;
     

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calArea() {
        return (double) (Math.PI * radius * radius);
    }

    public void displayArea() {
        System.out.println("Area of circle is: " + calArea());
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter radius of Circle: ");
        double radius = s1.nextDouble();

        Circle circle = new Circle(radius);
        circle.displayArea();

        s1.close();
    }
}
