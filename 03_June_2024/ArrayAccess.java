import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        
        int[] numbers = { 10, 20, 30, 40, 50 };

        Scanner s1 = new Scanner(System.in);

        try {
            System.out.print("Enter an index to access: ");
            int index = s1.nextInt();

            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array Index is out of bounds.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
      
            s1.close();
        }
    }
}

