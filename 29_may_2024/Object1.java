class Adit {
    int x; // instance (Object) member variable
    int y; // instance (Object) member variable
   
    
    void fun1() { // instance (Object) member method
        System.out.println("fun1");
    }
    
    void fun2() { // instance (Object) member method
        System.out.println("fun2");
    }
}

class Object1 {
    public static void main(String[] args) {
        Adit m1 = new Adit();
        Adit m2 = new Adit();
        m1.x = 10; // assigning a value to x
        m2.y = 20; // assigning a value to y
        
        System.out.println("Hello");
        System.out.println("m1.x = " + m1.x); // accessing x
        System.out.println("m2.y = " + m2.y); // accessing y
        
    }
}
