class patna{

    int a;
    int b;

    public static  void add(){

        // System.out.println(a+b);
        // System.out.println("a+b = "+ (a+b));
      int c = 5+5;
     System.out.println("a+b= "+c);
   
    }
    
}

public class Meth{

    public static void main(String[]args) throws ClassNotFoundException{

        // class p1;
    //   Class p1 =   Class.forName("patna");
    //   System.out.println(p1);


patna p1 = new patna();
p1.a= 10;
p1.b = 20;

patna p2 = new patna();

p2.a = 5;
p2.b = 2;
p1.add();
p2.add();

    }


    
}