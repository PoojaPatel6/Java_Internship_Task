interface A{
    void show();
}
// class B implements A{
//     public void a(){
//         public void show()
//         System.out.println("interfaces");

//     }
// }


public class New1 {
    public static void main(String[]args){
    // B obj = new B();
    // obj.show();
    A obj = new A(){

    public void show(){
        System.out.println("interfaces");
    }
    
};
obj.show();
}
}