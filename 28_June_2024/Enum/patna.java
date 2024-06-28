
enum students {
    
    POOJA,
    BULBUL,
    MAYANK,
    SUMIT; 

    public void show() {
        System.out.println(" Students is Studying");
    }
    public String display(){
        return "Studying";
    }

}

public class patna {
    public static void main(String[] args) {
        

        students obj = students.POOJA;
        System.out.println(obj);
        obj.show();
        System.out.println(obj.display());
    }
    
}
