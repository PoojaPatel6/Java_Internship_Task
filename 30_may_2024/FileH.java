import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;

@SuppressWarnings("unused")
public class FileH {

    public static void main(String[] args) {


         File a = new File("abc.txt");

         if(a.exists()){
            a.delete();
            System.out.println("File Deleted Successfully");

         }else{

            System.out.println("File not Found.");
         }









        // try{

        //     File a = new File("abc.txt");

        //     Scanner b = new Scanner(a);
        //    String data = b.nextLine();
        //    System.out.println(data);


        //     // while(b.hasNextLine()){
        //     //     String data = b.nextLine();
        //     //     System.out.println(data);
        //     // }
        // }
        // catch(Exception e){

        // }  
        
// try{
//         FileWriter a = new FileWriter("abc.txt");
//         a.write("wrriten by java");
//         a.close();
//         System.out.println("File wrriten successfully");

// }

// catch(Exception e ){

//     System.out.println("File can not be wrriten.");
// }





// File a = new File("C:\\Users\\adit\\Desktop\\JAVADSA1\\abc.txt");
// if(a.exists()){
//     // System.out.println("a.getName()");
//     System.out.println("file name is: "+a.getName());
//     System.out.println("Path is: "+ a.getAbsolutePath());
//     System.out.println("Parent is: "+a.getParent());
//     System.out.println("File Size is : "+ a.length() +"bytes");
//     System.out.println("File is Readable: "+a.canRead());
//     System.out.println("File is Writable: "+a.canWrite());

// }else{

//     System.out.println("file not found.");
// }





        // Creating a File
        
        // File a = new File("C:\\Users\\adit\\Desktop\\JAVADSA1\\abc.txt");
        // try{
            
        //     if(a.createNewFile())
        //     {
        //       System.out.println("Created Successfully");  
            
        //     }
        //     else{
        //         System.out.println("file already exist.");
        //     }
        // }
        // catch(Exception e){
        //     System.out.println("File not Created.");
        // }
      
    }
    
}
