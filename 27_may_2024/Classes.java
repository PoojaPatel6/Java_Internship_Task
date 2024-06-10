// class Students{

// String name = "Ananya";
// String rolln= "1";
// String email = "anu@gmail.com";
// char a = '@';
// boolean b = true;
// float c = 4.5f;

// }



class Students{
   
    String name;
    int id;
    String email;

    // static String name;
//    static String email;

 


    public void display(){
       System.out.println(name +" "+ id + " "+ email); 
       
    }


}





public class Classes {
    public static void main(String[] args) {

        // Students s1 = new Students();
        // Students.name = "Deepika";
        // System.out.println(name);
       
    // int a,b,c;
// System.out.println();


      Students   s1 = new Students();
      Students   s2 = new Students();
      Students   s3 = new Students();
      Students   s4 = new Students();
      Students   s5 = new Students();
      
    
      s1.name = "Pooja";
      s1.id= 1;
    //   s1.email= "pooja@gmail.com";

      s2.name = "Divya";
      s2.id= 2;
      s2.email= "divi9@gmail.com";

      s3.name = "Nisha";
      s3.id= 3;
      s3.email= "nishu@gmail.com";

      s4.name = "Ashu";
      s4.id= 4;
      s4.email= "ashu@gmail.com";

      s5.name = "saumya";
      s5.id= 5;
      s5.email= "saumya@gmail.com";

   
      s1.display();
      s2.display();
      s3.display();
      s4.display();
      s5.display();


    }
}
