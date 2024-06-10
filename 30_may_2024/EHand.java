

public class EHand {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
//DivideByZeroException

        int a = 76;
        int b = 0;
        String c = null;




 

        int d[] = {1,2,3};
        try{
            System.out.println(c.length());
            System.out.println(d[5]);
        }
        catch(Exception j){
            System.out.println("division by zero");

        }




    // int c = a+b;
    // System.out.println(c);



    try{
          // int c = a/b;
        System.out.println("This is try block 1");
        System.out.println("this is try block 2");
        System.out.println("This is Try Block");
      
    
    }



    catch(ArithmeticException i){

        System.out.println("Division By Zero Error");
    }
    catch(ArrayIndexOutOfBoundsException i){
        System.out.println("array error");


    }


    //    try{int c = a/b;} 
    //    catch(Exception x){
    //     System.out.println("Division by Zero Exception."+x);

    //    }
    //    System.out.println("hello");
    //    System.out.println("welcome");

     

 

        // try{
        // int d = a/b;
        // System.out.println(d);
        // System.out.println(d+ "Hello");

        // }
        // catch(Exception x){
        //     System.out.println("error");
        //     System.out.println("Hello");
        // }


    }

    
}
