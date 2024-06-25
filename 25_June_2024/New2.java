
@FunctionalInterface
interface A {
    int add(int a, int b);
 // int sub(int a, int b);
}

public class New2 {
    public static void main(String[] args) {
        A obj = (int a, int b) -> a + b;
        A obj1 = (int a, int b) -> a - b;


 //          A obj = new A();
 //      public int add(int a, int b){
 //           return a+b;
// }


    //    public int sub(int a, int b){
    //       return a-b;
    // }
    // };

        int res = obj.add(10, 20);
        int res1 = obj1.add(20, 5);

        System.out.println(res);   // Output: 30
        System.out.println(res1);  // Output: 15
    }
}
