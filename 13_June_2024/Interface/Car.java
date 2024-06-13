class papa{
    public void car(){
        System.out.println("Honda");
    }
}
class mummy{
    public void car(){
        System.out.println("BMW");
    }
}
class child extends papa{
    
}

public class Car {
   public static void main(String[] args) {
    papa p = new child();
    p.car();
 

   } 
}
