abstract class adit{

    public abstract void patna();

public void blr(){
        System.out.println("NSTI Bengaluru");
    }

    // public void dehradun(){
    //     System.out.println("Dehradun");
    // }
    // pubic void allahabad(){
    //     System.out.println("Allahabad");
    // }
}

class nsti extends adit{
    public void patna(){

    }
}

public class Interf1 {

    public static void main(String[] args) {
        
    
     adit a = new nsti();
    // a.patna();
    // a.blr();
}
}
