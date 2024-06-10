import java.io.File;

public class GetFileSize {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
       
        String filePath = "abc.txt";

       
        File file = new File("abc.txt");

        
        if (file.exists()) {
          
            long fileSizeInBytes = file.length();
            System.out.println("File size in bytes: " + fileSizeInBytes);

            double fileSizeInKb = fileSizeInBytes / 1024.0;
            System.out.println("File size in kilobytes: " + fileSizeInKb);

            double fileSizeInMb = fileSizeInBytes / (1024.0 * 1024.0);
            System.out.println("File size in megabytes: " + fileSizeInMb);
        } else {
            System.out.println("File does not exist.");
        }
    }
}

