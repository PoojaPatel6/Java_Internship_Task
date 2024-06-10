import java.util.Scanner;

class Rectangles {

    double length;
    double breadth;
    public Rectangles(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public double calArea() {
        return length * breadth;
    }

    public void display() {
        System.out.println("Area of Rectangle is: " + calArea());
    }
}

public class Rectangle {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter Length of Rectangle: ");
        double len = s1.nextDouble();

        System.out.print("Enter Breadth of Rectangle: ");
        double breadth = s1.nextDouble();

      
        Rectangles r1 = new Rectangles(len, breadth);

      
        r1.display();

        s1.close();
    }
}
