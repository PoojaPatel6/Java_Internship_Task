import java.util.Scanner;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

 

    public void greet() {
        System.out.println("Hello! " + name + " Your " + age + " is years");
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = s1.nextLine();

        System.out.print("Enter Your Age: ");
        int age = s1.nextInt();

        Person p1 = new Person(name, age);
        p1.greet();

        s1.close();
    }
}




