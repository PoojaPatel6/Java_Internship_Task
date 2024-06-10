public class ComplexNumbers {
    
    public static void main(String[] args) {
        int a=15;
        int b =2;
        int c=10;
        int d=6;
        String e = a + " + " + b + "i";
        String f = c + " + " + d+ "i";

        int real = a + c;
        int img = b + d;  // img means imaginiary 
        String sum = real + " + " + img + "i";
        
        System.out.println("Complex number e: " + e);
        System.out.println("Complex number f: " + f);
        System.out.println("Sum of e and f: " + sum);
    }
}
