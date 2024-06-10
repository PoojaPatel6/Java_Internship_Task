import java.util.Scanner;

class Distance {
    public double calDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the x-coordinate of the first point: ");
        double x1 = s1.nextDouble();

        System.out.print("Enter the y-coordinate of the first point: ");
        double y1 = s1.nextDouble();

        System.out.print("Enter the x-coordinate of the second point: ");
        double x2 = s1.nextDouble();

        System.out.print("Enter the y-coordinate of the second point: ");
        double y2 = s1.nextDouble();

        Distance d1 = new Distance();
        double res = d1.calDistance(x1, y1, x2, y2);

        System.out.println("distance between two points is: " + res);

        // scanner.close();
    }
}

