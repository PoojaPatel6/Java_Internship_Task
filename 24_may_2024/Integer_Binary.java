import java.util.Scanner;

class Integer_Binary {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in); 
          System.out.print("Enter any number: ");
          int num = s.nextInt();

          String b = Integer.toBinaryString(num);
          System.out.println("Convert Integer to Binary: " + num + " -> " + b);
        
        

        s.close();
    }
}
