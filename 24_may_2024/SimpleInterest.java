import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter Principal amount :: ");
            float p = s.nextFloat();

            System.out.print("Enter Rate of Interest in percentage :: ");
            float r = s.nextFloat();

            System.out.print("Enter Time in Years :: ");
            float t = s.nextFloat();

            float SI = (p * r * t) / 100;

            System.out.println("Simple Interest is :: " + SI);
        }
    }
}
