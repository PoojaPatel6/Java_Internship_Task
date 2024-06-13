abstract class Car{

    abstract void start();
    public void ac(){
        System.out.println("Ac is On");
    }
    abstract void stop();
}
class maruti800 extends Car{
void start(){
    System.out.println("Car is Started...");

}
public void stop(){
    System.out.println("Car is Stop");
}
  
}


public class Interf2 {
    public static void main(String[] args) {
    //  Car c1 = new Car();
    Car c1 = new maruti800();
     c1.start();  
     c1.ac(); 
     c1.stop();
    }
}
