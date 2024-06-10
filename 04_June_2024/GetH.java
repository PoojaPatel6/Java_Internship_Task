
class blr{
    // String name ="Shreya";
    String name;
    int age;
    String city;

    // public String getName(){
        public String getName(){
        return name;
    }

    public void setAge(int a){
    //   age = a;
    age = 24;

    }

    public void setCity(String b){

        city= "Bengaluru";
    }
}





public class GetH {

    public static void main(String[] args) {
        blr b1 = new blr();
        b1.name = "Pooja";
        b1.setAge(25);
        b1.setCity("Bengaluru");
       
        System.out.println(b1.name);
        System.out.println(b1.age);
        System.out.println(b1.city);
    }
    
}
