import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadSpecifiedFile {

  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter the file name: ");
    String fileName = s1.nextLine();

    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      System.err.println("Error: File not found: " + fileName);
    } catch (IOException e) {
      System.err.println("Error: An I/O error occurred while reading the file.");
    }
  }
}
