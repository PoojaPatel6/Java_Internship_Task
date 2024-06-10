




class  Students{

    static String name;
    String a;

    

    public static void show(Students Students){

        System.out.println(Students.name);

        // System.out.println("this is static method");
        // System.out.println(name);
        // System.out.println(Cits.name);
       
    }
}



public class MethH {
    

    @SuppressWarnings("static-access")
    public static void main(String[] args) {

        Students a = new Students();
        // Students s1 = new Students();

        // s1.name ="Pooja";
        // Students s2 = new Students();
        // s2.name = "Sushma";
        // s1.show();
        // s2.show();

        Students Adit = new Students();

        Adit.name ="Pooja";
        Students Cts= new Students();
        Cts.name = "Sushma";

        Students Cits= new Students();
        Cits.name = "Alka";


        Cits.show(Adit);
        Adit.show(Cits);
        Cts.show(Cts);

    }
}
