// import java.nio.File;
// import java.io.IOException;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myFile = new File("abcd.txt");
        if (myFile.delete()) {
            System.out.println("Deleted the file: " + myFile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}




//2nd Medhods

// public class DeleteFile {
//     public static void main(String[] args) {
//         try {
//             Files.deleteIfExists(Paths.get("filepath"));
//         } catch (NoSuchFileException e) {
//             System.out.println("No such file/directory exists");
//         } catch (DirectoryNotEmptyException e) {
//             System.out.println("Directory is not empty.");
//         } catch (IOException e) {
//             System.out.println("Invalid permissions.");
//         }
//         System.out.println("Deletion successful.");
//     }
// }
