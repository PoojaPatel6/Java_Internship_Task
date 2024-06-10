
class math{

    public int add(int a, int b){

return a+b;



    }
}

// public int multi(int a, int b){
//     return a*b;
// }                                                                                           


public class Classes1 {
    public static void main(String[] args) {

        math a1 = new math();

        @SuppressWarnings("unused")
        int x = 4;
        @SuppressWarnings("unused")
        int y = 6;
       
       int z = a1.add(4,8);
       System.out.println(z);
    }
    
}
