
enum students {
    
    POOJA,
    BULBUL,
    MAYANK,
    SUMIT; 
}

public class patna1 {
  

    @SuppressWarnings("static-access")   // to avoid warnings
    public static void main(String[] args) {
        

        // students obj[] = students.values();
        // System.out.println(obj);


        // for(int i=1;i<obj.length;i++){
        // // for(int i=0;i<=obj.length-1;i++){
        //     System.out.println(obj[i]);

        // }




     for(students s : students.values()){
        // System.out.println(s.ordinal()+1 +" "+s);
        System.out.println(s.name());
        System.out.println(s.toString());
        System.out.println(s.valueOf("MAYANK"));
        // System.out.println(s);

      
    }
}
    
}