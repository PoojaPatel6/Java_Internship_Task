
class Adit{


    String name = "Pooja";
    private int age = 20;
    public int salary = 10000;

    public void blr(){
        //  System.out.println("Age is: " +age);
         System.out.println("Age is: " +(age*2));
    }

//     public void patna(){
//         System.out.println("These Student from Patna.");
//     } 

}
public class Interf {
    
    public static void main (String[]args){
Adit a = new Adit();
System.out.println(a.name);
// System.out.println(a.age);
a.blr();
    }

}
