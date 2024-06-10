import javax.security.auth.Subject;

class Student{
static int age = 20;
static String name ;


public void show(){
    // System.out.println(name);
    System.out.println(name+ ":"+ age);
}

}


//     int age = 31;     //Instance member varriable
//     String name = "Pooja";
//     public void show(){

//         System.out.println(name + " "+age);
        
//     }  

// }




// class Blr{
//     int age = 20;
//     String name = "Priya";
//     public void show(){

//         System.out.println(name + " "+age);
        
//     }  
// }



public class dirH{


    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        // int age = 30;

        // String name = "Pooja";
        

        // System.out.println(age);
        // System.out.println(name);
        
Student s1 = new Student();
s1.name = "Pooja";
// s1.name = "Prity";
// s1.name ="Riya";
Student s2 = new Student();
s2.name = "Priya";
Student s3 = new Student();
Student s4 = new Student();
Student s5 = new Student();
s4.name = "Alka";
s3.name = "Rekha";
s1.show();
// s2.show();
// s3.show();

// s4.show();
// s4.name ="Peter";
// s5.show();
}
}                                                                                                                                               