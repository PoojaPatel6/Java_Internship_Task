
abstract class Computer{


    public abstract void code();
        // System.out.println("Coading");
    // }
}
class Desktop extends Computer{
    public void code(){
        System.out.println("Coading");
    }
}
class Laptop{
    public void code(){
        System.out.println("Coading at ease...");
    }
}

class developer{
    public void appD(Computer com){
    com.code();


    }
}
public class interf3{
    public static void main(String[] args) {
        // Computer c = new Computer();
        // c.code();
        // Computer lap = new Laptop();
        Computer desk = new Desktop();
        desk.code();

  }
}








// interface  Computer{
// void code();
    
// }

// class Desktop implements Computer{
 

//     public void code(){
//         System.out.println("Coading at ease...");
//     }
// }

// class Laptop implements Computer{
//     public void code(){
//         System.out.println("coading");
//     }
    
    
// }
// class developer{
//     public void appD(Computer com){
//     com.code();


//     }
// }

// public class interf3 {
//     public static void main(String[] args) {
       
//         Computer lap = new Laptop();
//         Computer desk = new Desktop();
//         desk.code();

//   }
// }