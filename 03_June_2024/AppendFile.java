// import java.io.FileWriter;
// import java.io.IOException;

// public class AppendFile{

//     @SuppressWarnings("unused")
//     public static void main(String[] args) {
        
//         String filePath = "abc.txt";

//         String textToAppend = "This is new text to append";
// try{
//     FileWriter  writer = new FileWriter("C:\\Users\\adit\\Desktop\\Alltask\\03_June_Task1", true);

//     writer.write(textToAppend);
//     writer.close();
//     System.out.println("Text is Appended Successfully");

// }catch(IOException e){
//     System.out.println("Error Occured during appending the text: "+ e.getMessage());
// }

//     }
// }







import java.io.*;

public class AppendFile {
    public static void appendStrToFile(String fileName, String str) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
            out.write(str);
            out.close();
        } catch (IOException e) {
            System.out.println("Exception occurred: " + e);
        }
    }

    public static void main(String[] args) {
        String fileName = "abcd.txt";
        String str = "This is a file";
        appendStrToFile(fileName, str);
    }
}
