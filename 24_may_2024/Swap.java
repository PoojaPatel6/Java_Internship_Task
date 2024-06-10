import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Swapping Two Numbers\n");
            System.out.println("Enter value of A: ");

            int a = in.nextInt();
            System.out.println("Enter value of B: ");
            int b = in.nextInt();

            int c = a;
            a = b;
            b = c;
            System.out.println("Swapping done...");
            System.out.println("Value of A is: " + a);
            System.out.println("Value of B is: " + b);
        }
    }

}