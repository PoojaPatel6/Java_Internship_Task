class Calculator1 {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
           
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator1 c1 = new Calculator1();

        int a = 20;
        int b = 5;

        System.out.println("Addition: " + c1.add(a, b));
        System.out.println("Subtraction: " + c1.sub(a, b));
        System.out.println("Multiplication: " + c1.mul(a, b));
        System.out.println("Division: " + c1.div(a, b));
    }
}
